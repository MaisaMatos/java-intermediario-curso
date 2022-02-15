package aula75_84string;

public class Aula78stringEqualsRegionMatchesStartsEEndsWithCompareTo {

	public static void main(String[] args) {
		
		String ola = "Olá";
		String ola2 = "OLÁ";
		String ola3 = "Olá";
		String ola4 = new String(ola);
		
		//metodos "equals" e "equalsIgnoreCase"
		System.out.println("ola equals ola2 = " + ola.equals(ola2));//vai dar falso, considera maiusula e minuscula	
		System.out.println("ola equals ola3 = " + ola.equals(ola3));//vai dar true pq são iguais
		
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2));//vai dar true ignora maiusc e min
		System.out.println("ola equals ola3 = " + ola.equalsIgnoreCase(ola3));//vai dar true ignora maiusc e min

		System.out.println();
		
		//usando o operador lógico ==
		System.out.println("ola = ola2 " + (ola == ola2));//false, escritos de forma difer, usam difer refer de memoria
		System.out.println("ola = ola3 " + (ola == ola3));//true, escritos de forma igual, atribuicao simples, apontam para o mesmo ender de memoria
		System.out.println("ola = ola4 " + (ola == ola4));//false, refer de memoria difer
		
		
		//metodo regionMatches
		//comparando uma região da string "banana" com as outras string, passando os caracteres que queremos comparar
		//é preciso informar quatro parametros: indice, string a comparar
		//quero comparar banana com ana, então no regionMatches colocar o índice 1 da primeira string ("a")
		//depois colocar a string a comparar, a "ana"
		//depois, colocar a partir de qual índice essa segunda string deve ser comparada (zero para começar em "a")
		//depois, colocar a qtd de caracteres a comparar: no caso, queremos 3 "ana"
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		String ban1 = "Ban";
		
			
		System.out.println(banana.regionMatches(1, ana, 0, 3)); //true, comparou "ana" com "ana"
		System.out.println(banana.regionMatches(1, ana, 1, 2)); //false, comparando o "na", banana tem "an" nesta configuracao
		System.out.println(banana.regionMatches(2, ana, 1, 2)); //true, pois agora compara "na" com "na"
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));//true, usando "equalsIgnoreCase" no param
	
		//metodo endsWith
		System.out.println(banana.endsWith(ana));//true
		System.out.println(banana.startsWith(ban));//true
		System.out.println(banana.startsWith(ban1));//false porque tem letra maiuscula
		
		//metodo compareTo
		//pode ser usado para comparar objetos
		//ele tem tres saídas: "-1" ou outro numero negativo quando objeto a > b
		//						"0" quando objetos forem iguais a = b
		//						"1" ou outro numero positivo quando objeto a < b
		//os numeros dependem do valor de cada caractere conforme a tabela ascii
		//metodo muito usado para fazer ordenação em coleções de objetos
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b));//-1 porque a é maior que b

		
		
		
		
	}
	

}
