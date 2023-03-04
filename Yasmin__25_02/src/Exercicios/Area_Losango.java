//27 - Criar um algoritmo que calcule e imprima a área de um losango.

package Exercicios;

import java.util.Scanner;

public class Area_Losango {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int diagonalMaior, diagonalMenor;
		
		System.out.println("Entre com a diagonal maior do losango");
		diagonalMaior = in.nextInt();
		
		System.out.println("Entre com a diagonal menor do losango");
		diagonalMenor = in.nextInt();
		
		double area;
		
		area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.println("A area do losango é de: "+area);

	}

}
