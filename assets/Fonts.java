package assets;
import java.awt.GraphicsEnvironment;
import java.awt.Font;
import java.io.File;

public abstract class Fonts{
	public static void load(){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

		try {
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/PressStart2P.ttf")));
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("assets/fonts/pacfont.ttf")));
		} catch (Exception e) {
		    System.out.println("Não foi possível carregar a uma ou mais fontes: " + e);
		}
	}
}