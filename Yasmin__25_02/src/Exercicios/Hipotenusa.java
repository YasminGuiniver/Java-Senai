//30 - Entrar com os valores dos catetos de um triângulo retângulo e imprimira
//hipotenusa

package Exercicios;

import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int QUADRADO = 2;
		double cateto1, cateto2;
		
		System.out.println("Insira o valor do 1° cateto");
		cateto1 = in.nextDouble();
		
		System.out.println("Insira o valor do 2° cateto");
		cateto2 = in.nextDouble();
		
		double hipotenusa;
		
		hipotenusa = Math.sqrt(Math.pow(cateto1, QUADRADO) + Math.pow(cateto2, QUADRADO));
		
		System.out.println("A hipotenusa desse triangulo é de: " +hipotenusa);
		
		
		

	}

}
