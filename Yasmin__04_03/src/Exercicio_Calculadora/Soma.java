package Exercicio_Calculadora;

public class Soma {

	private double soma ;
	double valor1 , valor2 ;
	
	//1 SOMA
	
	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma = soma;
	}
	
	public void Soma (double valor1 , double valor2) {
			
			soma = valor1 + valor2 ;
			System.out.println(soma);	
	}
}

