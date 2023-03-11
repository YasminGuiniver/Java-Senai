//DESCOBRIR QUAL É O TIPO DO TRIANGULO DE ACORDO COM SEUS LADOS;

package Exercicios;

import java.util.Scanner;

public class Tipo_Triangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double lado1 , lado2 , lado3;
		
		System.out.println("Digite o valor do lado 1");
		lado1 = in.nextDouble();

		System.out.println("Digite o valor do lado 2");
		lado2 = in.nextDouble();

		System.out.println("Digite o valor do lado 3");
		lado3 = in.nextDouble();
		
		if(lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
			System.out.println("Esse triângulo é equilátero");
		}else if (lado1 == lado2 && lado2 != lado3) {
			System.out.println("Esse triângulo é isóseles");
		}else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("Esse triangulo é escaleno");
		}
		
	}
}
