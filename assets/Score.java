package assets;
import javax.swing.JLabel;
import java.awt.*;

public class Score extends JLabel{
	private static JLabel score;

	private Score(){
		setFont(new Font("Press Start 2P",Font.BOLD,25));
		setText("Score: " + GameSettings.getScore() + "\n");
		setForeground(Color.white);
	}

	public static JLabel addScore(){
		if(score == null)
			score = new Score();

		Score.updateJLabelScore();

		return score;
	}

	public static void updateJLabelScore(){
		Score.score.setText("Score: " + GameSettings.getScore())	;
	}
}