package If_Else;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a , b;
		
		System.out.println("Digite o valor 1");
		a = in.nextDouble();
		
		System.out.println("Digite o valor 2");
		b = in.nextDouble();
		
		String operacao;
		
		System.out.println("Digite qual operação você quer");
		operacao = in.next();
		
		//ENTENDENDO ESSE TREM
		//KEY É A VARIAVÉL QUE CONTÉM A RESPOSTA DO USUARIO QUE VAI SER VERIFICADA
		switch (operacao) {
		//VALUE É O VALOR QUE VAI SER VERIFICADO O QUE QUEREMOS SABER
		case "+": {
			soma(a , b);
			
			//TEM QUE POR O BREAK PORQUE SENÃO ELE CONTINUA E FICA ERRADO
			break;
		}
		case "-":{
			subtrair(a, b);
			
			break;
		}
		case "x":{
			multiplicar(a, b);
			
			break;
		}
		case ":": {
			dividir(a, b);
			
			break;
		}
		//DEFAULT É TIPO UM ELSE, OU SEJA CASE = IF, ELSE = DEFAULT
		default:
			System.out.println("Operação não reconhecida");
			
			break;
		}
	}
	
	//METODOS
	public static void soma(double a , double b) {
		double soma = 0;
		soma = a + b;
		
		System.out.println("A soma desses resultados é de: " +soma);
	}
	
	public static void subtrair(double a , double b) {
		double subtrair = 0;
		subtrair = a - b;
		
		System.out.println("A subtração desses resultados é de: " +subtrair);
	}
	
	public static void multiplicar(double a , double b) {
		double multiplicar = 0;
		multiplicar = a * b;
		
		System.out.println("A multiplicação desses resultados é de: " +multiplicar);
	}
	
	public static void dividir(double a , double b) {
		double dividir = 0;
		dividir = a / b;
		
		System.out.println("A divisão desses resultados é de: " +dividir);
	}

}
