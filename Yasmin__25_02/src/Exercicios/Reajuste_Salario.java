//19. Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo, considerando o reajuste de 1%

package Exercicios;

import java.util.Scanner;

public class Reajuste_Salario {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double saldo, novoSaldo, reajuste;
		
		System.out.println("Digite o seu saldo atual");
		saldo = in.nextDouble();
		
		reajuste = saldo / 100;	
		novoSaldo = saldo + reajuste;
		
		System.out.println("Seu novo saldo é de: "+novoSaldo);
	}

}
