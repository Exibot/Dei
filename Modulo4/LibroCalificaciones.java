import java.util.Scanner;

public class LibroCalificaciones{
	private String nombreDelCurso;
	
	public LibroCalificaciones(String nombreCurso){

		nombreDelCurso = nombreCurso;

	}

	public String obtenerNombreCurso(){
		return nombreDelCurso;
	}

	public void mostrarMensaje(){
		System.out.printf("Muchas gracias por utilizar calculo Promedios para: %s\n", obtenerNombreCurso());

	}

	public void determinarPromedio(){

		Scanner entrada = new Scanner(System.in);

		int total;
		int contadorCalif;
		int calificacion;
		double promedio;

		total = 0;
		contadorCalif = 0;

		System.out.println("Escriba una calificacion o '-1' para terminar");
		calificacion = entrada.nextInt();

		while(calificacion != -1){

			total = calificacion + total;
			System.out.println("Escriba una calificacion o '-1' para terminar");
			calificacion = entrada.nextInt();
			contadorCalif = contadorCalif + 1;

		}

		if(contadorCalif != 0){

			promedio = (double) total/contadorCalif;
			System.out.printf("El promedio del curso es de:%f\n", promedio);
		}
		else{
			System.out.println("Usted no ingreso ningun calificacion");
		}
	}

}