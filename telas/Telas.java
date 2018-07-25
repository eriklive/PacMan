package telas;
import javax.swing.JPanel;
import java.awt.*;
import personagens.*;
import movimentacao.*;
import assets.DesenharFormas;

public class Telas extends JPanel{
	Fantasma fantasma = new Fantasma();
	PacMan pacman = new PacMan();

	public static int[][] mapa = new int[][]{
    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,1,1,3,3,3,3,3,3,3,1,1,3,1},
    	{1,3,1,1,3,3,3,3,3,3,3,1,1,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,1,1,3,1,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,1,1,1,1,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,3,1,1,3,3,3,3,3,3,1,1,3,3,1},
    	{1,3,1,1,3,3,3,3,3,3,1,1,3,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    for(int i=0; i<mapa.length; i++){
	   		for(int j=0; j<mapa[i].length; j++){
	   			if(mapa[i][j] == 0)
	    			DesenharFormas.drawNada(g, j, i);

	    		if(mapa[i][j] == 1)
	    			DesenharFormas.drawParede(g, j, i);

	    		else if(mapa[i][j] == 2)
	    			DesenharFormas.drawPacMan(g, j, i);
	    		
	    		else if(mapa[i][j] == 3)
	    			DesenharFormas.drawCoin(g, j, i);

	    		else if(mapa[i][j] == 8)
	    			DesenharFormas.drawGhost(g, j, i);
	    	}
	    }  
	}

	public void updateGhost(){	
		switch( fantasma.getDirecao() ){
			case "d":
				MovimentosFantasmas.moverFantasmaX(fantasma, fantasma.getX() + 1);
				break;
	
			case "e":
				MovimentosFantasmas.moverFantasmaX(fantasma, fantasma.getX() - 1);
				break;
	
			case "b":
				MovimentosFantasmas.moverFantasmaY(fantasma, fantasma.getY() + 1);
				break;
	
			case "c":
				MovimentosFantasmas.moverFantasmaY(fantasma, fantasma.getY() - 1);		
				break;
		}
	}

	public void updatePacMan(){	
		switch( pacman.getDirecao() ){
			case "d":
				MovimentosPacMan.moverPacManX(pacman, pacman.getX() + 1);
				break;
	
			case "e":
				MovimentosPacMan.moverPacManX(pacman, pacman.getX() - 1);
				break;
	
			case "b":
				MovimentosPacMan.moverPacManY( pacman, pacman.getY() + 1 );
				break;
	
			case "c":
				MovimentosPacMan.moverPacManY(pacman, pacman.getY() - 1);		
				break;
		}
	
	}
}