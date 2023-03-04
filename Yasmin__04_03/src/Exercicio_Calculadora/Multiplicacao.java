package Exercicio_Calculadora;

public class Multiplicacao {

		//VARIAVEIS
		private double mult ;
		double valor1 , valor2 ;
		
		//3 MULTIPLICACAO
		
		//GET E SET
		public double getMult() {
			return mult;
		}

		public void setMult(double mult) {
			this.mult = mult;
		}
		
		//CLACULO
		public void Mult (double valor1 , double valor2) {
				
				mult = valor1 * valor2 ;
				System.out.println(mult);	
		}
}
