//23. Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.

package Exercicios;

import java.util.Scanner;

public class Media_Das_Medias {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num1 = 7;
		int num2 = 8;
		int num3 = 9;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		
		double media1, media2, mediaTotal, somaMedia;
		
		media1 = (num1 + num2 + num3) / 3;
		media2 = (num4 + num5 + num6) / 3;
		somaMedia = media1 + media2;
		mediaTotal = (media1 + media2) / 2;
		
		System.out.println("A media dos numeros 7, 8 e 9 é: " +media1+ "\n"
				+ "A meida dos numeros 4, 5 e 6 é: " +media2+ "\n"
				+ "A soma dessas duas medias é de: " +somaMedia+ "\n"
				+ "A media as duas medias juntas é de: " +mediaTotal);
	}

}
