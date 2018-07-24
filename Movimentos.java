public class Movimentos {

	public static void moverFantasmaX(Fantasma fantasma, int novo_x){
		int x = fantasma.x;
		int y = fantasma.y;

		if( Telas.mapa[novo_x][y] != 1 ){ //novo x não é parede
			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			Telas.mapa[x][y] = fantasma.ultimo_item;

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.ultimo_item = Telas.mapa[novo_x][y];

			//Sobreponho a ṕróxima posição com meu fantasma
			Telas.mapa[novo_x][y] = 8;

			//atualizo o x do meu fantasma
			fantasma.x = novo_x;
		} else {
			acharNovaDirecaoY(fantasma);
		}

	}

	public static void moverFantasmaY(Fantasma fantasma, int novo_y){
		int x = fantasma.x;
		int y = fantasma.y;

		if(Telas.mapa[x][novo_y] != 1){
			Telas.mapa[x][y] = fantasma.ultimo_item;
			fantasma.ultimo_item = Telas.mapa[x][fantasma.y];

			Telas.mapa[x][novo_y] = 8;

			fantasma.y = novo_y;
		} else {
			acharNovaDirecaoX(fantasma);
		}
	}

	public static void acharNovaDirecaoY(Fantasma fantasma){
		int x = fantasma.x;
		int y = fantasma.y;

		if(Telas.mapa[x][y+1] != 1){
			fantasma.direcao = "b";
			moverFantasmaY(fantasma, fantasma.y+1);

		} else if(Telas.mapa[x][y-1] != 1){
			fantasma.direcao = "c";
			moverFantasmaY(fantasma, fantasma.y-1);
		}
	}

	public static void acharNovaDirecaoX(Fantasma fantasma){
		int x = fantasma.x;
		int y = fantasma.y;

		if(Telas.mapa[x+1][y] != 1){
			fantasma.direcao = "d";
			moverFantasmaX(fantasma, fantasma.x+1);

		} else if(Telas.mapa[x-1][y] != 1){
			fantasma.direcao = "e";
			moverFantasmaX(fantasma, fantasma.x-1);
		}
		
	}
}