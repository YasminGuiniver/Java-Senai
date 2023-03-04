package Exercicios;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		double notaProva1, notaProva2, notaTrabalho, media;
		String resultado;
		
		System.out.println("Digite a nota da 1° prova");
		notaProva1 = in.nextDouble();
		System.out.println("Digite a nota da 2° prova");
		notaProva2 = in.nextDouble();
		System.out.println("Digite a nota do trabalho");
		notaTrabalho = in.nextDouble();
		
		media = (notaProva1 + notaProva2+ notaTrabalho) / 3;
		
		if(media >= 6) {
			resultado = "Aprovado";
				System.out.println("A media é: " +media+ " e o resultado é: " + resultado);
		}else{
			resultado = "Reprovado";
				System.out.println("A media é: " +media+ "e o resultado é: " + resultado);
		}
		
	}

}

//4. Usando a classe Scanner para entrada de dados, elabore uma classe que receba a
//nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final
//(aprovado ou reprovado). Para calcular a média utilize a fórmula seguinte: média =
//(nota da prova 1 + nota da prova 2 +nota do trabalho) / 3. Considere que a média
//mínima para aprovação é 6.
