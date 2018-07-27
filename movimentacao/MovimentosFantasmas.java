package movimentacao;
import personagens.*;
import telas.*;

public class MovimentosFantasmas {
	public static boolean moverFantasmaX(Fantasma fantasma, int novo_x){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if( Game.getMapValue(novo_x, y) != 1 ){ //novo x não é parede

			//Essa minha posição atual recebe de volta o item a que a ela pertencia
			if(fantasma.getUltimoItem()==8)
				Game.setMapaValue(x,y,0);
			else if(fantasma.getUltimoItem()==7)
				Game.setMapaValue(x,y,3);
			else
				Game.setMapaValue(x,y,fantasma.getUltimoItem());

			//atualizo o ultimo item com o item o qual o fantasma vai se sobrepor
			fantasma.setUltimoItem( Game.getMapValue(novo_x,y) ); 

			//Sobreponho a ṕróxima posição com meu fantasma
			if(Game.getMapValue(novo_x,y)==0 || Game.getMapValue(novo_x,y)==8)
				Game.setMapaValue(novo_x, y, 8);

			else if(Game.getMapValue(novo_x,y)==3 || Game.getMapValue(novo_x,y)==7)
				Game.setMapaValue(novo_x, y, 7);
			
			//atualizo o x do meu fantasma
			fantasma.setX( novo_x );

			return true;
		} else {
			return false;
		}

	}

	public static boolean moverFantasmaY(Fantasma fantasma, int novo_y){
		int x = fantasma.getX();
		int y = fantasma.getY();

		if(Game.getMapValue(x, novo_y) != 1){

			if(fantasma.getUltimoItem()==8)
				Game.setMapaValue(x,y,0);
			else if(fantasma.getUltimoItem()==7)
				Game.setMapaValue(x,y,3);
			else
				Game.setMapaValue(x,y,fantasma.getUltimoItem());

			fantasma.setUltimoItem( Game.getMapValue(x,novo_y) ); 

			if(Game.getMapValue(x,novo_y)==0 || Game.getMapValue(x,novo_y)==8)
				Game.setMapaValue(x, novo_y, 8);

			else if(Game.getMapValue(x,novo_y)==3 || Game.getMapValue(x,novo_y)==7)
				Game.setMapaValue(x, novo_y, 7);


			fantasma.setY(novo_y);

			return true;
		} else {
			return false;
		}
	}

}