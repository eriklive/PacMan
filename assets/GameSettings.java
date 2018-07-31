// Implements this on entire game
package assets;
import assets.Mapa;
import telas.Janela;

public abstract class GameSettings{
	private static int screenSizeX = 375;
	private static int screenSizeY = 605;
	private static int paddingTop = 50;
	private static int score = 0;
	private static int hi_score = 0;
	private static int dificuldade = 4;
	private static boolean game_over = false;
	private static int map;
	private static int moedas = 0;

	public static void initMoedas(){
		GameSettings.moedas = 0;

		int[][] mapa = GameSettings.getMap();

		for(int i = 0; i<mapa.length; i++)
			for(int j = 0; j<mapa[0].length; j++)
				if(mapa[i][j] == 3)
					GameSettings.moedas++;
	}

	public static void setMoedas(){
		GameSettings.moedas--;
	}

	public static int getMoedas(){
		return GameSettings.moedas;
	}

	public static void setScreenSize(int screenSizeOnX, int screenSizeOnY){
		GameSettings.screenSizeX = screenSizeOnX;
		GameSettings.screenSizeY = screenSizeOnY;
	}

	public static int getScreenX(){
		return screenSizeX;
	}

	public static int getScreenY(){
		return screenSizeY;
	}

	public static int getPaddingY(){
		return paddingTop;
	}

	public static int getScore(){
		return score;
	}

	public static int getHiScore(){
		return hi_score;
	}

	public static void updateHiScore(){
		if(GameSettings.getScore() > GameSettings.getHiScore())
			GameSettings.hi_score = GameSettings.score;
	}

	public static void addScore(){
		score++;
	}

	public static void resetScore(){
		GameSettings.score=0;
	}

	public static boolean gameOver(){
		return game_over;
	}

	public static void setGameOver(Boolean change){
		game_over = change;
	}

	public static int getDificuldade(){
		return dificuldade;
	}

	public static int[][] getMap(){
		if(GameSettings.map == 1)
			return Mapa.mapaUm();

		if(GameSettings.map == 2)
			return Mapa.mapaDois();

		if(GameSettings.map == 3)
			return Mapa.mapaTres();

		if(GameSettings.map == 4)
			return Mapa.mapaQuatro();
		
		if(GameSettings.map == 5)
			return Mapa.mapaCinco();

		return Mapa.mapaTres();
	}
	
	public static int getMapId(){
		return GameSettings.map;
	}

	public static void setMap(int map){
		GameSettings.map = map;
		GameSettings.initMoedas();
	}

	
}