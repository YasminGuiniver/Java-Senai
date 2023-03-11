package Exercicios;
import java.util.Scanner;

//VERIFICA SE O ANO É BISSEXTO OU NÃO

public class Ano_Bissexto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Digite o ano que você está // deseja saber se é bissexto");
		ano = in.nextInt();
		
		anoBissexto(ano);

	}

	public static void anoBissexto(int ano) {
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("Esse ano e bissexto!");
		}else {
			System.out.println("Esse ano nao e bissexto");
		}
		
	}
}

