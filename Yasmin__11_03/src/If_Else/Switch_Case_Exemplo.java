//ESSE DAQUI CALCULA O DESCONTO QUE UM ALUNO DEVE GANHAR DE ACORDO COM A SUA MENSALIDADE E DIA DO PAGAMENTO.

package If_Else;

import java.util.Scanner;

public class Switch_Case_Exemplo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int nivel , data;
		double total;
		
		System.out.println("Digite o nível do aluno");
		nivel = in.nextInt();

		
		switch (nivel) {
		case 1: {
			System.out.println("Digite a data do pagamento");
			data = in.nextInt();
			
			if(data == 1) {
				total = 51.50 - (51.50 * 0.15);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if (data >= 1 && data < 5) {
				total = 51.50 - (51.50 * 0.10);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if(data > 5 && data <= 10) {
				total = 50.51 - (51.50 * 0.0389);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else {
				System.out.println("Você não tem desconto, o total a pagar é de 50,51");
			}
			
			break;
		}
		case 2: {
			System.out.println("Digite a data do pagamento");
			data = in.nextInt();
			
			if(data == 1) {
				total = 65.00 - (65.00 * 0.15);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if (data >= 1 && data < 5) {
				total = 65.00 - (65.00 * 0.10);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if(data > 5 && data <= 10) {
				total = 65.00 - (65.00 * 0.0389);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else {
				System.out.println("Você não tem desconto, o total a pagar é de 65.00");
			}
			break;
		}
		case 3: {
			System.out.println("Digite a data do pagamento");
			data = in.nextInt();
			
			if(data == 1) {
				total = 80.00 - (80.00 * 0.15);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if (data >= 1 && data < 5) {
				total = 80.00 - (80.00 * 0.10);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if(data > 5 && data <= 10) {
				total = 80.00 - (80.00 * 0.0389);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else {
				System.out.println("Você não tem desconto, o total a pagar é de 80.00");
			}
			break;
		}
		case 4: {
			System.out.println("Digite a data do pagamento");
			data = in.nextInt();
			
			if(data == 1) {
				total = 100.00 - (100.00 * 0.15);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if (data >= 1 && data <= 5) {
				total = 100.00 - (100.00 * 0.10);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else if(data > 5 && data <= 10) {
				total = 100.00 - (100.00 * 0.0389);
				System.out.println("Total a pagar com desconto é de: "+total);
			}else {
				System.out.println("Você não tem desconto, o total a pagar é de 100.00");
			}
			break;
		}
		default:
			System.out.println("Não temos essa opção");
		
			break;
		}
	}

}
