import javax.swing.JOptionPane;

public class DialogoNombre{

	public static void main(String[] args){

		String nombre = JOptionPane.showInputDialog("Cual es su nombre?");

		String mensaje = String.format("Bienvenido, %s, a la programacion en JAVA", nombre);

		JOptionPane.showMessageDialog(null, mensaje);
	}
}