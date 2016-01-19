public class Damas{

	public static void main(String[] args) {
		
	System.out.println("Tablero de Damas");

		for (int i=0; i<8 ; i++ ) {

			if(i%2 == 0){
				System.out.print("* ");
				for (int j=0; j<7 ;j++ ) {
					System.out.print("* ");
				}
			}
			else{
				System.out.print(" ");
				for (int j=0; j<7 ;j++ ) {
					System.out.print("* ");
				}
			}

			System.out.println();
		}

	}

}