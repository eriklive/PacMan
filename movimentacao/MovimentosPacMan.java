package movimentacao;
import personagens.*;
import telas.*;

public class MovimentosPacMan {

	public static void moverPacManX(PacMan pacman, int novo_x){
		int x = pacman.getX();
		int y = pacman.getY();

		if( Game.getMapValue(novo_x, y) != 1 ){ //novo x não é parede
			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Game.setMapaValue(x,y,0);
			//Sobreponho a ṕróxima posição com meu pacman
			Game.setMapaValue(novo_x,y,2);

			//atualizo o x do meu pacman
			pacman.setX( novo_x );
		} else {
			acharNovaDirecaoY(pacman);
		}

	}

	public static void moverPacManY(PacMan pacman, int novo_y){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.getMapValue(x,novo_y) != 1){
			Game.setMapaValue(x,y,0);
			Game.setMapaValue(x,novo_y,2);

			pacman.setY( novo_y );
		} else {
			acharNovaDirecaoX(pacman);
		}
	}

	public static void acharNovaDirecaoY(PacMan pacman){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.getMapValue(x, y+1) != 1){
			pacman.setDirecao("b");
			moverPacManY(pacman, pacman.getY() + 1);

		} else if(Game.getMapValue(x, y-1) != 1){
			pacman.setDirecao("c");
			moverPacManY(pacman, pacman.getY() - 1);
		}
	}

	public static void acharNovaDirecaoX(PacMan pacman){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.getMapValue(x+1, y) != 1){
			pacman.setDirecao("d");
			moverPacManX(pacman, pacman.getX() + 1);

		} else if(Game.getMapValue(x-1,y) != 1){
			pacman.setDirecao("e");
			moverPacManX(pacman, pacman.getX() - 1);
		}
		
	}
}