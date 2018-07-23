import javax.swing.JPanel;
import java.awt.*;

public class Telas extends JPanel{
	private int[][] mapa = new int[][]{
    	{1,1,1,1,1,1,1,1,1,1,1},
    	{1,3,3,3,0,1,0,0,0,0,1},
    	{1,0,0,0,0,1,0,0,0,0,1},
    	{1,0,0,0,0,1,0,0,0,0,1},
    	{1,0,0,0,0,1,2,3,3,3,1},
    	{1,1,1,1,1,1,1,1,1,1,1},
    	{1,0,0,0,0,1,0,3,3,3,1},
    	{1,0,0,0,0,1,3,3,3,3,1},
    	{1,0,0,8,0,1,3,3,3,3,1},
    	{1,0,0,0,0,1,3,3,3,3,1},
    	{1,1,1,1,1,1,1,1,1,1,1},
	};

	int ghost_y = 3;
	int ghost_x = 4;

	int pacman_y = 6;
	int pacman_x = 6;

	String dir = "d";

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    for(int i=0; i<11; i++){
	   		for(int j=0; j<11; j++){
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
		if(ghost_x > 0){
			if(mapa[ghost_x+1][ghost_y] != 1){
				ghost_x = ghost_x+1;
				mapa[ghost_x-1][ghost_y] = 0;
			}

			else if(mapa[ghost_x-1][ghost_y] != 1){
				ghost_x=ghost_x-1;
				mapa[ghost_x+1][ghost_y] = 0;
			}

			else if(mapa[ghost_x][ghost_y+1] != 1){
				ghost_y=ghost_y+1;
				mapa[ghost_x][ghost_y-1] = 0;
			}

			else if(mapa[ghost_x][ghost_y-1] != 1){
				ghost_y=ghost_y-1;
				mapa[ghost_x][ghost_y+1] = 0;
			}


		}

		this.mapa[ghost_x][ghost_y] = 8;
	}

	public void updatePacMan(){		
		if(dir == "d"){
			//Move o PacMan pra direita
			if(mapa[pacman_x+1][pacman_y] != 1){
				pacman_x++;
				mapa[pacman_x-1][pacman_y] = 0;
			} else
				dir = "b";
		} else if(dir == "e") { 
			//Move o PacMan pra esquerda
			if(mapa[pacman_x-1][pacman_y] != 1){
				pacman_x--;
				mapa[pacman_x+1][pacman_y] = 0;
			}
			else
				dir = "c";	
		} else if(dir == "c"){
			//Move o PacMan pra cima
			if(mapa[pacman_x][pacman_y-1] != 1){
				pacman_y--;
				mapa[pacman_x][pacman_y+1] = 0;
			}
			else
				dir = "l";
		} else if(dir == "b"){
			//Move o PacMan pra baixo
			if(mapa[pacman_x][pacman_y+1] != 1){
				pacman_y++;
				mapa[pacman_x][pacman_y-1] = 0;
			}
			else
				dir = "e";

		}
		
		this.mapa[pacman_x][pacman_y] = 2;		
	}
}

	