package movimentacao;
import personagens.*;
import telas.*;

public class MovimentosFantasmas {
	public static void moverFantasmaX(Fantasma fantasma, int novo_x){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if( Game.getMapValue(novo_x, y) != 1 ){ //novo x não é parede

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Game.setMapaValue(x,y,fantasma.getUltimoItem());

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.setUltimoItem( Game.getMapValue(novo_x,y) ); 

			//Sobreponho a ṕróxima posição com meu fantasma
			Game.setMapaValue(novo_x, y, 8);

			//atualizo o x do meu fantasma
			fantasma.setX( novo_x );
		} else {
			acharNovaDirecaoY(fantasma);
		}

	}

	public static void moverFantasmaY(Fantasma fantasma, int novo_y){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Game.getMapValue(x, novo_y) != 1){
			Game.setMapaValue( x,y,fantasma.getUltimoItem() );

			fantasma.setUltimoItem( Game.getMapValue(x,novo_y) );

			Game.setMapaValue(x,novo_y,8);

			fantasma.setY(novo_y);
		} else {
			acharNovaDirecaoX(fantasma);
		}
	}

	public static void acharNovaDirecaoY(Fantasma fantasma){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Game.getMapValue(x,y+1) != 1){
			fantasma.setDirecao("b");
			moverFantasmaY(fantasma, fantasma.getY() + 1);

		} else if(Game.getMapValue(x,y-1) != 1){
			fantasma.setDirecao("c");
			moverFantasmaY(fantasma, fantasma.getY() - 1);
		}
	}

	public static void acharNovaDirecaoX(Fantasma fantasma){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Game.getMapValue(x+1,y) != 1){
			fantasma.setDirecao("d");
			moverFantasmaX(fantasma, fantasma.getX() + 1);

		} else if(Game.getMapValue(x-1,y) != 1){
			fantasma.setDirecao("e");
			moverFantasmaX(fantasma, fantasma.getX() - 1);
		}
		
	}
}