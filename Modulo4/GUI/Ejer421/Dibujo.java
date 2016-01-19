import javax.swing.JFrame;

public class Dibujo{

	public static void main(String[] args){

		Parabola panel = new Parabola();
		JFrame aplicacion = new JFrame();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(300,300);
		aplicacion.setVisible(true);

		
	}

}