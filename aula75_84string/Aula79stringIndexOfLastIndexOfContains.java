package aula75_84string;

public class Aula79stringIndexOfLastIndexOfContains {
	
	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		
		//metodo indexOf = �ndice de
		//vamos procurar dentro da string um caracter ou outra string e o java retorna o indice de inicio do
		//caracter ou string, retornando "-1" caso n�o encontre
		System.out.println(banana.indexOf('x'));// sa�da -1
		System.out.println(banana.indexOf('b'));// sa�da 0, �ndice 0
		System.out.println(banana.indexOf('a'));// sa�da 1, �ndice 1
		System.out.println(banana.indexOf(ana));// sa�da 1 pq o "a" de "ana" come�a no �ndice 1
		
		//metodo lastIndexOf = qual a �ltima vez em que tal string ou caractere existe
		System.out.println(banana.lastIndexOf('a')); //sa�da 5, que � o �ndice do �ltimo 'a'
		System.out.println(banana.lastIndexOf(ana)); //sa�da 3, pois 3 � o in�cio do �ltimo "ana"
		
		
		//metodo contains retorna true or false
		System.out.println(banana.contains(ana));//true
		System.out.println(banana.contains("ceu"));//false
	}

}
