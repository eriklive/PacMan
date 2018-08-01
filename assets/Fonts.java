package assets;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.io.File;
import exceptions.FontException;

public abstract class Fonts{
	public static void load() throws FontException{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/PressStart2P.ttf")));
		} catch (Exception e) {
		    throw new FontException("Arcade");
		}

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/pacfont.ttf")));
		} catch (Exception e) {
		    throw new FontException("PacMan");
		}
	}
}