//33 - Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas
//vendas oferecendo desconto. Faça um algoritmo que possa entrar com o valor de
//um produto e imprima o novo valor tendo em vista que o desconto foi de 9%.



package Exercicios;

import java.util.Scanner;

public class Desconto_9 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valorOriginal, valorNovo;
		
		System.out.println("Entre com o valor do produto");
		valorOriginal = in.nextDouble();
		
		double desconto = (valorOriginal / 100) * 9;
		
		valorNovo = valorOriginal - desconto;
		
		System.out.println("O valor com desconto é de: "+valorNovo);
		
	}

}
