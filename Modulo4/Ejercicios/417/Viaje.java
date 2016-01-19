import java.util.Scanner;

public class Viaje{

	public static void main(String[] args){

		int kilometraje;
		int litros;

		System.out.println("Bienvenido al calculo de litros");
		
		Gasto tramo = new Gasto();
		tramo.calculo();
		System.out.printf("El promedio total de gasto de combustible es de:%f\n",tramo.obtenerResultados());
	}
}