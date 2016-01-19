import javax.swing.JFrame;

public class Dibujo{

	public static void main(String[] args){

		LineasRectas panel = new LineasRectas();
		JFrame aplicacion = new JFrame();
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(300,300);
		aplicacion.setVisible(true);
	}
}