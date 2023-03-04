//9. Ler dois números inteiros e imprimir a soma. Antes do resultado, deverá
//aparecer
//a mensagem: Soma.

package Exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num1, num2, soma;
		
		System.out.println("Digite um numero");
		num1 = in.nextInt();
		
		System.out.println("Digite outro numero");
		num2 = in.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma é: "+soma);
	
	}

}
