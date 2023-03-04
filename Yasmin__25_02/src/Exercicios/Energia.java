//21. Antes de o racionamento de energia ser decretado, quase ninguém falava em
//quilowatts; mas, agora, todos incorporaram essa palavra em seu vocabulário.
//Sabendo-se que 100 quilowatts de energia custa um sétimo do salário-mínimo,
//fazer um algoritmo que receba o valor do salário-mínimo e a quantidade de
//quilo-
//watts gasta por uma residência e calcule. Imprima:
//o valor em reais de cada quilowatt
//m o valor em reais a ser pago
//o novo valor a ser pago por essa residência com um desconto de 10%.

package Exercicios;

import java.util.Scanner;

public class Energia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double salarioMinimo;
		int quilowatts;
		
		System.out.println("Digite o valor do salario minimo");
		salarioMinimo = in.nextDouble();
		
		System.out.println("Digite a quantidade de quilowatts que sua residencia gasta");
		quilowatts = in.nextInt();
		
		double valorUnico = (salarioMinimo / 7) / 100;
		System.out.println("O valor de cada quilowatts é: " +valorUnico);
		
		double valorPago = valorUnico * quilowatts;
		System.out.println("O valor a ser pago é: " +valorPago);
		
		double valorDesconto, desconto;
		desconto = (valorPago * 10) / 100;
		valorDesconto = valorPago - desconto;
		
		System.out.println("Com o desconto de " +desconto+ "% o valor passa a ser: " +valorDesconto);
		

	}

}
