package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;
import telas.*;

public class StartButton extends JButton{
	private static JButton startButton;

	private StartButton(){
		setFont(new Font("Press Start 2P",Font.BOLD,25));
		setForeground(Color.BLACK);
		setText("Iniciar Jogo");

		addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.start();
	      	}
	    });
	}

	public static JButton addStartButton(){
		if(startButton == null)
			startButton = new StartButton();

		return startButton; 
	}
}