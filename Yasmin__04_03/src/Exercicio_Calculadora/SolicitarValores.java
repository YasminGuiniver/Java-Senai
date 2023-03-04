package Exercicio_Calculadora;

import java.util.Scanner;

public class SolicitarValores {
		Soma so = new Soma ();
		Subtracao sub = new Subtracao ();
		Multiplicacao mult = new Multiplicacao ();
		Divisao divi = new Divisao ();
		
		
		Scanner in = new Scanner (System.in);
		
		public void SolicitarValores () {
			double valor1, valor2;
			String resposta;
			
			System.out.println("Digite o valor 1");
			valor1 = in.nextDouble();
			
			System.out.println("Digite o valor 2");
			valor2 = in.nextDouble();
			
			System.out.println("Qual operador matemático você deseja? ( + , - , X , :)");
			resposta = in.next();
			
			if (resposta.equals("+")) {
				so.Soma(valor1, valor2);	
				System.out.println(this.so);
			}
			if (resposta.equals("-")) {
				sub.Sub(valor1, valor2);
				System.out.println(this.sub);
			}
			if (resposta.equals("X") || resposta.equals("x")) {
				mult.Mult(valor1, valor2);
				System.out.println(this.mult);
			}
			if (resposta.equals(":")) {
				divi.Divisao(20, 2);
				System.out.println(this.divi);
			}
		}
}
