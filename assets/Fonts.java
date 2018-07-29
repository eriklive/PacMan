package assets;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.io.File;

public abstract class Fonts{
	public static void load(){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("PressStart2P.ttf")));
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("pacfont.ttf")));
		} catch (Exception e) {
		    System.out.println("Font not loaded: " + e);
		}
	}
}