//PAR OU IMPAR

package If_Else;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o 1° numero");
		numero = in.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Esse numero é par");
		}else {
			System.out.println("Esse numero é impar");
		}

	}

}
