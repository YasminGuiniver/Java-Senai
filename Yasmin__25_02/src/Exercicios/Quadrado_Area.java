//24 - Entrar com o lado de um quadrado e imprimir:
//peri metro:
//area:
//diagonal:

package Exercicios;

import java.util.Scanner;

public class Quadrado_Area {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		final int QUADRADO = 2;
		int lado;
		
		System.out.println("Entre com o lado do quadrado");
		lado = in.nextInt();
		
		double area, perimetro, diagonal;
		
		area = lado * lado;
		perimetro = lado * 4;
		diagonal = Math.pow(lado, QUADRADO);
		
		System.out.println("A area do quadrado é de: " +area+ "\n"
				+ "O perimetro do quadrado é de: " +perimetro+ "\n"
						+ "A diagonal do quadrado é de: " +diagonal);
		 

	}

}
