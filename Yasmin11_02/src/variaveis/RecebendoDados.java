package variaveis;

import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int valor1, valor2, total;
		
		System.out.println("Digite um valor");
		valor1 = in.nextInt();
		System.out.println("Digite um segundo valor");
		valor2= in.nextInt();

		total = valor1 + valor2;
		
		System.out.println("O valor total é: " +total);
		
	}

}