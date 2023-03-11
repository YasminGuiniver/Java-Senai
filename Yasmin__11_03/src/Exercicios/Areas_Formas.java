package Exercicios;

import java.util.Scanner;

public class Areas_Formas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String forma;
		double base , altura, area;
		
		System.out.println("Qual forma geométrica você quer? (quadrado, triangulo, retangulo)");
		forma = in.next();
		
		switch (forma) {
		case "triangulo": {
			System.out.println("Digite o valor da base");
			base = in.nextDouble();
			
			System.out.println("Digite o valor da altura");
			altura = in.nextDouble();
			
			area = (base * altura) / 2;
			
			System.out.println("A area do " +forma+ " é de: " +area);
			
			break;
		}
		case "retangulo": {
			System.out.println("Digite o valor da base");
			base = in.nextDouble();
			
			System.out.println("Digite o valor da altura");
			altura = in.nextDouble();
			
			area = base * altura;
			
			System.out.println("A area do " +forma+ " é de: " +area);
			
			break;
		}
		case "quadrado":{
			System.out.println("Digite o valor da base");
			base = in.nextDouble();
			
			System.out.println("Digite o valor da altura");
			altura = in.nextDouble();
			
			area = base * altura;
			
			System.out.println("A area do " +forma+ " é de: " +area);
			
			break;
		}
		default:
			System.out.println("Não temos essa figura :(");
		}
	}

}
