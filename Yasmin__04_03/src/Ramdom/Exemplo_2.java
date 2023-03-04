package Random;

import java.util.Random;

public class Exemplo_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
				
			int min = 10;
			int max = 20;
			
			for (int i =0; i< 2; i++) {
				int numAleatorio1 = random.nextInt(max - min + 1)+min;
				int numAleatorio2 = random.nextInt(min , max);
				
				System.out.println("Numero aleatorio entre esses numeros é: " +numAleatorio1);
				System.out.println("Numero aleatorio entre " +min+ " e " +max+ " é: " +numAleatorio2);
			}

	}

}
