package aula75_84string;

public class Aula79stringIndexOfLastIndexOfContains {
	
	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		
		//metodo indexOf = índice de
		//vamos procurar dentro da string um caracter ou outra string e o java retorna o indice de inicio do
		//caracter ou string, retornando "-1" caso não encontre
		System.out.println(banana.indexOf('x'));// saída -1
		System.out.println(banana.indexOf('b'));// saída 0, índice 0
		System.out.println(banana.indexOf('a'));// saída 1, índice 1
		System.out.println(banana.indexOf(ana));// saída 1 pq o "a" de "ana" começa no índice 1
		
		//metodo lastIndexOf = qual a última vez em que tal string ou caractere existe
		System.out.println(banana.lastIndexOf('a')); //saída 5, que é o índice do último 'a'
		System.out.println(banana.lastIndexOf(ana)); //saída 3, pois 3 é o início do último "ana"
		
		
		//metodo contains retorna true or false
		System.out.println(banana.contains(ana));//true
		System.out.println(banana.contains("ceu"));//false
	}

}
