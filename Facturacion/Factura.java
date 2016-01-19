import java.util.Scanner;

public class Factura{

	public static void main(String[] args){

		String numeroDePieza;
		String descripcionDePieza;
		int cantidadComprar;
		double precioArticulo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Bienvenido al Sistema de Facturacion");
		System.out.println("A continuacion se le solicitaran datos para generar la factura");
		
		System.out.println("Ingrese el numero de piezas:");
		numeroDePieza = entrada.nextLine();

		System.out.println("Ingrese la descripcion del articulo");
		descripcionDePieza = entrada.nextLine();

		System.out.println("Ingrese la cantidad a comprar");
		cantidadComprar = entrada.nextInt();

		System.out.println("Ingrese el valor del articulo");
		precioArticulo = entrada.nextDouble();

		 //creacion del objeto
		FacturaDatos datos = new FacturaDatos(numeroDePieza, descripcionDePieza, cantidadComprar, precioArticulo);

		datos.calcularMontoFactura();

	 	System.out.printf("El monto de la factura es de $%f\n", datos.obtenerMonto());

	}

}