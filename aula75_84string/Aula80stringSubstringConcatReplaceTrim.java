package aula75_84string;

public class Aula80stringSubstringConcatReplaceTrim {

	public static void main(String[] args) {
		
		String teste = "Isso é um teste. ";
		
		System.out.println(teste);
		
		//metodo Substring
		//conseguimos com ele extrair pedaços da string
		//porém, não estamos recortando um pedaço da string, é apenas informativo
		//basta informar o índice de início do trecho que se quer cortar
		//usa-se muito em integração de sistemas com arquivos do tipo flat file
		System.out.println(teste.substring(10)); //imprimirá "teste.", pois considera os índices
		
		//metodo Substring definindo o índice de início e de fim
		System.out.println(teste.substring(10, 15)); //imprimirá "teste" sem o ponto: indice inicio inclusivo, indice fim não é inclusivo

		//metodo concat
		//uma outra forma de concatenar além do sinal de +
		String ola = "olá";
		String mundo = "mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		//metodo Replace
		//inicialmente trocando o 'i' pelo 'e'. Isso deve ser informado nos parametros do metodo
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//ainda o metod Replace, agora tirando os espacos
		//usando 'replaceAll', usando 'regEx'(expressoes regulares)
		//substituiremos todos os espaços por uma string vazia
		semEspacos = semEspacos.replaceAll(" ", "");
		System.out.println(semEspacos);
		
		
		//metodo trim
		//remove todos os espaços que estiverem sobrando antes e depois
		//ele vai fazendo um replace até encontrar o primeiro caracter
		String nome = " meu nome é ";
		System.out.println(nome);
		System.out.println(nome.trim());
		
	}

}
