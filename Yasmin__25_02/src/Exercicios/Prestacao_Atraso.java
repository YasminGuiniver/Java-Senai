//38 - Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
//prestação = valor + (valor*(taxa/100)*tempo

package Exercicios;

import java.util.Scanner;

public class Prestacao_Atraso {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valor, tempo;
		
		System.out.println("Digite o valor da sua prestação");
		valor = in.nextDouble();
		
		System.out.println("Digite quanto tempo essa prestação está atrasada (em dias");
		tempo = in.nextDouble();
		
		double novoValor;
		
		novoValor = valor + (valor*(0.1/100))*tempo;
		
		System.out.println("Sua prestação era de: " +valor);
		System.out.println("Devido ao atraso o valor da sua prestação passa a ser: " +novoValor);
		
	}

}
