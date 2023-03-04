//29 - Entrar com as notas da PR 1 e PR2 e imprimir a média final:
//m truncada:
//arredondada:

package Exercicios;

import java.util.Scanner;

public class Media_Formatacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Entre com a sua 1° nota");
		n1 = in.nextDouble();
		
		System.out.println("Entre com a sua 2° nota");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
	
		System.out.println("A media é de " +media);
		System.out.println("A media arredondada é de: " +Math.round(media));
		
		

	}

}
