// Implements this on entire game
package assets;
import assets.Mapa;

public abstract class GameSettings{
	private static int screenSizeX = 375;
	private static int screenSizeY = 605;
	private static int paddingTop = 50;
	private static int score = 0;
	private static int hi_score = 0;
	private static int dificuldade = 4;
	private static boolean game_over = false;
	private static int map = 0;

	public static void setScreenSize(int x, int y){
		GameSettings.screenSizeX = 375;
		GameSettings.screenSizeY = 555;
	}

	public static int getX(){
		return screenSizeX;
	}

	public static int getY(){
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

	public static void setMap(int map){
		GameSettings.map = map;
	}

	public static int[][] getMap(){
		if(GameSettings.map == 0)
			return Mapa.mapaUm();

		if(GameSettings.map == 1)
			return Mapa.mapaDois();

		if(GameSettings.map == 2)
			return Mapa.mapaTres();

		return Mapa.mapaUm();

	}
}