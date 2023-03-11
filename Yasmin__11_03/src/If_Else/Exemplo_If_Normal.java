//VERIFICANDO SE A PESSOA TEM IDADE PARA UMA VAGA DE EMPREGO
//MENOR QUE 15 ANOS NÃO PODE.

package If_Else;

import java.util.Scanner;

public class Exemplo_If_Normal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int idade = 14;
		
		//A CONDIÇÃO VERDADEIRA VEM PRIMEIRO
		if(idade >= 15 && idade < 17) {
			System.out.println("Aprovada pra vaga");
		}else {
			System.out.println("Reprovada pra vaga");
		}

	}

}
