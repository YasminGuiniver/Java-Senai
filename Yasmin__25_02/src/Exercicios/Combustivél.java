//.37 - Efetuar o cálculo da quantidade de litros de combustível gastos em uma viagem,
//sabendo-se que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo
//gasto na viagem e a velocidade média.
//Utilizar as seguintes fórmulas: distância = tempo x velocidade.
//litros usados = distância / 12.

package Exercicios;

import java.util.Scanner;

public class Combustivél {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double tempo, velocidade;
		
		System.out.println("Digite quanto tempo de viagem você ja fez (em dias)");
		tempo = in.nextDouble();
		System.out.println("Digite a velocidade média que você percorreu (em kmhs)");
		velocidade = in.nextDouble();
		
		double distancia, litros;
		
		distancia = tempo * velocidade;
		litros = distancia / 12;
		
		System.out.println("Você gastou " +tempo+ " dias de viagem");
		System.out.println("Você estava a " +velocidade+ " por km/h");
		System.out.println("Você percorreu uma distancia de: "+distancia+ " kmhs");
		System.out.println("Você gastou "+litros+ " de combustivél para viajar");

	}

}
