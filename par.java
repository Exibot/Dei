import java.util.Scanner;

public class par{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int numero;

		System.out.println("Ingrese el numero a evaluar");
		numero = entrada.nextInt();

		if(numero%2 == 0)
			System.out.printf("El numero es par %d",numero);

		else
			System.out.printf("El numero es impar %d",numero);



	}


}