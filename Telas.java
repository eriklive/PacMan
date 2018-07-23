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

	int ghost_y = 10;
	int ghost_x = 10;

	int pacman_y = 6;
	int pacman_x = 6;

	String dir = "l";

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
		if(ghost_x > 0)
			ghost_x=ghost_x-1;

		System.out.println(ghost_x);

		this.mapa[ghost_x][ghost_y] = 8;
	}

	public void updatePacMan(){		
		if(dir == "d"){
			if(mapa[pacman_x+1][pacman_y] != 1)
				pacman_x++;
			else
				dir = "b";

		} else if(dir == "e") {
			if(mapa[pacman_x-1][pacman_y] != 1)
				pacman_x--;
			else
				dir = "c";	
			System.out.println("e");

		}else if(dir == "c"){
			if(mapa[pacman_x][pacman_y-1] != 1)
				pacman_y--;
			else
				dir = "l";
			System.out.println("c");

			
		}else if(dir == "b"){
			if(mapa[pacman_x][pacman_y+1] != 1)
				pacman_y++;
			else
				dir = "d";
			System.out.println("b");

		}

		System.out.println(ghost_x);

		this.mapa[pacman_x][pacman_y] = 2;
		this.mapa[pacman_x-1][pacman_y] = 0;
	}
}

	