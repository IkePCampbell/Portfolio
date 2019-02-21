package gamecomponents;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 128, height = 128;
	
	public static BufferedImage defence,attack,speed,mana,health;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		
		defence = sheet.crop(0,0, width, height);
		attack = sheet.crop(width, 0, width, height);
		speed = sheet.crop(0, height, width, height);
		mana = sheet.crop(width, height, width, height);
		health = sheet.crop(0, height*2, width, height);
		
		
		
	}

}
