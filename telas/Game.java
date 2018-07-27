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
    private Teclado act;
    private static int time = 1;
	
	public Game() {
		act = new Teclado();
        this.addKeyListener(act);
        this.setFocusable(false);
	}

	private static int[][] mapa = Mapa.novoMapa();

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
	public void start(int n, JPanel panel){	
		Timer timer;

        panel.setFocusable(true);
		panel.grabFocus();
     
		fantasma = new Fantasma[n];

		for(int i = 0; i<fantasma.length; i++) {
			fantasma[i] = new Fantasma();
		}

	    ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	if(Game.time % GameSettings.getDificuldade() == 0){
					UpdateGhostPosition.moveGhost(fantasma);
					UpdatePacManPosition.moveGhost(pacman, act);
		           	repaint();
				}

				if(GameSettings.gameOver()){
				 	((Timer)(evt.getSource())).stop();

				 	resetMap();
				}

				Game.time++;
	        }      
	    };

	    timer = new Timer(100, taskPerformer);
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

	private void resetMap(){
		GameSettings.resetScore();
		GameSettings.setGameOver(false);
		this.mapa = Mapa.novoMapa();
		pacman.acharPersonagem();
	}
}