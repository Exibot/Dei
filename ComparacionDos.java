import java.util.Scanner;

public class ComparacionDos{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.println("Ingrese el Primero numero");
		numero1 = entrada.nextInt();

		System.out.println("Ingrese el Segundo numero");
		numero2 = entrada.nextInt();

	if(numero1 == numero2)		
		System.out.printf("Estos numeros son iguales");

	else if(numero1 > numero2)
		System.out.printf("El numero %d",numero1," es mas grande\n");
	else
		System.out.printf("El numero %d",numero2,"es mas grande\n");

	}

}
