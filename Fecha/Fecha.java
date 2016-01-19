public class Fecha{

	private int diaFormato;
	private int mesFormato;
	private int anioFormato;
	private String formato;

	public Fecha(int dia, int mes, int anio){
		diaFormato = dia;
		mesFormato = mes;
		anioFormato = anio;
	}

	public void formatoFecha(){
		formato = "%i/",diaFormato,"%i/",mesFormato,"%i",anioFormato;
	}

	public String obtenerFechaFormato(){
		return formato;
	}
}