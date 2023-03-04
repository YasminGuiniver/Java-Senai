//42 - Criar um algoritmo que leia um valor de hora e informe quantos minutos se pas -
//saram desde o início do dia.

package Exercicios;

import java.util.Scanner;

public class Minutos_Do_Dia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double hora;
		
		System.out.println("Que horas são?");
		hora = in.nextDouble();
		
		double minutos;
		
		minutos = hora * 60;
		
		System.out.println("Ja se passarm " +hora+ " horas do dia, isso são: " +minutos+ " até agora;");
		
		

	}

}
