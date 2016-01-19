import java.util.Scanner;

public class Producto{

	public static void main(String[] args){

		Scanner entrada = new Scanner( System.in );

		int numero1;
		int numero2;
		int numero3;
		int valorFinal;

		System.out.println("Ingrese el Primer Numero");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el Segundo Numero");
		numero2 = entrada.nextInt();

		System.out.println("Ingrese el Tercer Numero");
		numero3 = entrada.nextInt();

		valorFinal = numero1 * numero2 * numero3;

		System.out.printf("El valor del producto es de %d\n", valorFinal);


	}

}