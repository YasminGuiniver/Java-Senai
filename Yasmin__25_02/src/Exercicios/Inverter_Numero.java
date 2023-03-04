package Exercicios;

import java.util.Scanner;

public class Inverter_Numero {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero, unidade, dezena, centena, novoNumero;
		
		System.out.println("Digite um numero");
		numero = in.nextInt();
		
		unidade = numero % 10;
		dezena = (numero % 100) / 10;
		centena = numero / 100;
		
		novoNumero = unidade *  100 + dezena * 10 + centena;
		
		System.out.println("O numero " +numero+ " ao contrario é " +novoNumero);
	}
}
