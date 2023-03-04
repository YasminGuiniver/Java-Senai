//10. Ler dois números inteiros e imprimir o produto.

package Exercicios;

import java.util.Scanner;

public class Produto_Inteiro {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1, num2, produto;
		
		System.out.println("Digite um numero");
		num1 = in.nextInt();
		
		System.out.println("Digite um numero");
		num2 = in.nextInt();
		
		produto = num1 * num2;
		
		System.out.println("O produto desses 2 numeros são: "+produto);

	}

}
