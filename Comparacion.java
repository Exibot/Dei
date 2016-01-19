import java.util.Scanner;

public class Comparacion{

	public static void main(String[] args){

		Scanner entrada = new Scanner( System.in);

		int numero1;
		int numero2;

		System.out.println("Ingrese el primero numero");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el segundo numero");
		numero2 = entrada.nextInt();

		if(numero1==numero2)
			System.out.println("Los numeros son iguales");

		if(numero1<numero2)
			System.out.println("el primer numero es menor que el segundo");

		if(numero1>numero2)
			System.out.println("El priemr numero es mayor al segundo");

		if(numero1 != numero2)
			System.out.println("Los numeros son distintos");

	}

}