//39 - Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que
//a variável A passe a ter o valor da variável B e que a variável B passe a ter o valor da
//variável A. Apresentar os valores trocados.

package Exercicios;

import java.util.Scanner;

public class Troca_Valores {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a , b;
		
		System.out.println("Digite o valor A");
		a = in.nextDouble();
		
		System.out.println("Digite o valor B");
		b = in.nextDouble();
		
		System.out.println("O valor A é " +a);
		System.out.println("O valor B é: " +b);
		
		double apoio;
		apoio = a;
		a = b;
		b = apoio;
		
		System.out.println("O valor de A passa a ser: " +a);
		System.out.println("O valor de B passa a ser: " +b);
	}

}
