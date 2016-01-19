import java.util.Scanner;

public class Salario{

	private String name;
	private String lastName;
	private int workHours;
	private int horasExtras;
	private double salario;
	private int horaHombre;
	
	public Salario( String nombre, String apellido, int horasTotales, int valorHora ){

		name = nombre;
		lastName = apellido;
		workHours = horasTotales;
		horaHombre = 1000;
	}

	public void calculoSalario(){
		
		if(workHours > 40){
			horasExtras = workHours - 40;
			salario = horaHombre * 40 + (horaHombre * 1.5 * horasExtras);
		}
		else{

			salario = horaHombre * workHours;
		}
	}

	public double obtenerSalario(){
		return salario;
	}

	public String obtenerNombre(){
		return lastName;
	}
}