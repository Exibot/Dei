import java.util.Scanner;

public class Gasto {

	private int kilometraje;
	private int litros;
	private double resultado;
	

	public void calculo(){

		int control;
		int cantidadResultado;
		int sumaKilometros;
		int sumaLitros;
		double sumaResultados;


		control = 1;
		cantidadResultado = 0;
		sumaResultados = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Cuantos tramos de viaje desea ingresar:");
		control = entrada.nextInt();
		while(cantidadResultado < control){

				System.out.printf("Tramo Nro:%d\n",cantidadResultado+1);
				System.out.print("Ingrese el tramo en Kilometros: ");
				kilometraje = entrada.nextInt();

				System.out.print("Ingrese los litros de combustible utilizado: ");
				litros = entrada.nextInt();

				resultado = (double) kilometraje/litros;
				sumaResultados+= resultado;
				cantidadResultado +=1;

				System.out.println();

		}
		resultado = sumaResultados/cantidadResultado;
	}

	public double obtenerResultados(){
		return resultado;
	}

}