import java.util.Scanner;

public class Principal{

	public static void main(String[] args){

		System.out.println("Bienvenido al sistema de aprobacion");

		CursoBienes cursoUno = new CursoBienes();

		cursoUno.calculoAlumnos();
		cursoUno.entregarResultados();
	}
}