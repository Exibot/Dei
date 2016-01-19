import java.util.Scanner;
public class Principal{

	public static void main(String[] args){

	String nombreCurso;

	Scanner entrada = new Scanner(System.in);

	System.out.println("Bienvenido al sistema de calculo de promedio para cursos");

	System.out.println("Ingrese el nombre del curso: ");
	nombreCurso = entrada.nextLine();

	LibroCalificaciones nuevoLibro = new LibroCalificaciones(nombreCurso);

	nuevoLibro.determinarPromedio();

	nuevoLibro.mostrarMensaje();



	}

}