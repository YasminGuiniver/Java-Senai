//5. Ler um número inteiro e imprimi-lo

package Exercicios;

import java.util.Scanner;

public class Leitura_Numero {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero inteiro");
		numero = in.nextInt();
		
		System.out.println("O numero inteiro é: "+numero);

	}

}
