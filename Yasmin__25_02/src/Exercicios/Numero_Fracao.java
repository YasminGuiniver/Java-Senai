//11. Ler um número real e imprimir a terça parte deste número

package Exercicios;

import java.util.Scanner;

public class Numero_Fracao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero, parteTres;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		parteTres = numero / 3;
		
		System.out.println("A terça parte é: " +parteTres);

		
	}

}
