package Exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int idade, anosContribuicao;
		String sexo;
		
		System.out.println("Digite seu sexo");
		sexo = in.next();
		System.out.println("Digite sua idade");
		idade = in.nextInt();
		System.out.println("Digite qunatos anos você de contribuição");
		anosContribuicao = in.nextInt();
		
		if(sexo.equals("f") || sexo.equals("F")) {
			if(idade >= 60 ||  anosContribuicao >= 30) {
				System.out.println("Você ja pode se aposentar");
			}else {
				int aindaFalta = 30 - anosContribuicao;
				System.out.println("Ainda falta " +aindaFalta+ " anos para você se aposentar");
			}
		}
		
		if(sexo.equals("m") || sexo.equals("M")) {
			if(idade == 65 ||  anosContribuicao >= 35) {
				System.out.println("Você ja pode se aposentar");
			}else {
				int aindaFalta = 35 - anosContribuicao;
				System.out.println("Ainda falta " +aindaFalta+ " anos para você se aposentar");
			}
		}
		
	}
	

}

//5. Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se
//aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os
//homens, 65. Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é
//de 30 anos para as mulheres e de 35 anos para os homens. Com base nessas
//informações, elabore uma classe que receba a idade de uma pessoa, seu
//sexo e a quantidade de anos de contribuição. A seguir, calcule a quantidade de anos
//que falta de contribuição para se aposentar, ou então emita a mensagem: “você já tem
//o direito a aposentadoria”.
