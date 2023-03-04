package Classes;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double x, y;
		
		System.out.println("Digite o valor da base");
		x = in.nextDouble();
		
		System.out.println("Digite o valor da altura");
		y = in.nextDouble();
		
		//COM PARAMETRO
		System.out.println("Esse é com parametro");
		calcularArea(x,y);
		
		//SEM PARAMETRO
		System.out.println("Esse é sem parametro");
		calcularArea();
		
	}
	
	public static void calcularArea() {
		
		Scanner in = new Scanner(System.in);
		
		double base, altura, area;
		
		System.out.println("Digite o valor da base");
		base = in.nextDouble();
		
		System.out.println("Digite o valor da altura");
		altura = in.nextDouble();
		
		area = base * altura;
		
		System.out.println("A area total é: " +area);
	}
	
	public static void calcularArea(double base, double altura) {
		double area;
		area = base * altura;
		System.out.print("A base tem o valor de: " +area);
		
	}
	
	public static void solicitaDados() {
		Scanner in = new Scanner(System.in);
		
		double x,y;
		
		System.out.println("Digite o valor da base");
		x = in.nextDouble();
		
		System.out.println("Digite o valor da altura");
		y = in.nextDouble();
		
		calcularArea(x,y);
		
	}

}
