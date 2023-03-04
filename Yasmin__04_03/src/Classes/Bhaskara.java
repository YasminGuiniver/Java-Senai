package Classes;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b , c;
		
		System.out.println("Digite o valor");
		a = in.nextDouble();
		
		System.out.println("Digite o valor");
		b = in.nextDouble();
		
		System.out.println("Digite o valor");
		c = in.nextDouble();
		
		bhaskara(a , b , c);
		

	}

	public static void bhaskara(double a, double b, double c) {
		double delta, x1 , x2;
		
		delta = Math.pow(b, 2) + (-4*(a*c));
		x1 = (-b + Math.sqrt(delta))/(2*a);
		x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("o valor de delta é de: " +delta);
		System.out.println("O valor de x1 (+) é de: " +x1);
		System.out.println("o valor de x2 (-) é de: " +x2);
		
		
	}

}
