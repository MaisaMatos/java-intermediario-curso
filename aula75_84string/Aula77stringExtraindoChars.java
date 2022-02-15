package aula75_84string;

import java.util.Arrays;

public class Aula77stringExtraindoChars {

	public static void main(String[] args) {
		
		//charAt(): com este método, conseguimos acessar cada caracter dentro da string
		//visto que uma string é uma sequencia de caracteres
		//já que é um array de caracteres, podemos usar um "for"		
		String java = "Java";
		
		for(int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		
		
		//getChars(): vamos extrair caracteres dessa string e atribui-los a um array de chars
		char[] jav = new char[3];
		//são 4 parametros: o primeiro é o índice do caracter a ser copiado (ex.: quero o 'j', que é indice 0)
		//o segundo é o caracter final, queremos o 'v' então será o indice 3 (não inclusive)
		//o terceiro é o destino, que seria o array 'jav'
		//o quarto é qual o primeiro índice do caracter que se quer copiar, que no caso é o indice 0
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		//o metodo getChars seria o mesmo que fazer o que segue abaixo, com muito menos trabalho
		for(int i=0, j=0; i<3; i++, j++) {
			jav[i] = java.charAt(i);
		}
		System.out.println(jav);
		
		
			
		//e podemos fazer a mesma coisa com o array de bytes
		byte[] javBytes = new byte[3];
		java.getBytes(0, 3, javBytes, 0);
		System.out.println(Arrays.toString(javBytes));
		
		
		
		//transformando uma string em array de chars
		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
		
		
		
		
	}

}
