package telas;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import telas.*;
import assets.GameSettings;
import java.awt.*;
import javax.swing.Timer;
import java.util.TimerTask;

public class Janela{
	static JFrame janela = new JFrame();
	static JPanel layout = new JPanel( new CardLayout() );

	//Janelas
	static Menu menu = new Menu();
	static Game game = new Game();
	static Opcoes opcoes = new Opcoes();
	static CardLayout cl = (CardLayout) (layout.getLayout());

	public void criarJanela(){
		this.janela.setBounds(0,0,GameSettings.getX(),GameSettings.getY());
		this.janela.setTitle("PACMAN");
		this.janela.setResizable(false);
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializar();
		this.janela.setVisible(true);
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

}