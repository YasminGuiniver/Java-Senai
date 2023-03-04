//25. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00)

package Exercicios;

import java.util.Scanner;

public class Quantidade_Salarios {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double salarioMinimo, salarioUsuario;
		
		System.out.println("Digite o valor do salario minimo");
		salarioMinimo = in.nextDouble();
		
		
		System.out.println("Digite o valor do salario do usuario");
		salarioUsuario = in.nextDouble();
		
		double qntdSalario = salarioUsuario / salarioMinimo ;
		
		System.out.println("Você recebe " +qntdSalario+ " minimo");

	}

}
