//26 , 15, 65, 89, 74, 72

package Ramdom;

import java.util.Random;

public class Ramdom_Exemplos {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i = 0; i < 6; i++) {
			int numAleatorio = random.nextInt(20);
			System.out.println(numAleatorio);
		}

	}

}
