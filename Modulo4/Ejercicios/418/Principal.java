import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {

		int nroCuenta;
		int totalArticulos;
		int totalCreditos;
		double saldoInicial;
		double limiteCredito;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Ingrese el numero de la cuenta: ");
		nroCuenta = entrada.nextInt();

		System.out.print("Ingrese el saldo inicial del mes: ");
		saldoInicial = entrada.nextDouble();

		System.out.print("Ingrese el total de Articulos encargados en el mes: ");
		totalArticulos = entrada.nextInt();

		System.out.print("Ingrese el total de creditos aplicados a la cuenta: ");
		totalCreditos = entrada.nextInt();

		System.out.print("Ingrese el limite de credito permitido: ");
		limiteCredito = entrada.nextDouble();

		Cuentas cliente = new Cuentas(nroCuenta, saldoInicial, totalArticulos, totalCreditos, limiteCredito);

		cliente.calculoSaldo();

		System.out.printf("El balance final de la cuenta es: %f\n", cliente.obtenerSaldo());

		System.out.printf("Estado de cuenta: %s\n", cliente.resultadoCuenta());
		
	}

}