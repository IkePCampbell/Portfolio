package gamecomponents;

public class Game {
	/* This will hold all code regarding the game itself.
	 * AKA main method in Pygame. 
	 */
	private Display display;
	
	public int width,height;
	
	public Game(String title, int width,int  height) {
		this.width = width;
		this.height = height;
		display = new Display(title, width, height);
	}

}
