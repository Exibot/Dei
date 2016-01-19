import java.awt.Graphics;
import javax.swing.JPanel;

public class Parabola extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		int anchura = getWidth();
		int altura = getHeight();

		for(int i = 0; i<= anchura; i+=15){
			//g.drawLine(0,0,i,altura-i);
			g.drawLine(0,i,i,altura);
			g.drawLine(i,0,anchura,i);
			g.drawLine(anchura - i,altura,anchura,i);
			g.drawLine(0,altura - i,i,0);

			//g.drawLine(300, 0,i ,(300-i));

		}

	}


}