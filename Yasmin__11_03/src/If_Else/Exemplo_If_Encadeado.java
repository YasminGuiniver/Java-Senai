//VERFICANDO SE A IDADE DA CANDITADA PRA UMA VAGA É IGUAL Á 13, 14, OU 15

package If_Else;

import java.util.Scanner;

public class Exemplo_If_Encadeado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//If ENCADEADO É QUANDO SE TEM MAIS DE UMA VERIFICAÇÃO PARA SE FAZER if - else if - else
		int idade;
		
		System.out.println("Digite sua idade por favor");
		idade = in.nextInt();
		
		if(idade >= 15 && idade < 17) {
			System.out.println("Aprovada pra vaga :)");
		}else if(idade >= 14 && idade <= 15) {
			System.out.println("Volte daqui um ano ;)");
		}else if (idade >= 13 && idade < 14){
			System.out.println("Você precisa ter quinze anos para poder participar!!");
		}else {
			System.out.println("Você não tem idade para poder participar :(");
		}
	}

}
