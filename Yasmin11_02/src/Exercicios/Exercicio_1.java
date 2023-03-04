package Exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double precoProduto, desconto, precoDesconto, precoFinal;
		
		System.out.println("Digite o valor do produto");
		precoProduto = in.nextDouble();
		
		System.out.println("Digite o valor do desconto");
		desconto = in.nextDouble();
		
		precoDesconto = precoProduto * (desconto/100);
		precoFinal = precoProduto - precoDesconto;
		
		System.out.println("O valor do produto é: " +precoProduto+ "\nO valor do desconto é: " +desconto+ "\nO valor do prduto com desconto"
				+ "é : " +precoFinal);
	}

}

//1. Usando a classe Scanner para entrada de dados, crie uma classe que
//receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor
//do desconto e o valor do produto com o desconto. Observação: o valor do desconto é
//calculado por meio da fórmula: valor do desconto = valor do produto * percentual de
//desconto / 100.
