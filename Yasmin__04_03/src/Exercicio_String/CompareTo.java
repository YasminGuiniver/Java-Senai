//COMPARAR DUAS STRINGS USANDO O COMPARETO

package Exercicio_String;

public class CompareTo {

	public static void main(String[] args) {
		
		//USANDO O COMPARE TO
		String nome = "Yasmin g";
		String nome2 = "Yasmin D";

		int compare;
		
		compare = nome.compareTo(nome2);
		//O COMPARETO COMPARA O TAMANHO (QUANTIDADE DE LETRAS) DE CADA STRING
		//SE A STRING 1 FOR MAIOR QUE A STRING 2 O VALOR RETORNADO É POSITIVO E É A DIFERENÇA DAS DUAS STRINGS
		//SE A STRING 1 FOR MENOR QUE A STRING 2 O VALOR RETORNADO É NEGATIVO E É A DIFERENÇA DAS DUAS STRINGS
		//SE A STRING 1 FOR IGUAL A STRING 2 O VALOR RETORNADO É 0
		//PELO VISTO ELE COMPARA TAMBÉM A ORDEM ALFABETICA DELES
		
		if (compare < 0) { //AQUI ELE VERIFICA SE A STRING 1 É MENOR QUE A STRING 2 SE FOR O NOME 1 APARECE ANTES DO NOME 2 
			System.out.println("O nome 1 " +nome+ " vem antes do nome 2 "+nome2);
		}else if (compare > 0) { //ESSE ELE VERIFICA SE A STRING 1 É MAIOR QUE A STRING 2 SE FOR O 1 APARECE DEPOIS DO NOME 2
			System.out.println("O nome 1 " +nome+ " vem depois do nome 2 " +nome2);
		}else if(compare == 0 ) { //ESSE ELE VERIFICA SE A STRING 1 É IGUAL A STRING 2 SE FOR A ORDEM DELES NÃO IMPORTAM
			System.out.println("Os dois são iguais portanto não importa a ordem");
		}
		
		
	}

}
