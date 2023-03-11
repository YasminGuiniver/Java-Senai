//2- VERIFICAR SE ALGUÉM É MAIOR DE IDADE OU NÃO

package Exercicios;

import java.util.Scanner;

public class Maior_Menor_Idade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade = in.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você ainda é menor de idade");
		}
		

	}

}
