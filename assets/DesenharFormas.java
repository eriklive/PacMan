package assets;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DesenharFormas{
    private static int square = 25;
    private static int coin = 10;
    private static int padding = (square - coin) / 2;


	//Desenha um bloco de 50x50px
	public static void drawParede(Graphics g, int x, int y) {
        //x é a posição "x" da matriz. Como o tamanho de cada bloco é 'square', então a distância
        //deste novo elemento da esquerda será 'square'*'posição dele da matriz'

		x = x*square;
		y = y*square;

        g.setColor(Color.BLUE);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
    }

	//Desenha um bloco de squarexsquarepx preto
    public static void drawNada(Graphics g, int x, int y) {
    	x = x*square;
		y = y*square;

        g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
    }

	//Desenha um cícurlo de squarexsquarepx com fundo preto (vulgo PacMan)
    public static void drawPacMan(Graphics g, int x, int y) {
        try{
            final BufferedImage image = ImageIO.read(new File("/home/harry/Documentos/UFABC/[POO]/PACMAN"));
            g.drawImage(image, x, y, null);

        } catch(Exception e){
            System.out.println("Excesão: " + e);
        }

    	x = x*square;
		y = y*square;

		g.setColor(Color.BLACK);
        g.drawRect(x,y,square,square);
        g.fillRect(x,y,square,square);
        
        g.drawOval(x,y,square,square);
        g.fillOval(x,y,square,square);
    }

	//Desenha um cícurlo de roxo squarexsquarepx com fundo preto (vulgo PacMan)
    public static void drawGhost(Graphics g, int x, int y) {
    	x = x*square;
		y = y*square;

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
		y = y*square;
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