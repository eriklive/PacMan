package assets;
import javax.swing.JLabel;
import java.awt.*;

public class HiScore extends JLabel{
	private static JLabel hiscore;

	private HiScore(){
		setText("HiScore: " + GameSettings.getHiScore() + "\n");
        // score.setBounds( new Rectangle(0, 0, 300, 50) );
	}

	public static JLabel addHiScore(){
		if(hiscore == null)
			hiscore = new HiScore();

		return hiscore;
	}
}