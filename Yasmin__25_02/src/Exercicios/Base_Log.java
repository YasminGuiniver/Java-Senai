//17. Entrar com o número e a base em que se deseja calcular o logaritmo desse
//número e imprimi-lo.

package Exercicios;

import java.util.Scanner;

public class Base_Log {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		int base;
		
		System.out.println("Digite um numero");
		numero = in.nextDouble();
		
		System.out.println("Digite o numero de base");
		base = in.nextInt();
		
		double log;
		
		log = (Math.log(numero) / Math.log(base));
		
		System.out.println("O numero " +numero+ " com a base " +base+ " resulta no logaritmo "+log);

	}

}
