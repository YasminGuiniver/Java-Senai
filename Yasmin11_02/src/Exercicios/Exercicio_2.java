package Exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int timeLider, timeLanterna, totalVitoria;
		
		System.out.println("Digite a quantidade de pontos do lider do campeonato");
		timeLider = in.nextInt();
		System.out.println("Digite a quantidade de pontos do lanterna do campeonato");
		timeLanterna = in.nextInt();
		
		totalVitoria = (timeLider - timeLanterna) / 3;
		
		if(totalVitoria <0) {
			
			System.out.println("O timne lanterna está na frente do time lider");
		}
		
		else {
		
		System.out.println("O time lanterna precisa vencer " +totalVitoria+ " jogos para chegar ou ultrapassar o lider do campeonato");
		}                                                                                                           
	}

}

//2. Usando a classe Scanner para entrada de dados, faça uma classe que receba dois
//valores inteiros.O primeiro valor corresponde à quantidade de pontos do líder do
//campeonato brasileiro de futebol. O segundo valor corresponde à quantidade de
//pontos do time lanterna. Considerando que cada vitória vale 3 pontos, elabore uma
//classe que calcule o número de vitórias necessárias para que o time lanterna alcance
//(ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas
//sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois
//(40-22) / 3 = 6.