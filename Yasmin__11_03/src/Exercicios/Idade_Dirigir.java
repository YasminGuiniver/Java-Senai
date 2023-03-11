//4- VERIFICA SE A PESSOA JA PODE DIRIGIR

package Exercicios;

import java.util.Scanner;

public class Idade_Dirigir {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade");
		idade = in.nextInt();
		
		if(idade >= 16) {
			System.out.println("Você ja pode dirigir");
		}else {
			System.out.println("Você ainda não pode dirigir");
		}

	}

}
