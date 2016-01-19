import java.util.Scanner;
import java.io.;

public class Principal{

	public static void main(String[] args) {

		int numeroIngreso;
		int descompuesto;
		int compuesto;
		int divisor;
		int numeroResidual;
		int cifra;
		int primero;
		int segundo;
		int tercero;
		int cuarto;

		numeroResidual = 0;
		
		System.out.println("Bienvenido al sistema de criptografia");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero de 4 digitos a cifrar: ");
		numeroIngreso = entrada.nextInt();



		for (int i = 4; i != 0 ; i--) {

			for (j=1;j<=i ;j++ ) {
				divisor *= 10;				
			}

			descompuesto = numeroIngreso / divisor;
			numeroResidual = numeroIngreso % divisor;

			
			
			if (i == 4) {
				primero = descompuesto;
			}
			else if(i == 3){
				tercero = descompuesto;
			}
			else if (i == 2) {
				segundo = descompuesto;
			}
			else if (i == 1) {
				primero = descompuesto;				
			}


			
			descompuesto = numeroResidual;
			descompuesto = descompuesto + 7
			descompuesto = descompuesto + divisor;





			divisor = 1;
			compuesto += descompuesto;



		}		



	}

}