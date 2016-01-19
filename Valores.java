import java.util.Scanner;

public class Valores{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int numero;

		//Ingreso de un numero
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if(numero < 0)
			negativos = negativos + 1;

		if(numero > 0)
			positivos = positivos + 1;

		if(numero == 0)
			ceros = ceros + 1;


		//Ingreso de un numero
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if(numero < 0)
			negativos = negativos + 1;

		if(numero > 0)
			positivos = positivos + 1;

		if(numero == 0)
			ceros = ceros + 1;

		//Ingreso de un numero
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if(numero < 0)
			negativos = negativos + 1;

		if(numero > 0)
			positivos = positivos + 1;

		if(numero == 0)
			ceros = ceros + 1;


//Ingreso de un numero
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if(numero < 0)
			negativos = negativos + 1;

		if(numero > 0)
			positivos = positivos + 1;

		if(numero == 0)
			ceros = ceros + 1;


//Ingreso de un numero
		System.out.println("Ingrese un numero: ");
		numero = entrada.nextInt();

		if(numero < 0)
			negativos = negativos + 1;

		if(numero > 0)
			positivos = positivos + 1;

		if(numero == 0)
			ceros = ceros + 1;

	
		System.out.printf("La cantidad de positivos es: %d\n", positivos);
		System.out.printf("La cantidad de negativos es: %d\n", negativos);
		System.out.printf("La cantidad de ceros es: %d\n", ceros);


	}


}