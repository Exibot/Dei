import java.util.Scanner;

public class Separacion{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		int numero;
		int residuo;
		int quinto;
		int cuarto;
		int tercero;
		int segundo;
		int primero;

		System.out.println("Ingrese el numero");
		numero = entrada.nextInt();

		quinto = numero / 10000;
		residuo = numero % 10000;

		cuarto = residuo / 1000;
		residuo = residuo % 1000;

		tercero = residuo / 100;
		residuo = residuo % 100;

		segundo = residuo / 10;
		residuo = residuo % 10;

		primero = residuo;

		System.out.printf("%d  ",quinto);
		System.out.printf("%d  ",cuarto);
		System.out.printf("%d  ",tercero);
		System.out.printf("%d  ",segundo);
		System.out.printf("%d  ",primero);
		//System.out.printf("%d\n",quinto);
		//System.out.printf("%d",residuo);


	}

}