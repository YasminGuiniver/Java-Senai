package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double valorTransacao, valorVenal, percentualImposto, impostoPago, maior;
		
		System.out.println("Digite o valor da transação");
		valorTransacao = in.nextDouble();
		System.out.println("Digite o valor do venal");
		valorVenal = in.nextDouble();
		System.out.println("Digite o valor de desconto");
		percentualImposto = in.nextDouble();
		
		if(valorTransacao > valorVenal) {
			maior = valorTransacao;
		}
			maior = valorVenal;
			
			impostoPago = maior * percentualImposto / 100;
			
			System.out.println(impostoPago);
			
	}

}

//3. O Imposto sobre a Transmissão de Bens Móveis (ITBI) é aplicado sobre o valor de
//um imóvel a ser negociado. A base de cálculo do ITBI (o valor a ser considerado no
//cálculo) será o maior valor entre o valor de transação (o valor negociado) e o valor
//venal de referência (fornecido pela Prefeitura). Com base nisso, elabore uma classe
//que receba o valor da transação, o valor venal e o percentual de imposto. Após isso,
//encontre o maior valor e aplique o percentual sobre ele. Ao final, apresente o valor do
//imposto a ser pago. Observação: o valor do imposto a ser pago é calcula-
//do por meio da fórmula: valor do imposto = maior valor * percentual / 100. Para
//entrada e saída de dados utilize a classe Scanner.