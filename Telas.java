import javax.swing.JPanel;
import java.awt.*;

public class Telas extends JPanel{
	Fantasma fantasma = new Fantasma();

	public static int[][] mapa = new int[][]{
    	{1,1,1,1,1,1,1,1,1,1,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,2,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,3,3,3,3,1,3,3,3,3,1},
    	{1,1,1,1,1,1,1,1,1,1,1},
	};

	int[] posicao_pacman = new int[]{5,3};

	int pacman_x = 5;
	int pacman_y = 5;

	String pac_dir = "d";

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    for(int i=0; i<mapa.length; i++){
	   		for(int j=0; j<mapa[i].length; j++){
	   			if(mapa[i][j] == 0)
	    			DesenharFormas.drawNada(g, i, j);

	    		if(mapa[i][j] == 1)
	    			DesenharFormas.drawParede(g, i, j);

	    		else if(mapa[i][j] == 2)
	    			DesenharFormas.drawPacMan(g, i, j);
	    		
	    		else if(mapa[i][j] == 3)
	    			DesenharFormas.drawCoin(g, i, j);

	    		else if(mapa[i][j] == 8)
	    			DesenharFormas.drawGhost(g, i, j);
	    	}
	    }  
	}

	public void updateGhost(){	
		switch(fantasma.direcao){
			case "d":
				Movimentos.moverFantasmaX(fantasma, fantasma.x+1);
				break;
	
			case "e":
				Movimentos.moverFantasmaX(fantasma, fantasma.x-1);
				break;
	
			case "b":
				Movimentos.moverFantasmaY(fantasma, fantasma.y+1);
				break;
	
			case "c":
				Movimentos.moverFantasmaY(fantasma, fantasma.y-1);		
				break;
		}
	}

	

	public void updatePacMan(){		
		if(pac_dir == "d"){
			//Move o PacMan pra direita
			if(mapa[pacman_x+1][pacman_y] != 1){
				pacman_x++;
				mapa[pacman_x-1][pacman_y] = 0;
			} else
				pac_dir = "b";
		} else if(pac_dir == "e") { 
			//Move o PacMan pra esquerda
			if(mapa[pacman_x-1][pacman_y] != 1){
				pacman_x--;
				mapa[pacman_x+1][pacman_y] = 0;
			}
			else
				pac_dir = "c";	
		} else if(pac_dir == "c"){
			//Move o PacMan pra cima
			if(mapa[pacman_x][pacman_y-1] != 1){
				pacman_y--;
				mapa[pacman_x][pacman_y+1] = 0;
			}
			else
				pac_dir = "l";
		} else if(pac_dir == "b"){
			//Move o PacMan pra baixo
			if(mapa[pacman_x][pacman_y+1] != 1){
				pacman_y++;
				mapa[pacman_x][pacman_y-1] = 0;
			}
			else
				pac_dir = "e";
		}
		
		this.mapa[pacman_x][pacman_y] = 2;		
	}
}

	