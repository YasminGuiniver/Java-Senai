//16. Entrar com um número e imprimir o logaritmo desse número na base 10.

package Exercicios;

import java.util.Scanner;

public class Logaritmo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double numero;
		
		System.out.println("Digite um numero");
		numero = in.nextDouble();
		
		double log = Math.log10(numero);
		
		System.out.println("O logaritmo com base 10 desse numero é: " +log);
	}

}
