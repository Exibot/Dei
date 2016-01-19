import java.util.Scanner;

public class PruebaLibroCalificaciones{

	public static void main(String[] args){

		//String nombreDelCurso;

		Scanner entrada = new Scanner(System.in);
		LibroCalificaciones libroCalDat = new LibroCalificaciones("Matematicas para las ciencias de la compu");
		LibroCalificaciones libroCalDat2 = new LibroCalificaciones("Algoritmos basicos");

		libroCalDat.mostrarMensaje();
		libroCalDat2.mostrarMensaje();
	}
}