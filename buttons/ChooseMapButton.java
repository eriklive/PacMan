package buttons;
import java.awt.event.*;
import assets.GameSettings;
import telas.Game;

public class ChooseMapButton extends Button{
	int mapa;
	
	public ChooseMapButton(String texto, int mapa){
		super(texto);
		this.mapa = mapa;
	}

	@Override
	public ActionListener actionListener(){
		return new ActionListener() {
	      	@Override
	      	public void actionPerformed(ActionEvent e) {
	        	GameSettings.setMap(mapa);
	        	Game.setMap();
	      	}
	    };
	} 
}