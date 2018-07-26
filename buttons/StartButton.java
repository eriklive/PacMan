package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import telas.*;

public class StartButton extends JButton{
	static JButton StartButton;

	private StartButton(){
		setText("Iniciar Jogo");

		addActionListener(new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	Janela.start();
	      	}
	    });
	}

	public static JButton addStartButton(){
		if(StartButton == null)
			return new StartButton();

		return StartButton; 

	}

}