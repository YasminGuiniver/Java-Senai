//14. Entrar com quatro números e imprimir a média ponderada, sabendo-se que os
//pesos são respectivamente: 1, 2, 3 e 4.

package Exercicios;

import java.util.Scanner;

public class Media_Ponderada {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1, num2, num3, num4;
		double media;
		
		System.out.println("Digite um numero inteiro");
		num1 = in.nextInt();
		
		System.out.println("Digite um outro numero inteiro");
		num2 = in.nextInt();
		
		System.out.println("Digite um outro numero inteiro");
		num3 = in.nextInt();
		
		System.out.println("Digite um outro numero inteiro");
		num4 = in.nextInt();
		
		media = ((num1 * 1) + (num2 * 2) + (num3 * 3) + (num4 * 4)) / 4;
		
		System.out.println("A media ponderada é: " +media);

	}

}
