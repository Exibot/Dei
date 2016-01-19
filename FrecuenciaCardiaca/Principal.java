import java.util.Scanner;

public class Principal{

	public static void main(String[] args){

		int dia;
		int mes;
		int anio;
		double altura;
		String nombre;
		String apellido;
		String sexo;
		String direccion;
		Double peso;

		System.out.println("::Sistema Medico Clinica Austral::");

		Scanner entrada = new Scanner(System.in);

		//Datos personales
		System.out.print("Ingrese su Nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Ingrese su Apellido: ");
		apellido = entrada.nextLine();

		System.out.print("Ingrese la Altura: ");
		altura = entrada.nextDouble();

		System.out.print("Ingrese su peso: ");
		peso = entrada.nextDouble();

		System.out.print("Sexo: ");
		sexo = entrada.nextLine();

		System.out.print("Direccion: ");
		direccion = entrada.nextLine();

		//Fecha de Nacimiento
		System.out.println("---Fecha de Nacimiento---");
		System.out.println("Dia de Nacimiento:");
		dia = entrada.nextInt();

		System.out.println("Mes de Nacimiento: ");
		mes = entrada.nextInt();

		System.out.println("Anio de Nacimiento: ");
		anio = entrada.nextInt();


		//Ficha Personal
		FichaPersonal ficha1 = new FichaPersonal(dia, mes, anio);

		ficha1.formatoFecha();

		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Apellido: %s\n",apellido);
		System.out.printf("Fecha de Nacimiento: %s\n",ficha1.obtenerFechaFormato());
		System.out.printf("Sexo: %s\n",sexo);
		System.out.printf("Direccion: %s\n",direccion);
		System.out.printf("Peso: %s\n",peso);


		//BMI

		MasaCorporal masa = new MasaCorporal(peso, altura);

		masa.calculoBMI();

		System.out.printf("El bmi de la persona es de: %f", masa.obtenerBMI());
		System.out.println("Valores de BMI");
		System.out.println("Bajo peso: menos de 18,5");
		System.out.println("Normal: entre 18,5 y 24,9");
		System.out.println("Sobrepeso: entre 25 y 29,9");
		System.out.println("Obeso: mas de 30");



		// Frecuencia Corporal
		FrecuenciaCardiaca frecuencia = new FrecuenciaCardiaca(dia, mes, anio);

		frecuencia.calculoFrecuenciaMaxima();
		System.out.printf("la Frecuencia Maxima es de: %f\n", frecuencia.obtenerFrecuenciaMaxima());

		frecuencia.calculoFrecuenciaEsperada();
		System.out.printf("La frecuencia cardiaca esperada es de: %f\n", frecuencia.obtenerFrecuenciaEsperada());
	}
}