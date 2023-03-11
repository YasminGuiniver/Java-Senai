//7- VERIFICAR SE UM NUMERO É DIVISIVEL POR 2, 3 OU 5

package Exercicios;

import java.util.Scanner;

public class Verifica_Divisor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		int unidade = numero % 10;
		
		if(unidade == 5 || unidade == 0) {
			System.out.println("Esse numero é divisivél por 5");
		}else if(numero % 3 == 0) {
			System.out.println("Esse numero é divisivél por 3");
		}else if(numero % 2 == 0) {
			System.out.println("Esse numero é divisivél por 2");
		}else {
			System.out.println("Esse numero é dividido por algum outro");
		}
		

	}

}
