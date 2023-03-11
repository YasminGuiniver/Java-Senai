//6- VERIFICA SE O NUMERO É POSITIVO, NEGATIVO OU ZERO

package Exercicios;

import java.util.Scanner;

public class Numero_P_N_Zero {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um numero");
		numero = in.nextDouble();
		
		if(numero > 0) {
			System.out.println("Esse numero é positivo");
		}else if(numero < 0 ) {
			System.out.println("Esse numero é negativo");
		}else if(numero == 0) {
			System.out.println("Esse numero é nulo");
		}

	}

}
