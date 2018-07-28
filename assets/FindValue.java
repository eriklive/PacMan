package assets;
import telas.Game;
// Função que procura um valor específico no mapa e retorna um vetor de 2 posições,
// I e J.

public abstract class FindValue{

	public static int[] find(int value){
		int[] coordenadas = new int [2];
		int [][] mapa = Game.getMap();

		for(int i=0; i < mapa.length; i++){
			for(int j=0; j < mapa[i].length; j++){
				if(mapa[i][j] == value){
					coordenadas[0] = j;
					coordenadas[1] = i;
					break;
				}
			}
		}

		return coordenadas;
	}
}