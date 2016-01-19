// palidromo
import java.io.*;
import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		
		int numero;
		int primero;
		int segundo;
		int tercero;
		int cuarto;
		int quinto;
		int largo;


		System.out.println("calculo de polidromos");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero de 5 digitos");
		numero = entrada.nextInt();

		largo = (int) Math.log10(numero) + 1;

		System.out.printf("largo del numero: %d",largo);

		while(largo != 5){

			System.out.println("Ingrese un numero de 5 digitos");
			numero = entrada.nextInt();

		}
		System.out.println();

		primero = numero / 10000;
		numero = numero % 10000;

		segundo = numero / 1000;
		numero = numero % 1000;

		tercero = numero / 100;
		numero = numero % 100;

		cuarto = numero / 10;
		numero = numero % 10;

		quinto = numero;


		if(primero != quinto){
			System.out.println("Este numero no es un polimero");
		}
		else if(segundo != cuarto){
			System.out.println("Este numero no es un polimero");
		}
		else{
			System.out.println("este numero es un polimero");
		}				

	
	}

}