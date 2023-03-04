package Strings;

public class Strings {

	
	public static void main(String[] args) {
		
		//FUNÇÃO CHARAT EXEMLO - 1
		String nome = "Yasmin";
		
		//CHARAT -- FUNÇÃO QUE PERCORRE UMA STRING E DEVOLVE O VALOR DE DENTRO DA OPÇÃO
		char caracter  = nome.charAt(2);
		
		System.out.println("O seu nome tem o caracter :"+caracter+ " nesta posição");
		
		//MESMA FUNÇÃO EXEMPLO COM FRASE
		String frase = "Hello world";
		int ultimoCaracter = frase.length() - 1;
		
		System.out.println("Essa é a quantidade de caracteres: " +ultimoCaracter);
		char ultimo = frase.charAt(ultimoCaracter);
		
		System.out.println("Essa é a ultima letra dessa frase " +ultimo);
		
		
		//STRING COM COMPARAÇÃO
		String txt1 = "banana";
		String txt2 = "abacaxi";
		
		int comparacao = txt1.compareTo(txt2);
		
		if(comparacao < 0 ) {
			System.out.println("A string " +txt1+ " vem antes da string " +txt2+ " na ordem alfabetica");
		}else if(comparacao > 0) {
			System.out.println("A string " +txt1+ " vem depois da string " +txt2+ " na ordem alfabetica");
		}
	}

}
