//34 - Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os da-
//dos fornecidos serão: valor da hora aula, número de aulas dadas no mês e percentual
//de desconto do INSS.

package Exercicios;

import java.util.Scanner;

public class ValorInss {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int aulasDadas;
		double valorAulas, descontoINSS;
		
		System.out.println("Digite quantas aulas você deu:");
		aulasDadas = in.nextInt();
		
		System.out.println("Qual é o valor das aulas");
		valorAulas = in.nextDouble();
		
		System.out.println("Digite o desconto do INSS");
		descontoINSS = in.nextDouble();
		
		double salarioBruto;
		salarioBruto = aulasDadas * valorAulas;
		
		double salarioLiquido;
		salarioLiquido = salarioBruto - descontoINSS;
		
		System.out.println("Seu salario bruto é de: " +salarioBruto);
		System.out.println("Seu salario liquido é de: " +salarioLiquido);
		
	}

}
