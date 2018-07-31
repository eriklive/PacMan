package textos;
import javax.swing.JLabel;
import java.awt.*;
import assets.GameSettings;

public class HiScore extends JLabel{
	private static JLabel hiscore;

	private HiScore(){
		this.setFont(new Font("Press Start 2P",Font.BOLD,12));
		this.setText("HiScore: " + GameSettings.getHiScore() + "\n");
		this.setForeground(Color.white);
	}

	public static JLabel addScore(){
		if(hiscore == null)
			hiscore = new HiScore();

		HiScore.updateJLabelScore();
		
		return hiscore;
	}

	public static void updateJLabelScore(){
		HiScore.hiscore.setText("HiScore: " + GameSettings.getHiScore())	;
	}
}