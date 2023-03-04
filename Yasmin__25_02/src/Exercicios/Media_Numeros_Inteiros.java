//12. Entrar com dois números reais e imprimir a média aritmética com a mensagem
//média antes do resultado.

package Exercicios;

import java.util.Scanner;

public class Media_Numeros_Inteiros {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1, num2;
		double media;
		
		System.out.println("Digite um numero inteiro");
		num1 = in.nextInt();
		
		System.out.println("Digite um numero inteiro");
		num2 = in.nextInt();
		
		media = (num1 + num2) / 2;
		
		System.out.println("A media desses numeros são: "+media);

	}

}
