package textos;
import javax.swing.JLabel;
import java.awt.*;
import assets.GameSettings;

public class Score extends JLabel{
	private static JLabel score;

	private Score(){
		this.setFont(new Font("Press Start 2P",Font.BOLD, 15));
		this.setText("Score: " + GameSettings.getScore() + "\n");
		this.setForeground(Color.white);
	}

	public static JLabel addScore(){
		if(score == null)
			score = new Score();

		Score.updateJLabelScore();
		
		return score;
	}

	private static void updateJLabelScore(){
		Score.score.setText("Score: " + GameSettings.getScore())	;
	}
}