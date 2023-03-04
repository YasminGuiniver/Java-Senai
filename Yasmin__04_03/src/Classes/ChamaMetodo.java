package Classes;

import java.util.Scanner;

public class ChamaMetodo {

	public static void main(String[] args) {
		
		//ISSO É UMA BOA PRATICA
		Metodos metodo = new Metodos();
		//metodo.calcularArea();
		
		//ISSO NÃO É UMA BOA PRATICA MAS PODE SER USADO
		//Metodos.calcularArea();
		
		metodo.solicitaDados();
	}
}
