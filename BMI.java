import java.util.Scanner;

public class BMI {

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		double peso;
		double altura;
		double bmi;

		System.out.println("Ingrese el Peso(KG)");
		peso = entrada.nextDouble();

		System.out.println("Imgrese la estatura");
		altura = entrada.nextDouble();

		bmi = peso / (altura * altura);

		System.out.printf("El valor del BMI es: %f\n", bmi);

		System.out.println("Valores de BMI");
		System.out.println("Bajo peso: menos de 18,5");
		System.out.println("Normal: entre 18,5 y 24,9");
		System.out.println("Sobrepeso: entre 25 y 29,9");
		System.out.println("Obeso: mas de 30");




	}


}