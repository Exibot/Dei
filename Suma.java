import java.util.Scanner;

public class Suma{

	public static void main(String[] args){

		// Objeto para la clase Scanner
		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		int suma;

		System.out.println("Ingrese el primer numero: ");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el segundo numero: ");
		numero2 = entrada.nextInt();

		suma = numero1 + numero2;

		System.out.printf("La suma es %d\n", suma);

	}


}