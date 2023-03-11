//CONVERTER NUMERO DO MÊS PARA O NOME DO MÊS

package Exercicios;

import java.util.Scanner;

public class Numero_Nome_Mes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero que você quer");
		numero = in.nextInt();
		
		switch (numero) {
		case 1: {
			System.out.println("Esse mês é Janeiro");
			break;
		}
		case 2: {
			System.out.println("Esse mês é Fevereiro");
			break;
		}
		case 3:{
			System.out.println("Esse mês é Março");
			break;
		}
		case 4:{
			System.out.println("Esse mês é Abril");
			break;
		}
		case 5:{
			System.out.println("Esse mês é Maio");
			break;
		}
		case 6: {
			System.out.println("Esse mês Junho");
			break;
		}
		case 7: {
			System.out.println("Esse mês é Julho");
			break;
		}
		case 8: {
			System.out.println("Esse mês é Agosto");
			break;
		}
		case 9:{
			System.out.println("Esse mês é Setembro");
			break;
		}
		case 10: {
			System.out.println("Esse mês é Outubro");
			break;
		}
		case 11:{
			System.out.println("Esse mês é Novembro");
			break;
		}
		case 12: {
			System.out.println("Esse mês é Dezembro");
			break;
		}
		default:
			System.out.println("Não existe esse mês!");
		}
	}

}
