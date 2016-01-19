import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		
		int numero;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para determinar el numero más grande");

		System.out.print("Ingrese un numero: ");
		numero = entrada.nextInt();

		System.out.println();

		Numero determinar = new Numero();
		determinar.determinarNumero(numero);

		System.out.printf("El Mayor numero es: %d",determinar.obtenerNumero());

	}
}