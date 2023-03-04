//26 - Criar um algoritmo que calcule e imprima a área de um triângulo.

package Exercicios;

import java.util.Scanner;

public class Area_Triangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int base, altura;
		
		System.out.println("Entre com a base do triangulo");
		base = in.nextInt();
		
		System.out.println("Entre com a altura do triangulo");
		altura = in.nextInt();
		
		double area;
		
		area = (base * altura) / 2;
		
		System.out.println("A area do triangulo é de: "+area);
		
		

	}

}
