import java.util.Scanner;

public class Cuentas{

	private int numeroCuenta;
	private	int totalArt;
	private	int totalCre;
	private	double limiteCre;
	private	double saldoIni;
	private double saldoFinal;

	public Cuentas(int nroCuenta, double saldoInicial, int totalArticulos, int totalCreditos, double limiteCredito){

	 	numeroCuenta = nroCuenta;
		totalArt = totalArticulos;
		totalCre = totalCreditos;
		saldoIni = saldoInicial;
		limiteCre = limiteCredito;
	}

	public void calculoSaldo(){

		saldoFinal = saldoIni + totalArt - totalCre;
	}

	public double obtenerSaldo(){
		return saldoFinal;
	}

	public String resultadoCuenta(){

		if(saldoFinal > totalCre){
			return "Se ha excedido del monto permitido en su cuenta";
		}
		else{

			return "Su cuenta esta dentro del limite permitido";
		}

	}

}