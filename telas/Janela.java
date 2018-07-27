package telas;

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import telas.*;
import assets.GameSettings;
import java.awt.*;


public class Janela{

	static JFrame janela = new JFrame();
	static JPanel layout = new JPanel( new CardLayout() );
	static Menu menu = new Menu();
	static Game game = new Game();
	static CardLayout cl = (CardLayout) (layout.getLayout());

	public void criarJanela(){
		this.janela.setBounds(0,0,GameSettings.getX(),GameSettings.getY());
		this.janela.setTitle("PACMAN");
		this.janela.setResizable(false);
		this.janela.setVisible(true);
		this.janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializar();
	}

	private void inicializar(){
		janela.getContentPane().add(layout, BorderLayout.CENTER);
		layout.add(menu, "Menu");
		layout.add(game, "Game");
	}

	public static void start(){
		cl.show(layout, "Game"); //mudará para a tela inicial
		game.start(4, game);
	}	

}