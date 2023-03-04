package Exercicios;

import java.util.Scanner;

public class Paralelepipedo_Diagonal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int QUADRADO =2;
		int lado1 , lado2, lado3, lado4;
		
		System.out.println("Entre com o lado 1 do paralelepipedo");
		lado1 = in.nextInt();
		
		System.out.println("Entre com o lado 2 do paralelepipedo");
		lado2 = in.nextInt();
		
		System.out.println("Entre com o lado 3 do paralelepipedo");
		lado3 = in.nextInt();
		
		System.out.println("Entre com o lado 4 do paralelepipedo");
		lado4 = in.nextInt();
		
		double diagonal;
		
		diagonal = Math.pow(lado1, QUADRADO) + Math.pow(lado2, QUADRADO) + Math.pow(lado3, QUADRADO) + Math.pow(lado4, QUADRADO);
		System.out.println("A diagonal do paralelepipedo é de de: " +diagonal);

	}

}
