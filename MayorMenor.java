import java.util.Scanner;

public class MayorMenor{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int max=0;
		int min=0;
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int numero5;


		System.out.print("Ingrese el primer numero: ");
		numero1 = entrada.nextInt();
		max = numero1;
		min = numero1;

		//Segundo Numero
		System.out.print("Ingrese el segundo numero: ");
		numero2 = entrada.nextInt();

		if(numero2 >= max)
			max = numero2;

		if(numero2 <= min)
			min = numero2;


		//Tercer Numero
		System.out.print("Ingrese el tercer numero: ");
		numero3 = entrada.nextInt();

		if(numero3 >= max)
			max = numero3;

		if(numero3 <= min)
			min = numero3;

		//Cuarto Numero
		System.out.print("Ingrese el cuarto numero: ");
		numero4 = entrada.nextInt();

		if(numero4 >= max)
			max = numero4;

		if(numero4 <= min)
			min = numero4;


		//Segundo Numero
		System.out.print("Ingrese el Quinto numero: ");
		numero5 = entrada.nextInt();

		if(numero5 >= max)
			max = numero5;

		if(numero5 <= min)
			min = numero5;


		System.out.printf("El numero Maximo es: %d\n",max);
		System.out.printf("El numero Minimo es: %d\n",min);



	}


}