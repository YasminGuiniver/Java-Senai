//1-VERIFICAR SE O NUMERO É PAR OU IMPAR

package Exercicios;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
	}

}
