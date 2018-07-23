import javax.swing.JPanel;
import java.awt.*;

public class Telas extends JPanel{

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    int[][] mapa = new int[][]{
	    	{1,1,1,1,1,1,1,1,1,1,1},
	    	{1,3,3,3,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,2,3,3,3,1},
	    	{1,1,1,1,1,1,1,1,1,1,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,0,0,0,0,1,0,0,0,0,1},
	    	{1,1,1,1,1,1,1,1,1,1,1},
    	};

	    for(int i=0; i<11; i++){
	   		for(int j=0; j<11; j++){
	   			if(mapa[j][i] == 0)
	    			DesenharMapa.drawNada(g, i, j);

	    		if(mapa[j][i] == 1)
	    			DesenharMapa.drawParede(g, i, j);

	    		else if(mapa[j][i] == 2)
	    			DesenharMapa.drawPacMan(g, i, j);
	    		
	    		else if(mapa[j][i] == 3)
	    			DesenharMapa.drawCoin(g, i, j);
	    	}
	    }
	}
}

