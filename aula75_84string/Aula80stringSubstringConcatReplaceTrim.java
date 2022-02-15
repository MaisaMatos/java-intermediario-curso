package aula75_84string;

public class Aula80stringSubstringConcatReplaceTrim {

	public static void main(String[] args) {
		
		String teste = "Isso � um teste. ";
		
		System.out.println(teste);
		
		//metodo Substring
		//conseguimos com ele extrair peda�os da string
		//por�m, n�o estamos recortando um peda�o da string, � apenas informativo
		//basta informar o �ndice de in�cio do trecho que se quer cortar
		//usa-se muito em integra��o de sistemas com arquivos do tipo flat file
		System.out.println(teste.substring(10)); //imprimir� "teste.", pois considera os �ndices
		
		//metodo Substring definindo o �ndice de in�cio e de fim
		System.out.println(teste.substring(10, 15)); //imprimir� "teste" sem o ponto: indice inicio inclusivo, indice fim n�o � inclusivo

		//metodo concat
		//uma outra forma de concatenar al�m do sinal de +
		String ola = "ol�";
		String mundo = "mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		//metodo Replace
		//inicialmente trocando o 'i' pelo 'e'. Isso deve ser informado nos parametros do metodo
		String espacos = "i s p a � o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//ainda o metod Replace, agora tirando os espacos
		//usando 'replaceAll', usando 'regEx'(expressoes regulares)
		//substituiremos todos os espa�os por uma string vazia
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		
		//metodo trim
		//remove todos os espa�os que estiverem sobrando antes e depois
		//ele vai fazendo um replace at� encontrar o primeiro caracter
		String nome = " meu nome � ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
	}

}
