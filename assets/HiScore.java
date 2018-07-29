package assets;
import javax.swing.JLabel;
import java.awt.*;

public class HiScore extends JLabel{
	private static JLabel hiscore;

	private HiScore(){
		setText("HiScore: " + GameSettings.getHiScore() + "\n");
		setForeground(Color.white);
	}

	public static JLabel addHiScore(){
		if(hiscore == null)
			hiscore = new HiScore();

		return hiscore;
	}
}