package assets;

public class Mapa{

	public static int[][] novoMapa(){
		return Mapa.mapaTres();
	}

	public static int[][] mapaUm(){
		return new int[][]
			{
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
		    	{1,3,1,1,3,1,3,1,3,1,3,1,1,3,1},
		    	{1,3,1,1,3,1,3,1,3,1,3,1,1,3,1},
		    	{1,3,3,3,3,3,3,1,3,3,3,3,3,3,1},
		    	{1,1,1,1,1,1,3,1,3,1,1,1,1,1,1},
		    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
		    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
		    	{1,3,1,1,1,3,3,3,3,3,1,1,1,3,1},
		    	{1,3,1,3,3,3,3,3,3,3,3,3,1,3,1},
		    	{1,3,1,3,3,1,1,3,1,1,3,3,1,3,1},
		    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
		    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
		    	{1,3,1,3,3,1,1,1,1,1,3,3,1,3,1},
		    	{1,3,1,3,3,3,3,2,3,3,3,3,1,3,1},
		    	{1,3,1,1,1,1,3,3,3,1,1,1,1,3,1},
		    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
		    	{1,3,1,1,3,3,3,3,3,3,3,1,1,3,1},
		    	{1,3,1,1,3,3,3,3,3,3,3,1,1,3,1},
		    	{1,3,3,3,3,1,3,3,3,1,3,3,3,3,1},
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	   		};
	}

	public static int[][] mapaDois(){
		return new int[][]
			{
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		    	{1,3,3,3,3,3,3,1,3,3,3,3,3,3,1},
		    	{1,3,1,3,1,1,3,1,3,1,1,3,1,3,1},
		    	{1,3,1,3,3,3,3,1,3,3,3,3,1,3,1},
		    	{1,3,3,3,1,3,1,1,1,3,1,3,3,3,1},
		    	{1,3,1,3,1,3,3,1,3,3,1,3,1,3,1},
		    	{1,3,1,1,1,1,3,1,3,1,1,1,1,3,1},
		    	{1,3,3,1,3,3,3,3,3,3,3,1,3,3,1},
		    	{1,1,3,3,3,1,1,3,1,1,3,3,3,1,1},
		    	{0,3,3,1,3,1,3,3,3,1,3,1,3,3,0},
		    	{0,3,3,1,3,1,3,3,3,1,3,1,3,3,0},
		    	{1,1,3,3,3,1,1,1,1,1,3,3,3,1,1},
		    	{1,3,3,1,3,3,3,3,3,3,3,1,3,3,1},
		    	{1,3,3,1,3,1,1,3,1,1,3,1,3,3,1},
		    	{1,3,1,1,3,3,1,2,1,3,3,1,1,3,1},
		    	{1,3,3,1,1,3,3,3,3,3,1,1,3,3,1},
		    	{1,1,3,3,3,3,1,1,1,3,3,3,3,1,1},
		    	{1,3,3,3,1,3,3,1,3,3,1,3,3,3,1},
		    	{1,3,1,1,1,1,3,3,3,1,1,1,1,3,1},
		    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	    };
	}

	public static int[][] mapaTres(){
		return new int[][]
			{
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		    	{1,3,3,3,1,3,3,3,3,3,1,3,3,3,1},
		    	{1,3,1,3,1,3,1,3,1,3,1,3,1,3,1},
		    	{1,3,1,3,1,3,1,3,1,3,1,3,1,3,1},
		    	{1,3,1,3,1,3,1,3,1,3,1,3,1,3,1},
		    	{1,3,1,3,3,3,3,3,3,3,3,3,1,3,1},
		    	{1,3,1,1,1,1,3,1,3,1,1,1,1,3,1},
		    	{1,3,3,1,3,3,3,3,3,3,3,1,3,3,1},
		    	{1,1,3,3,3,1,1,3,1,1,3,3,3,1,1},
		    	{0,3,3,1,3,1,3,3,3,1,3,1,3,3,0},
		    	{0,3,3,1,3,1,3,3,3,1,3,1,3,3,0},
		    	{1,1,3,3,3,1,1,1,1,1,3,3,3,1,1},
		    	{1,3,3,1,3,3,3,3,3,3,3,1,3,3,1},
		    	{1,3,3,1,1,1,1,3,1,1,1,1,3,3,1},
		    	{1,1,3,3,1,3,1,2,1,3,1,3,3,1,1},
		    	{1,3,3,3,3,3,1,3,1,3,3,3,3,3,1},
		    	{1,1,3,3,1,3,3,3,3,3,1,3,1,3,1},
		    	{1,3,3,3,1,3,1,3,1,3,1,3,3,3,1},
		    	{1,3,1,1,1,3,1,3,1,3,1,1,1,3,1},
		    	{1,3,3,3,3,3,3,3,3,3,3,3,3,3,1},
		    	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	    };
	}
}