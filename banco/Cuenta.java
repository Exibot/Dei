public class Cuenta{

	private double saldo;

	public Cuenta(double saldoInicial){

		saldo = saldoInicial;
	}

	public void abonar(double monto){

		saldo = saldo + monto;

	}

	public double obtenerSaldo(){

		return saldo;

	}
}