package telas;

import java.awt.*;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.util.TimerTask;
import telas.*;
import assets.GameSettings;

public class Janela{
	static JFrame janela = new JFrame();
	static JPanel layout = new JPanel( new CardLayout() );

	//Janelas
	static Menu menu = new Menu();
	static Game game = new Game();
	static Opcoes opcoes = new Opcoes();
	static CardLayout cl = (CardLayout) (layout.getLayout());

	public void criarJanela(){
		this.janela.setBounds(0,0,GameSettings.getScreenX(),GameSettings.getScreenY());
		this.janela.setTitle("PACMAN");
		this.janela.setResizable(false);
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializar();
		this.janela.setVisible(true);
	}

	public static void updateJanela(){
		Janela.janela.setBounds(0,0,GameSettings.getScreenX(),GameSettings.getScreenY());
	}

	public static void updateJanela(int x, int y){
		Janela.janela.setBounds(0,0,x,y);
	}

	private static void inicializar(){
		janela.getContentPane().add(layout, BorderLayout.CENTER);

		layout.add(menu, "Menu");
		layout.add(game, "Game");
		layout.add(opcoes, "Opcoes");
	}

	public static void start(){
		cl.show(layout, "Game"); //mudará para a tela inicial
		game.start(4, game);
	}

	public static void opcoes(){
		cl.show(layout, "Opcoes"); //mudará para a tela inicial
	}

	public static void menu(){
		cl.show(layout, "Menu"); 
	}

	public static void endGame(){
		GameSettings.setGameOver(true);
		cl.show(layout, "Menu"); 
	}	

	public static void nextLevel(){
		if(GameSettings.getMapId() >=5){
			Janela.endGame();
		} else {
			GameSettings.setMap(GameSettings.getMapId()+1);
			game.start(4, game);
		}
	}		

}