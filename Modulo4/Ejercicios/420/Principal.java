import java.util.Scanner;
public class Principal{

	public static void main(String[] args) {
		
		String nombre;
		String apellido;
		int horasTotales;
		int valorHora;

		int i;
		i=1;


		Scanner entrada = new Scanner(System.in);

			System.out.println("Ingrese el valor de la hora hombre: ");
			valorHora = entrada.nextInt();

			System.out.println("Ingrese los datos Trabajador Uno");
		
			System.out.println("Ingrese le nombre del Trabajador");
			nombre = entrada.nextLine();

			System.out.println("Ingrese el apellido del Trabajador");
			apellido = entrada.nextLine();

			System.out.println("Ingrese el el total de horas trabajadas");
			horasTotales = entrada.nextInt();

			Salario trabajador1 = new Salario(nombre, apellido, horasTotales, valorHora);


		/*	// Trabajador 2

			System.out.println("Ingrese los datos Trabajador Dos");
		
			System.out.println("Ingrese le nombre del Trabajador");
			nombre = entrada.nextLine();

			System.out.println("Ingrese el apellido del Trabajador");
			apellido = entrada.nextLine();

			System.out.println("Ingrese el el total de horas trabajadas");
			horasTotales = entrada.nextInt();

			Salario trabajador2 = new Salario(nombre, apellido, horasTotales, valorHora);

			// Trabajador 3

			System.out.println("Ingrese los datos Trabajador Tres");
		
			System.out.println("Ingrese le nombre del Trabajador");
			nombre = entrada.nextLine();

			System.out.println("Ingrese el apellido del Trabajador");
			apellido = entrada.nextLine();

			System.out.println("Ingrese el el total de horas trabajadas");
			horasTotales = entrada.nextInt();

			Salario trabajador3 = new Salario(nombre, apellido, horasTotales, valorHora); */

			trabajador1.calculoSalario();			
			System.out.println("los sueldos son los siguientes: ");
			System.out.printf("Trabajador: %s\n",trabajador1.obtenerNombre());
			System.out.printf("Salario: %f\n",trabajador1.obtenerSalario());
	}
}