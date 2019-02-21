package gamecomponents;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Display {
	
	private JFrame frame; //the window everything goes in 
	private Canvas canvas; //get elements into JFrame, draw graphics to it
	
	private String title;
	private int width, height; //in pixels
	
	public Display (String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		
		createDisplay();
	}
	
	
	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this always makes sure game closes properly
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();	
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height)); //This ensures a max height
		canvas.setMinimumSize(new Dimension(width, height)); //This ensures a minimum height
		
		frame.add(canvas);
		frame.pack(); //frame will resize canvas so you can see it fully
	}
	
	public Canvas getCanvas() {
		return canvas;
		
	}
	
}
