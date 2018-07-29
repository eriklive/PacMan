package buttons;
import javax.swing.JButton;
import java.awt.event.*;
import assets.GameSettings;
import telas.Game;

public class ChooseMapButton extends JButton{
	public ChooseMapButton(String texto, int mapa){
		setText(texto);
		addActionListener( actionListener(mapa) );
	}

	private ActionListener actionListener(int mapa){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	GameSettings.setMap(mapa);
	        	Game.setMap();
	      	}
	    };
	} 
}