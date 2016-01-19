public class LibroCalificaciones{

	private String nombreDelCurso;

	public LibroCalificaciones(String nombre){
		nombreDelCurso = nombre;
	}

	public void establecerNombreDelCurso(String nombreCurso){

		nombreDelCurso = nombreCurso;

	}

	public String obtenerNombreDelCurso(){
		
		return nombreDelCurso;
	}

	public void mostrarMensaje(){

		System.out.printf("Bienvenido al libro de Calificaciones %s\n", obtenerNombreDelCurso() );
	}

}