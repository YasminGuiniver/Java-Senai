//15. Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante,
//cossecante e cotangente deste ângulo.

package Exercicios;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class Grau {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int angulo;
		
		System.out.println("Entre com um valor em graus");
		angulo = in.nextInt();
		
		//FAZENDO A CONVERSÃO PARA PODER USAR AS FUNÇÕES
		double radiano = Math.toRadians(angulo);
		
		//VARIAVEIS QUE IRAÕ RECEBER OS VALORES DO SENO, COSSENO E TANGENTE
		double seno = Math.sin(radiano);
		double cosseno = Math.cos(radiano);
		double tangente = Math.tan(radiano);
		
		//VARIAVEIS DOS secante, cossecante e cotangente
		
		double secante, cossecante, contangente;
		
		secante = 1 / seno;
		cossecante = 1 / cosseno;
		contangente = 1 / tangente;
		

		System.out.printf("Para o angulo " +angulo+ "° temos: " + "\n"
				+ "Seno com valor de: " +seno+ "\n"
				+ "Cosseno com valor de: " +cosseno+ "\n"
				+ "Tangente com valor de: " +tangente+ "\n"
				+ "Secante com valor de: " +secante+ "\n"
				+ "Cossecante com valor de: " +cossecante+ "\n"
				+ "Contangente com valor de: " +contangente);	
	}

}
