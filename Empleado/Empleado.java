import java.util.Scanner;

public class Empleado{

	public static void main(String[] args){

		String nombre;
		String apellido;
		double salario;

		Scanner input = new Scanner(System.in);

		System.out.println("Bienvenido al sistema de remuneraciones");

		System.out.print("Ingrese el nombre del Empleado 1: ");
		nombre = input.nextLine();
		System.out.println();

		System.out.print("Ingrese el apellido del Empleado 1: ");
		apellido = input.nextLine();
		System.out.println();

		System.out.print("Ingrese el salario del Empleado 1: ");
		salario = input.nextDouble();
		System.out.println();

		CalculoRemuneracion calculo = new CalculoRemuneracion(nombre, apellido, salario);

		calculo.aumentoDeRemuneracion();

		System.out.printf("El aumento del salario para el Empleado 1 es de: %f\n", calculo.obtenerAumentoRemuneracion());


	}


}