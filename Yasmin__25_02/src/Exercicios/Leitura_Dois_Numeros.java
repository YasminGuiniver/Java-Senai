//6. Ler dois números inteiros e imprimi-los.

package Exercicios;

import java.util.Scanner;

public class Leitura_Dois_Numeros {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um numero inteiro");
		num1 = in.nextInt();
		
		System.out.println("Digite outro numero inteiro");
		num2 = in.nextInt();
		
		System.out.println("Os numeros digitados foram: "+num1+ " e " +num2);
	}

}
