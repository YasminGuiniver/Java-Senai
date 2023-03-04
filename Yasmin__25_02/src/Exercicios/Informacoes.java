//8. Ler nome, endereço e telefone e imprimi-los.

package Exercicios;

import java.util.Scanner;

public class Informacoes {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nome, telefone, endereco;
		
		System.out.println("Digite seu nome");
		nome = in.next();
		
		System.out.println("Digite seu telefone");
		telefone = in.next();
		
		System.out.println("Digite seu endereço");
		endereco = in.next();
		
		System.out.println("Suas informações são:  \n"
				+ "Nome: "+nome+ "\nTelefone: " +telefone+ "\nEndereço: " +endereco);

	}

}
