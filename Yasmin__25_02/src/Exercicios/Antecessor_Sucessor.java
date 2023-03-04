//7. Ler um número inteiro e imprimir seu sucessor e seu antecessor.

package Exercicios;

import java.util.Scanner;

public class Antecessor_Sucessor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int numero, antecessor, sucessor;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		
		antecessor = numero - 1;
		sucessor = numero + 1;
		
		System.out.println("O antecessor desse numero é: "+antecessor);
		System.out.println("O sucessor desse numero é: " +sucessor);
	}
}
