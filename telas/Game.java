package telas;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;
import personagens.*;
import movimentacao.*;
import assets.*;
import javax.swing.Timer;
import java.awt.event.*;

public class Game extends JPanel{
	private Fantasma fantasma = new Fantasma();
	private PacMan pacman = new PacMan();
    private JLabel score = new JLabel();
	
	private static int[][] mapa = new int[][]{
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
    	{1,3,1,1,3,3,3,2,3,3,3,1,1,3,1},
    	{1,3,1,1,3,3,3,3,3,3,3,1,1,3,1},
    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

	    DesenharFormas.drawScore(g);

        score.setText("Score: " + GameSettings.getScore() );
        score.setBounds(new Rectangle(0, 0, 300, 50));

	    this.add(score);

	    for(int i=0; i<mapa.length; i++){
	   		for(int j=0; j<mapa[i].length; j++){
	   			if(mapa[i][j] == 0)
	    			DesenharFormas.drawNada(g, j, i);

	    		if(mapa[i][j] == 1)
	    			DesenharFormas.drawParede(g, j, i);

	    		else if(mapa[i][j] == 2)
	    			DesenharFormas.drawPacMan(g, j, i, pacman);
	    		
	    		else if(mapa[i][j] == 3)
	    			DesenharFormas.drawCoin(g, j, i);

	    		else if(mapa[i][j] == 8)
	    			DesenharFormas.drawGhost(g, j, i);
	    	}
	    }  
	}

	//Starts the game
	public void start(){
		// Time loop
	    ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	           	updateGhost();
	           	updatePacMan();
				repaint();
	        }
	    };

	    Timer timer = new Timer(500, taskPerformer);
	    timer.setRepeats(true);
	    timer.start();

	    // Thread.sleep(1000);
	}

	public static int[][] getMap(){
		return mapa;
	}

	public static int getMapValue(int x, int y){
		return mapa[y][x];
	}

	public static void setMapaValue(int x, int y, int value){
		mapa[y][x] = value;
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