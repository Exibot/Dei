import java.awt.Graphics;
import javax.swing.JPanel;

public class LineasRectas extends JPanel{

	public void paintComponent(Graphics g){
		int posicion;
		super.paintComponent(g);

		int anchura = getWidth();
		int altura = getHeight();
		
		for(int j = 0; j <= anchura; j+=25){

			// la posicion final debe variar en 20 pixeles por cada componente
			g.drawLine(0, 0, (anchura-j), j);
			g.drawLine(altura, anchura,(anchura-j) ,j);
			

			//g.drawLine(anchuraActual, alturaActual,anchura ,altura );
			//g.drawLine(anchuraActual, altura,anchura ,alturaActual );
			//g.drawLine(anchura, alturaActual,anchuraActual ,altura );
		}

		for(int i =0; i<= altura; i+=25){

			g.drawLine(0,300,i,i);
			g.drawLine(300,0,300-i,300-i);
			//g.drawLine(300, 0,i ,(300-i));

		}
	}
}