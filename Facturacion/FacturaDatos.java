public class FacturaDatos{

	private String  numeroDePiezas;
	private String descDePieza;
	private int cantidadDeCompra;
	private double precioDeArticulo;
	private double monto;

	// constructor de la clase
	public FacturaDatos(String nroPiezas, String descPieza, int cantidadCompra, double precioArt ){

		numeroDePiezas = nroPiezas;
		descDePieza = descPieza;
		cantidadDeCompra = cantidadCompra;
		precioDeArticulo = precioArt;

	}

	public Double obtenerMonto(){
		return monto;
	}

	public void calcularMontoFactura(){
		monto = cantidadDeCompra * precioDeArticulo;
	}
}
