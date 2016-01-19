import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
		
		int lado;
		int contador;
		int horizontales;
		int verticales;
		lado = 0;
		contador = 0;
		horizontales = 0;
		verticales = 0;
		System.out.println("-----El cubo----");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el tamaño del lado de un cubo: ");
		lado = entrada.nextInt();

		while (contador <= lado) {
				
			if (contador == lado) {
				System.out.println();
				while(horizontales < lado){
					System.out.print("*");
					horizontales++;
				}
			}

			else if (contador == 0) {
				while(horizontales < lado){
					System.out.print("*");
					horizontales++;
				}
			}

			else if(contador != 0 || contador != lado){
				System.out.println();
				while(verticales <= lado){

					if (verticales == 0 || verticales == lado-1) {
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					verticales++;	
				}
			}
			 

			verticales = 0;
			horizontales = 0;
			contador ++;
		}

		/*	else if(contador != 0 && contador != lado){
				while(verticales <= lado){
					System.out.print("*");
					horizontales+=1;
			}

		 */
	
		System.out.println();
	}

}