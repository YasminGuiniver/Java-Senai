//4- CALCULA O PAGAMENTO DE ACORDO COM A FORMA DE PAGAMENTO

package Exercicios;

import java.util.Scanner;

public class Calculo_Pagamento {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double valor, valorDesc, valorFinal;
		String formaPagamento;
		
		valor = 1200.00;
		
		System.out.println("Digite a forma de pagamento");
		formaPagamento = in.next();
		
		if(formaPagamento.equals("pix") || formaPagamento.equals("debito")) {
			valorDesc = (valor / 100) * 5;
			valorFinal = valor - valorDesc;
			System.out.println("O valor da sua compra com esse método de pagamento é de: " +valorFinal);
		}else if(formaPagamento.equals("credito")) {
			valorDesc = (valor / 100) * 9;
			valorFinal = valor - valorDesc;
			System.out.println("O valor da sua compra com esse método de pagamento é de: " +valorFinal);
		}else if(formaPagamento.equals("dinheiro")) {
			System.out.println("Não há desconto para este método, o valor da sua compra continua sendo de: " +valor);
		}else {
			System.out.println("Não atendemos essa forma de pagamento");
		}
	}

}
