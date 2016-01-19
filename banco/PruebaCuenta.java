import java.util.Scanner;

public class PruebaCuenta{

	public static void main(String[] args){

		Cuenta cuenta1 = new Cuenta(50.00);
		Cuenta cuenta2 = new Cuenta(-7.53);

		System.out.printf("Saldo cuenta numero 1: $%.2f\n ", cuenta1.obtenerSaldo());
		System.out.printf("Saldo cuenta numero 2: $%.2f\n ", cuenta2.obtenerSaldo());

		Scanner entrada = new Scanner(System.in);
		double montoDeposito;

		//Deposito en la cuenta 1
		System.out.println("Ingrese el monto a depositar en la cuenta 1: ");
		montoDeposito = entrada.nextDouble();
		cuenta1.abonar(montoDeposito);
		System.out.printf("El saldo actual de la cuenta 1 es de: $%.2f\n", cuenta1.obtenerSaldo());

		//Deposito en la cuenta 2
		System.out.println("Ingrese el monto a depositar en la cuenta 2: ");
		montoDeposito = entrada.nextDouble();
		cuenta2.abonar(montoDeposito);
		System.out.printf("El saldo actual de la cuenta 2 es de: $%.2f\n", cuenta2.obtenerSaldo());

	}
}