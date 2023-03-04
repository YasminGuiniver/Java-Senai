package Exercicio_Calculadora;

public class Subtracao {

	//VARIAVEIS
	private double sub ;
	double valor1 , valor2 ;
	
	//2 SUBTRAÇĂO
	
	//GET E SET
	public double getSub() {
		return sub;
	}

	public void setSub(double sub) {
		this.sub = sub;
	}
	
	//CALCULO
	public void Sub (double valor1 , double valor2) {
			
			sub = valor1 - valor2 ;
			System.out.println(sub);	

	}
}
