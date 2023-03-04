//24-Escrever um algoritmo que lê:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package Exercicios;

import java.util.Scanner;

public class IPI {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int IPI, cod1, cod2, qntd1, qntd2;
		double preco1, preco2;
		
		System.out.println("Digite qual é a porcentagem de IPI");
		IPI = in.nextInt();
		
		System.out.println("Digite o codigo da peça 1");
		cod1 = in.nextInt();
		
		System.out.println("Digite o codigo da peça 2");
		cod2 = in.nextInt();
		
		System.out.println("Digite a quantidade de peças com o codigo" +cod1);
		qntd1 = in.nextInt();
		
		System.out.println("Digite a quantidade de peças com o codigo" +cod2);
		qntd2 = in.nextInt();
		
		System.out.println("Digite o valor unitário da peça de codigo " +cod1);
		preco1 = in.nextDouble();
		
		System.out.println("Digite o valor unitário da peça de codigo " +cod2);
		preco2 = in.nextDouble();
		
		double totalPago;
		
		totalPago = (preco1 * qntd1 + preco2 * qntd2)*(IPI/100+1);
		
		System.out.println("Para comprar " +qntd1+ " de peças de codigo " +cod1+ "\n"
				+ "e " +qntd2+ " de peças de codigo " +cod2+ " vai ser gasto o valor de: " +totalPago);
		
		

	}

}
