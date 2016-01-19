import java.util.Scanner;

public class CalculadoraBasica{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;
		int resultado;

		System.out.println("Ingrese el primer numero");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el segundo numero");
		numero2 = entrada.nextInt();

		resultado = numero2 + numero1;

		System.out.printf("La suma es de %d\n", resultado);

		resultado = numero1 * numero2;

		System.out.printf("La multiplicacion es de %d\n", resultado);

		resultado = numero1 / numero2;

		System.out.printf("La division es de %d\n", resultado);

		resultado = numero1 - numero2;

		System.out.printf("La resta es de %d\n", resultado);




	}

}