import java.util.Scanner;

public class CursoBienes{

	private int aprobados;
	private int reprobados;

	public void calculoAlumnos(){

		int contador;
		int alumnoEvaluado;

		contador = 0;

		Scanner entrada = new Scanner(System.in);

		while(contador < 10){

			System.out.printf("Ingrese el estado del alumno %d\n",contador);
			alumnoEvaluado=entrada.nextInt();

			if(alumnoEvaluado == 1){
				aprobados = aprobados + 1;
			}
			else{
				reprobados = reprobados + 1;
			}

			contador = contador + 1;
		}
	}

	public void entregarResultados(){

		System.out.printf("La cantidad de aprobados es de: %d\n", aprobados);
		System.out.printf("La cantidad de reprobados es de: %d\n", reprobados);

		if(aprobados>=8){
			System.out.println("Bono para el profesor por tener mas de 8 aprobados");
		}
		else{
			System.out.println("No se alcanzó los 8 aprobados");
		}
	}

}