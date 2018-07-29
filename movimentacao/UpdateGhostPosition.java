package movimentacao;
import personagens.Fantasma;
import assets.Random;
import telas.Game;

public abstract class UpdateGhostPosition {
	private static int cont = 0;

	public static void setCont(int n) {
		cont = n;
	}
	public static int getCont() {
		return cont;
	}

	public static void moveGhost(Fantasma[] fantasma){
		for(int i = 0; i<fantasma.length; i++){
			if( cont < ( 3*Game.getFantasmas() ) ) {
				MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);
				cont+=1;
			} else {
				boolean podeAndar = false;

				while(!podeAndar) {	
					switch( Random.sorteia() ){
						case "d":
							if(!( fantasma[i].getDirecao() ).equals("e")){
								podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() + 1);
								if(podeAndar)
									fantasma[i].setDirecao("d");
							}
							break;
				
						case "e":
							if(!( fantasma[i].getDirecao() ).equals("d")){
								podeAndar=MovimentosFantasmas.moverFantasmaX(fantasma[i], fantasma[i].getX() - 1);
								if(podeAndar)
									fantasma[i].setDirecao("e");
							}
							break;
				
						case "b":
							if(!( fantasma[i].getDirecao() ).equals("c")){
								podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() + 1);
								if(podeAndar)
									fantasma[i].setDirecao("b");
							}
							break;
				 
						case "c":
							if(!( fantasma[i].getDirecao() ).equals("b")){
								podeAndar=MovimentosFantasmas.moverFantasmaY(fantasma[i], fantasma[i].getY() - 1);		
								if(podeAndar)
									fantasma[i].setDirecao("c");
							}	
							break;
					}
				}
			}
		}
	}
}