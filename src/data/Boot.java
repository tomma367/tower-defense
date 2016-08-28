package data;

import org.lwjgl.opengl.Display;

import static helpers.Artist.*;

public class Boot {
		
	public Boot() {
		
		BeginSession ();
		
		while(!Display.isCloseRequested()) {

			DrawQuad(50, 50, 100, 100);
			DrawQuad(150, 150, 100, 100);
			
			Display.update();
			Display.sync(60);
			
		}
	}
	
	public static void main(String[] args) {
		new Boot();
	}

}
