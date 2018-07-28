package assets;
import javax.swing.JLabel;
import java.awt.*;

public class Score extends JLabel{
	private static JLabel score;

	private Score(){
		setText("Score: " + GameSettings.getScore() + "\n");
        // score.setBounds( new Rectangle(0, 0, 300, 50) );
	}

	public static JLabel addScore(){
		if(score == null)
			score = new Score();

		return score;
	}
}