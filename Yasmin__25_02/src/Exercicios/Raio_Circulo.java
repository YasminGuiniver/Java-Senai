//27 - Entrar com o raio de um cfrculo e imprimir a seguinte saída:
//peri metro:
//area:

package Exercicios;

import java.util.Scanner;

public class Raio_Circulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final double PI = 3.14;
		double raio;
		
		System.out.println("Entre com o raio do circulo");
		raio = in.nextDouble();
		
		double area, perimetro;
		
		area = PI * Math.pow(raio, 2);
		perimetro = 2 * PI * raio;
		
		System.out.println("A area do circulo é: " +area+ "\n"
				+ "O perimetro do circulo é de: " +perimetro);
		

	}

}
