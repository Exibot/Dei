import java.util.Scanner;

public class Numero{

	private int numeroMayor;

	public void determinarNumero(int numero){

		int contador;
		int numeroEvaluar;
		numeroMayor = numero;
		contador = 0;

		Scanner entrada = new Scanner(System.in);

		while(contador<9){
			System.out.print("Ingrese un numero: ");
			numeroEvaluar = entrada.nextInt();

			if(numeroEvaluar > numeroMayor){
				numeroMayor = numeroEvaluar;
			}

			System.out.println();
			contador +=1;
		}
	}

	public int obtenerNumero(){
		return numeroMayor;
	}

}