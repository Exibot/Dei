public class FrecuenciaCardiaca{

	private double diap;
	private double mesp;
	private double aniop;
	private double frecuenciaMaxima;
	private double frecuenciaEsperada;
	private double fechaActualAjuste;
	private double fechaPersonaAjuste;
	private double fechaCalculo;
	
	public FrecuenciaCardiaca(double dia, double mes, double anio ){
		diap = dia;
		mesp = mes;
		aniop = anio;
	}

	public void calculoFrecuenciaEsperada(){

		frecuenciaEsperada = frecuenciaMaxima * 0.8;

	}


	public void calculoFrecuenciaMaxima(){

		int diaActual = 29;
		int mesActual = 12;
		int anioActual = 2015;

		fechaActualAjuste = ((29 + (11 * 30))/12) + 2015;

		fechaPersonaAjuste = ((diap + (mesp * 30))/12) + aniop;

		fechaCalculo = fechaActualAjuste - fechaPersonaAjuste;

		frecuenciaMaxima = 220 - fechaCalculo;

	}

	public double obtenerFrecuenciaEsperada(){
		return frecuenciaEsperada;
	}

	public double obtenerFrecuenciaMaxima(){
		return frecuenciaMaxima;
	}
}