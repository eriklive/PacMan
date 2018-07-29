package assets;
import javax.swing.JLabel;
import java.awt.*;

public class Score extends JLabel{
	// private static JLabel score;

	public Score(){
		this(10);
	}

	public Score(int tamanho){
		setFont(new Font("Press Start 2P",Font.BOLD,tamanho));
		setText("Score: " + GameSettings.getScore() + "\n");
		setForeground(Color.white);
		updateJLabelScore();
	}

	private void updateJLabelScore(){
		setText("Score: " + GameSettings.getScore())	;
	}
}