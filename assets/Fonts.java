package assets;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.io.File;
import exceptions.FontError;

public abstract class Fonts{
	public static void load() throws FontError{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/PressStart2P.ttf")));
		} catch (Exception e) {
		    throw new FontError("Arcade");
		}

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/pacfont.ttf")));
		} catch (Exception e) {
		    throw new FontError("PacMan");
		}
	}
}