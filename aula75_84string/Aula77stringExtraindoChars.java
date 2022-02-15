package aula75_84string;

import java.util.Arrays;

public class Aula77stringExtraindoChars {

	public static void main(String[] args) {
		
		//charAt(): com este m�todo, conseguimos acessar cada caracter dentro da string
		//visto que uma string � uma sequencia de caracteres
		//j� que � um array de caracteres, podemos usar um "for"		
		String java = "Java";
		
		for(int i=0; i<java.length(); i++) {
			System.out.println(java.charAt(i));
		}
		
		
		
		//getChars(): vamos extrair caracteres dessa string e atribui-los a um array de chars
		char[] jav = new char[3];
		//s�o 4 parametros: o primeiro � o �ndice do caracter a ser copiado (ex.: quero o 'j', que � indice 0)
		//o segundo � o caracter final, queremos o 'v' ent�o ser� o indice 3 (n�o inclusive)
		//o terceiro � o destino, que seria o array 'jav'
		//o quarto � qual o primeiro �ndice do caracter que se quer copiar, que no caso � o indice 0
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
