//26 - Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
//peri metro
//area
//diagonal:

package Exercicios;

import java.util.Scanner;

public class Area_Quadrado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int QUADRADO = 2;
		int altura, base;
		
		System.out.println("Digite a area do retangulo");
		altura = in.nextInt();
		
		System.out.println("Digite a base do retangulo");
		base = in.nextInt();
		
		double area, perimetro, diagonal;
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, QUADRADO) + Math.pow(altura, QUADRADO));
		
		System.out.println("A area de retangulo é de "+area+ "\n"
				+ "O perimetro do retangulo é de: " +perimetro+ "\n"
						+ "A diagonal do retangulo é de: " +diagonal);
		
		
		
		

	}

}
