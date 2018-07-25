package movimentacao;
import personagens.*;
import telas.*;

public class MovimentosFantasmas {

	public static void moverFantasmaX(Fantasma fantasma, int novo_x){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if( Telas.mapa[y][novo_x] != 1 ){ //novo x não é parede

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Telas.mapa[y][x] = fantasma.getUltimoItem();

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.setUltimoItem( Telas.mapa[y][novo_x] ); 

			//Sobreponho a ṕróxima posição com meu fantasma
			Telas.mapa[y][novo_x] = 8;

			//atualizo o x do meu fantasma
			fantasma.setX( novo_x );
		} else {
			acharNovaDirecaoY(fantasma);
		}

	}

	public static void moverFantasmaY(Fantasma fantasma, int novo_y){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Telas.mapa[novo_y][x] != 1){
			Telas.mapa[y][x] = fantasma.getUltimoItem();
			fantasma.setUltimoItem( Telas.mapa[novo_y][x] );

			Telas.mapa[novo_y][x] = 8;

			fantasma.setY(novo_y);
		} else {
			acharNovaDirecaoX(fantasma);
		}
	}

	public static void acharNovaDirecaoY(Fantasma fantasma){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Telas.mapa[y+1][x] != 1){
			fantasma.setDirecao("b");
			moverFantasmaY(fantasma, fantasma.getY() + 1);

		} else if(Telas.mapa[y-1][x] != 1){
			fantasma.setDirecao("c");
			moverFantasmaY(fantasma, fantasma.getY() - 1);
		}
	}

	public static void acharNovaDirecaoX(Fantasma fantasma){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Telas.mapa[y][x+1] != 1){
			fantasma.setDirecao("d");
			moverFantasmaX(fantasma, fantasma.getX() + 1);

		} else if(Telas.mapa[y][x-1] != 1){
			fantasma.setDirecao("e");
			moverFantasmaX(fantasma, fantasma.getX() - 1);
		}
		
	}
}