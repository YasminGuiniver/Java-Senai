//5- VERIFICA A SITUAÇÃO DE ALUNO DE ACORDO COM A NOTA

package Exercicios;

import java.util.Scanner;

public class Verifica_Nota {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Digite sua nota");
		nota = in.nextDouble();
		
		if(nota >= 6) {
			System.out.println("Você está aprovado!");
		}else if (nota == 5) {
			System.out.println("Você está de recuperação!");
		}else if (nota < 5){
			System.out.println("Você está reprovado!");
		}
	}

}
