public class MasaCorporal {

		private double pesoM;
		private double alturaM;
		private double bmi;

		public MasaCorporal(double peso, double altura){
			pesoM = peso;
			alturaM = altura;
		}

		public void calculoBMI(){

			bmi = pesoM/ (alturaM * alturaM);

		}

		public double obtenerBMI(){
			return bmi;
		}
	
}