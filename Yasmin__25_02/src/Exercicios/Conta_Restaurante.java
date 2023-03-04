//41 - Todo restaurante embora por lei não possa obrigar o cliente a pagar, cobra 10%
//para o garçom. Fazer um algoritmo que leia o valor gasto com despesas realiza-
//das em um restaurante e imprima o valor total com a gorjeta.

package Exercicios;

import java.util.Scanner;

public class Conta_Restaurante {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valor , gorjeta;
		
		System.out.println("Digite quanto você gastou em serviços no restaurante");
		valor = in.nextDouble();
		
		gorjeta = (valor / 100) * 10;
		
		double novoValor;
		
		novoValor = valor + gorjeta;
		
		System.out.println("Sem a gorjeta você terá que pagar o valor de: " +valor);
		System.out.println("Com a gorjeta você terá que pagar o valor de: " +novoValor);
	}

}
