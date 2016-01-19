import java.util.Scanner;

public class Poblacion {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		double poblacion;
		double tasa;
		double tasaConversion;
		double proyeccion;

		System.out.println("Ingrese la Poblacion actual: ");
		poblacion = entrada.nextDouble();

		System.out.println("Ingrese la tasa anual de crecimiento: ");
		tasa = entrada.nextDouble();

		tasaConversion = (tasa / 100) + 1;

		proyeccion = poblacion * tasaConversion;
		System.out.printf("La proyeccion para un año es de: %f\n",proyeccion);

		tasaConversion = (tasa*2 / 100) + 1;
		proyeccion = poblacion * tasaConversion;
		System.out.printf("La proyeccion para dos años es de: %f\n",proyeccion);


		tasaConversion = (tasa*3 / 100) + 1;	
		proyeccion = poblacion * tasaConversion;
		System.out.printf("La proyeccion para tres años es de: %f\n",proyeccion);

		tasaConversion = (tasa*4 / 100) + 1;
		proyeccion = poblacion * tasaConversion;
		System.out.printf("La proyeccion para cuatro años es de: %f\n",proyeccion);

		tasaConversion = (tasa*5 / 100) + 1;
		proyeccion = poblacion * tasaConversion;
		System.out.printf("La proyeccion para cinco años es de: %f\n",proyeccion);


	}

}