public class FichaPersonal{

	private int diaFormato;
	private int mesFormato;
	private int anioFormato;
	private String formato;

	public FichaPersonal(int dia, int mes, int anio){
		diaFormato = dia;
		mesFormato = mes;
		anioFormato = anio;
	}

	public void formatoFecha(){
		formato = "%i/"+diaFormato+"%i/"+mesFormato+"%i"+anioFormato;
	}

	public String obtenerFechaFormato(){
		return formato;
	}
}