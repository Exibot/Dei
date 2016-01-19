import java.util.Scanner;
import java.io.*;

public class Binarios{

	public static void main(String[] args) {
		
		int numeroBinario;
		int largo;
		int divisor;
		int bit;
		int posicion;
		int numeroEntero;
		divisor = 1;
		bit = 1;
		numeroEntero = 0;
		posicion = 0;

		System.out.println("Conversion de binario a entero natural");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero binario");
		numeroBinario = entrada.nextInt();

		largo = (int) Math.log10(numeroBinario)+1;

		//System.out.printf("%d\n",largo);


		for (int i = largo; i != 0; i--) {

			for (int j = 0; j < i; j++) {
				divisor *= 10;
				bit *=2;
			}

			posicion = numeroBinario / divisor;
			numeroBinario = numeroBinario % divisor;
			posicion = posicion * bit;
			numeroEntero += posicion;

			divisor = 1;
			bit = 1;			
		}

		System.out.printf("El numero entero decimal es de %d: \n",numeroEntero);

	}

}