//EXIBIR NOTAS EM DIFERENTES DICIPLINAS

package Exercicios;

import java.util.Scanner;

public class Notas_Diciplinas {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String diciplinas;
		
		System.out.println("Digite qual diciplina você deseja");
		diciplinas = in.next();
		
		switch (diciplinas) {
		case "LPL": {
			double nota;
			
			System.out.println("Digite a nota dessa diciplina");
			nota = in.nextDouble();
			
			System.out.println("A nota me " +diciplinas+ " é de: " +nota);
			
			break;
		}
		case "PW-3": {
			double nota;
			
			System.out.println("Digite a nota dessa diciplina");
			nota = in.nextDouble();
			
			System.out.println("A nota me " +diciplinas+ " é de: " +nota);
			
			break;
		}
		case "PDTCC": {
			double nota;
			
			System.out.println("Digite a nota dessa diciplina");
			nota = in.nextDouble();
			
			System.out.println("A nota me " +diciplinas+ " é de: " +nota);
		}
		default:
			System.out.println("Ainda não calculamos essa diciplina");
			
			break;
		}

	}

}
