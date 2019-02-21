package gamecomponents;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {
	/* This will hold all code regarding the game itself.
	 * AKA main method in Pygame. 
	 */
	private Display display;
	public String title;
	public int width,height;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;

	public Game(String title, int width,int  height) {
		this.width = width;
		this.height = height;
	}
	
	private void init() {
		//Initialize graphics for our game
		display = new Display(title, width, height);
		Assets.init();
	}
	
	private void update() {
		
	}
	
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null) { //canvas doesnt have a buffer strategy
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		
		g = bs.getDrawGraphics(); //create "brush"
		//clear the screen 
		g.clearRect(0, 0, width, height);
		//Everything gets drawn from here
		g.drawImage(Assets.health,10,10,null);
		
		//To here
		bs.show(); //you need these 2 lines of code. This draws
		g.dispose();
		
		
	}
	public void run() {
		/*
		 * Anytime we implement Runnable we have to call this so our class runs on a thread.
		 * Majority of game code is going to be here
		 */
		init();
		
		int fps = 60;
		double timePerTick = 1000000000/ fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		//long timer = 0;
		//int ticks = 0;
		
		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			//timer += now - lastTime;
			lastTime = now;
			System.out.println(delta);
			if (delta >= 1) {
				update();
				render();
				//ticks++;
				delta --;
			}	
			//if (timer >= 1000000000){
				//System.out.println("Ticks and Frames: " + ticks);
				//ticks = 0;
				//timer = 0;
			//}
		}
		stop(); // stop our thread just in case it hasnt been stopped already	
	}
	
	public synchronized void start() {
		if(running) //already checks to see if the game is running, if it is return nothing
			return;
		running = true;
		thread = new Thread(this);
		thread.start(); //this calls our public void run() method
		
	}
	public synchronized void stop() {
		if(!running) //same thing as in the start method
			return;
		try {
			thread.join(); //closes down thread properly
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
