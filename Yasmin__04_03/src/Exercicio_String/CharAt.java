//OBTER UM CARACTER EM UMA POSIÇÃO ESPECIFICA  DE UMA STRING USANDO O CHARAT

package Exercicio_String;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String textinho = "Esse textinho é um teste para esse exercicio :)";
		int numeroDesejado;
		
		System.out.println("Qual é o numero que você deseja saber?");
		numeroDesejado = in.nextInt();
		
		char letraEspecifica = textinho.charAt(numeroDesejado);
		
		System.out.println("Na posição pedida está a letra/caracter " +letraEspecifica);

	}

}
