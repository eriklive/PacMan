package assets;
import java.awt.*;
import personagens.PacMan;
import assets.GameSettings;

public class DesenharFormas{
    private static int square = 25;
    private static int coin = 10;
    private static int padding = (square - coin) / 2;

    public static void drawScore(Graphics g) {
        //x é a posição "x" da matriz. Como o tamanho de cada bloco é 'square', então a distância
        //deste novo elemento da esquerda será 'square'*'posição dele da matriz'
        g.setColor(Color.BLUE);
        g.drawRect(0,0,GameSettings.getX(),GameSettings.getPaddingY());
        g.fillRect(0,0,GameSettings.getX(),GameSettings.getPaddingY());
    }

	//Desenha um bloco de 50x50px
	public static void drawParede(Graphics g, int x, int y) {
        //x é a posição "x" da matriz. Como o tamanho de cada bloco é 'square', então a distância
        //deste novo elemento da esquerda será 'square'*'posição dele da matriz'

		x = x*square;
		y = y*square + GameSettings.getPaddingY();

        g.setColor(Color.BLUE);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
    }

	//Desenha um bloco de squarexsquarepx preto
    public static void drawNada(Graphics g, int x, int y) {
    	x = x*square;
		y = y*square + GameSettings.getPaddingY();

        g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
    }

	//Desenha um cícurlo de squarexsquarepx com fundo preto (vulgo PacMan)
    public static void drawPacMan(Graphics g, int x, int y, PacMan pacman) {
    	x = x*square;
		y = y*square + GameSettings.getPaddingY();

		g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
        
        g.setColor(Color.yellow);

        if(pacman.bocaAberta){
            if(pacman.getDirecao() == "d")
                g.fillArc(x,y,square,square,35,295);
            else if((pacman.getDirecao() == "e"))
                g.fillArc(x,y,square,square,210,295);
            else if((pacman.getDirecao() == "c"))
                g.fillArc(x,y,square,square,120,295);
            else if((pacman.getDirecao() == "b"))
                g.fillArc(x,y,square,square,300,295);

            pacman.bocaAberta = false;
        } else {
            g.fillOval(x,y,square,square);
            pacman.bocaAberta = true;
        }
    }

	//Desenha um cícurlo de roxo squarexsquarepx com fundo preto (vulgo PacMan)
    public static void drawGhost(Graphics g, int x, int y) {
    	x = x*square;
		y = y*square + GameSettings.getPaddingY();

		//background
		g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);

        //Ghost
        g.setColor(Color.MAGENTA);
        g.drawOval(x,y,square,square);
        g.fillOval(x,y,square,square);
    }

	//Desenha um cícurlo de 20x20px com fundo preto (moedas)
    public static void drawCoin(Graphics g, int x, int y) {
    	x = x*square;
		y = y*square + GameSettings.getPaddingY();
		g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);

        x+=padding;
        y+=padding;
        g.setColor(Color.YELLOW);
        g.drawOval(x,y,coin,coin);
        g.fillOval(x,y,coin,coin);
    }
}