import java.util.Scanner;
import java.io.*;

public class Factorial{

	public static void main(String[] args) {
		
		double numeroFactorial;
		double resultado;
		double suma;
		int i;
		int largo;
		int x;

		x = 1;
		i = 1;
		suma = 0;
		resultado = 1;

		System.out.println("Sistema de calculo de factorial");

		Scanner entrada = new Scanner(System.in);	
		System.out.println("Ingrese el numero a calcular el factorial: ");
		numeroFactorial = entrada.nextDouble();

		System.out.println("Ingrese el valor de x: ");
		x = entrada.nextInt();

		for (int j=1; j<=numeroFactorial ; j++ ) {
			
			while(i <= j){
				x *= x;
				resultado = resultado * i;
				i ++;
			}
			i=1;
			suma = suma + (x/resultado);
			System.out.printf("El resultado es: %f \n",suma);

			resultado = 1;
			x = 1;
		}

		suma = suma + 1;

		System.out.printf("El resultado del factorial es: %f \n",suma);
	}

}