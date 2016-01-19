public class Principal{

	public static void main(String[] args) {
		
		int contador;
		contador = 1;

		System.out.println("Tabla de Valores");
		System.out.println();
		System.out.println("N    10*N    100*N    1000*N");

		while (contador <= 5) {

			System.out.printf("%d    ",contador);
			System.out.printf("%d      ",contador*10);
			System.out.printf("%d        ",contador*100);
			System.out.printf("%d    ",contador*100);
			System.out.println(); 

			contador+=1;
		}

	}
}