//22-Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

package Exercicios;

import java.util.Scanner;

public class Dias_Idade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int DIASANO = 365;
		int mes = 30;
		int anos, meses , dias;
		
		System.out.println("Informe sua idade em anos");
		anos = in.nextInt();
		
		System.out.println("Meses");
		meses = in.nextInt();
		
		System.out.println("Dias");
		dias = in.nextInt();
		
		int diasTotais;
		
		diasTotais = (anos * DIASANO) + (meses * mes) + dias;
		
		System.out.println("A quantidade de dias que você está na terra é de: " +diasTotais);
		
	}

}
