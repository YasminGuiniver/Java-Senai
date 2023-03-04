//18. Entrar com um número e imprimir a seguinte saída:

package Exercicios;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		final double QUADRADO = 2;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		double elevado = Math.pow(numero, QUADRADO);
		
		System.out.println("O numero é: " +numero+ "e o quadrado dele é: " +elevado);
		
		
		

	}

}
