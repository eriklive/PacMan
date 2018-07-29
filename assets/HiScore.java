package assets;
import javax.swing.JLabel;
import java.awt.*;

public class HiScore extends JLabel{
	private static JLabel hiscore;

	private HiScore(){
		setFont(new Font("Press Start 2P",Font.BOLD,25));
		setText("HiScore: " + GameSettings.getHiScore() + "\n");
		setForeground(Color.white);
	}

	public static JLabel addHiScore(){
		if(hiscore == null)
			hiscore = new HiScore();

		HiScore.updateJLabelHiScore();
		
		return hiscore;
	}

	public static void updateJLabelHiScore(){
		HiScore.hiscore.setText("HiScore: " + GameSettings.getHiScore())	;
	}
}