package movimentacao;
import personagens.PacMan;
import assets.Random;


public abstract class UpdatePacManPosition {
	private static int cont = 0;

	public static void movePacMan(PacMan pacman, Teclado act){
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