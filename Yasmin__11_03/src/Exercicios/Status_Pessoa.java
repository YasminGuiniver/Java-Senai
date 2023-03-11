//9 - VERIFICA SE A PESSOA AINDA É CRIANÇA, ADOLESCENTE, ADULTA OU IDOSA

package Exercicios;

import java.util.Scanner;

public class Status_Pessoa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade = in.nextInt();
		
		if(idade <= 12) {
			System.out.println("Você é uma criança");
		}else if(idade > 12 && idade < 18) {
			System.out.println("Você é um adolescente");
		}else if (idade >= 18 && idade < 60) {
			System.out.println("Você é um adulto");
		}else if(idade >= 60) {
			System.out.println("Você é um idoso");
		}
	}

}
