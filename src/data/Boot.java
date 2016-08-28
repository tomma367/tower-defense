package data;

import static helpers.Artist.*;

import org.lwjgl.opengl.Display;

public class Boot {
		
	public Boot() {
		
		BeginSession ();
		
		Tile tile = new Tile(0, 0, 64, 64, TileType.Grass);
		
		while(!Display.isCloseRequested()) {
			
			tile.Draw();
			
			Display.update();
			Display.sync(60);
			
		}
	}
	
	public static void main(String[] args) {
		new Boot();
	}

}
