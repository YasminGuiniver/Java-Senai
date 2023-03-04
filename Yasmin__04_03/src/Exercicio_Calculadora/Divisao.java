package Exercicio_Calculadora;

public class Divisao {

		//VARIAVEIS
		private double divi ;
		double valor1 , valor2 ;
		
		//4 DIVISĂO
		
		//GET E SET
		public double getDivisao() {
			return divi;
		}

		public void setDivisao(double divi) {
			this.divi = divi;
		}
		
		//CALCULO
		public void Divisao (double valor1 , double valor2) {
				
			divi = valor1 / valor2 ;
			System.out.println(divi);
		}
}
