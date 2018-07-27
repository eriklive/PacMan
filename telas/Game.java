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
	private Fantasma[] fantasma;
	private PacMan pacman = new PacMan();
    private JLabel score = new JLabel();
    private static int cont = 0;
    Teclado act;
	
	public Game() {
		act = new Teclado();
        addKeyListener(act);
        setFocusable(true);
	}

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

	    		else if(mapa[i][j] == 8 || mapa[i][j] == 7)
	    			DesenharFormas.drawGhost(g, j, i);
	    	}
	    }  
	}

	//Starts the game
	public void start(int n){
		fantasma = new Fantasma[n];

		for(int i = 0; i<fantasma.length; i++) {
			fantasma[i] = new Fantasma();
		}
		// Time loop

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
		for(int i = 0; i<fantasma.length; i++){
			if(cont<3) {
				MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);
				cont+=1;
			} else {
				boolean podeAndar = false;
				while(!podeAndar) {	
					switch(Random.sorteia()){
						case "d":
							podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() + 1);
							break;
				
						case "e":
							podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() - 1);
							break;
				
						case "b":
							podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() + 1);
							break;
				
						case "c":
							podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);		
							break;
					}
				}
			}
		}
	}

	public void updatePacMan(){	
		switch( act.getDirTeclado() ){
			case "d":
				pacman.setDirecao("d");
				MovimentosPacMan.moverPacManX(pacman, pacman.getX() + 1);
				break;
	
			case "e":
				pacman.setDirecao("e");
				MovimentosPacMan.moverPacManX(pacman, pacman.getX() - 1);
				break;
	
			case "b":
				pacman.setDirecao("b");
				MovimentosPacMan.moverPacManY( pacman, pacman.getY() + 1 );
				break;

			case "c":
				pacman.setDirecao("c");
				MovimentosPacMan.moverPacManY(pacman, pacman.getY() - 1);		
				break;
		}
	
	}
}