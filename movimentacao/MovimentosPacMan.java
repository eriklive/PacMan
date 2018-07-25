package movimentacao;
import personagens.*;
import telas.*;

public class MovimentosPacMan {

	public static void moverPacManX(PacMan pacman, int novo_x){
		int x = pacman.getX();
		int y = pacman.getY();

		if( Game.mapa[y][novo_x] != 1 ){ //novo x não é parede

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Game.mapa[y][x] = 0;

			//Sobreponho a ṕróxima posição com meu pacman
			Game.mapa[y][novo_x] = 2;

			//atualizo o x do meu pacman
			pacman.setX( novo_x );
		} else {
			acharNovaDirecaoY(pacman);
		}

	}

	public static void moverPacManY(PacMan pacman, int novo_y){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.mapa[novo_y][x] != 1){
			Game.mapa[y][x] = 0;

			Game.mapa[novo_y][x] = 2;

			pacman.setY( novo_y );
		} else {
			acharNovaDirecaoX(pacman);
		}
	}

	public static void acharNovaDirecaoY(PacMan pacman){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.mapa[y+1][x] != 1){
			pacman.setDirecao("b");
			moverPacManY(pacman, pacman.getY() + 1);

		} else if(Game.mapa[y-1][x] != 1){
			pacman.setDirecao("c");
			moverPacManY(pacman, pacman.getY() - 1);
		}
	}

	public static void acharNovaDirecaoX(PacMan pacman){
		int x = pacman.getX();
		int y = pacman.getY();

		if(Game.mapa[y][x+1] != 1){
			pacman.setDirecao("d");
			moverPacManX(pacman, pacman.getX() + 1);

		} else if(Game.mapa[y][x-1] != 1){
			pacman.setDirecao("e");
			moverPacManX(pacman, pacman.getX() - 1);
		}
		
	}
}