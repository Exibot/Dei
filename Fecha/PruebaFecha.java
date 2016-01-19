import java.util.Scanner

public class PruebaFecha{

	public static void main(String[] args){

		private int dia;
		private int mes;
		private int anio;

		System.out.println("Bienvenido al sistema de fechas");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el Dia: ");
		dia = entrada.nextInt();

		System.out.println("Ingrese el Mes: ");
		mes = entrada.nextInt();

		System.out.println("Ingrese el Anio");
		anio = entrada.nextInt();

		Fecha fecha1 = new Fecha(dia, mes, anio);

		fecha1.formatoFecha();

		System.out.printf("la fecha formateada es: %s\n", obtenerFechaFormato());

	}
}