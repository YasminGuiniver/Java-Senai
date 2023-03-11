//3-VERIFICA SE A SENHA DIGITADA É IGUAL A SALVA

package Exercicios;

import java.util.Scanner;

public class Verifica_Senha {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String senha;
		String senhaInserida;
		
		System.out.println("Cadastre uma senhas");
		senha = in.next();
		
		System.out.println("Senha cadastrada com sucesso");
		
		System.out.println("Digite sua senha");
		senhaInserida = in.next();
		
		if(senhaInserida.equals(senha)) {
			System.out.println("Entrando...");
		}else {
			System.out.println("Senha incorreta");
		}
	}

}
