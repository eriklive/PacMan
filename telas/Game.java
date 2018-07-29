package telas;
import javax.swing.Timer;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;
import assets.*;
import personagens.*;
import movimentacao.*;

import sounds.*;

public class Game extends JPanel{
	private Fantasma[] fantasma;
	private PacMan pacman = new PacMan();
    private Teclado act;
    private static int time = 1;
    private static int numFantasmas;
	private static int[][] mapa = GameSettings.getMap();
	
	public Game() {
		act = new Teclado();
        this.addKeyListener(act);
        this.setFocusable(false);
	}

	@Override
	public void paintComponent(Graphics g){
	    super.paintComponent(g);

		removeAll();

	    DesenharFormas.drawScore(g);

        // score.setText("Score: " + GameSettings.getScore() );
        // score.setBounds(new Rectangle(0, 0, 300, 50));

	    this.add(new Score(), BorderLayout.PAGE_START);

	    //desenhando o mapa
	    for(int i=0; i<mapa.length; i++){
	   		for(int j=0; j<mapa[i].length; j++){
	   			if(mapa[i][j] == 0 || mapa[i][j] == 5 || mapa[i][j] == 6 || mapa[i][j] == 10 || mapa[i][j] == 12)
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

	    revalidate();
	}

	//Starts the game
	public void start(int n, JPanel panel){	
		Janela.updateJanela();
		Timer timer;
	    EatingSound eatingSound = new EatingSound();

		GameSettings.resetScore();
        panel.setFocusable(true);
		panel.grabFocus();
     
		fantasma = new Fantasma[n];
		numFantasmas = n;

		for(int i = 0; i<fantasma.length; i++) {
			fantasma[i] = new Fantasma();
		}

	    ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	if(Game.time % GameSettings.getDificuldade() == 0){
					UpdateGhostPosition.moveGhost(fantasma);
					UpdatePacManPosition.moveGhost(pacman, act);
		           	repaint();
		           	GameSettings.updateHiScore();
				}

				if( GameSettings.gameOver() ){
				 	((Timer)(evt.getSource())).stop();
				 	UpdateGhostPosition.setCont(0);
				 	pacman.setDirecao("d");
				 	eatingSound.stop();
				 	resetMap();
				}

				Game.time++;
	        }      
	    };

	    timer = new Timer(100, taskPerformer);
	    timer.setRepeats(true);
	    timer.start();	
	    eatingSound.play();
	}

	public static int getFantasmas() {
		return numFantasmas;
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

	private void resetMap(){
		GameSettings.setGameOver(false);
		this.mapa = GameSettings.getMap();
		pacman.acharPersonagem();
	}

	public static void setMap(){
		Game.mapa = GameSettings.getMap();
	}

	public static int getNextPortal(int value){
		if(value == 5)
			return 10;

		if(value == 6)
			return 12;

		if(value == 12)
			return 6;

		if(value == 10)
			return 5;

		return 0;
	}
}