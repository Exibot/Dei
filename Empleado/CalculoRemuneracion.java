public class CalculoRemuneracion{

	private String nombreEmp;
	private String apellidoEmp;
	private double salarioEmp;
	private double aumento;


	public CalculoRemuneracion(	String nombre, String apellido, double salario ){
		nombreEmp = nombre;
		apellidoEmp = apellido;
		salarioEmp = salario;
	}

	public double obtenerAumentoRemuneracion(){
		return aumento;
	}

	public void aumentoDeRemuneracion(){
		aumento = salarioEmp *1.10;
	}

}