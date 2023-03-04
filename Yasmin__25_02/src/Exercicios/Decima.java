//40 - Criar um algoritmo que leia o numerador e o denominador de uma fração e trans -
//formá-lo em um número decimal.

package Exercicios;

import java.util.Scanner;

public class Decima {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numerador , denominador;
		
		System.out.println("Digite um denominador");
		denominador = in.nextDouble();
		
		System.out.println("Digite o numerador");
		numerador = in.nextDouble();
		
		double decimal;
		decimal = numerador / denominador;
		
		System.out.println("O decimal desse numerador " +numerador+ " mais o denominador " +denominador+ " é de: " +decimal);
	}

}
