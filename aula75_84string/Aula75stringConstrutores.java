package aula75_84string;

public class Aula75stringConstrutores {

	public static void main(String[] args) {
		
		String vazia = new String();// equivale a " " quando usamos o construtor vazio
		System.out.println(vazia);
		
		String java = new String("JAVA");//podemos passar uma string para o construtor
		System.out.println(java);
		
		//podemos criar uma string a partir de outra string
		//ao dar o ctrl+espaco dentro dos parenteses vazios, h� varias op��es		
		String java1 = new String(java);
		System.out.println(java1);
		
		//vimos no ctrl+espa�o que podemos tamb�m usar um array de char
		char[] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		//podemos especificar quais itens desejados num array
		//usando o ctrl+espaco offset (�ndices de in�cio e fim do array), no qual dentro do construtor coloca-se
		//o nome da vari�vel, o n�mero da primeira posi��o e o n�mero da �ltima posi��o
		char[] abcdef = {'A', 'B', 'C', 'D', 'E'};
		String abc = new String(abcdef, 0, 3);
		System.out.println(abcdef);
		System.out.println(abc);
		
		//d� para trabalhar com bytes usando a tabela ASCII, na qual cada letra tem um valor correspondente
		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		//atribui��o simples
		String java3 = "JAVA";
		String java4 = "JAVA";
		System.out.println(java3);
		System.out.println(java4);
		
		//CRIANDO A STRING VIA CONSTRUTOR OU VIA ATRIBUI��O SIMPLES, PARA O DEV, D� NA MESMA
		//POR�M, INTERNAMENTE NO JAVA EXISTE UMA GRANDE DIFEREN�A ENTRE ESSES DOIS TIPOS
		//AO MARCAR A LINHA DE CODIGO 43 POR EXEMPLO E DEBUGAR, AO OLHAR NAS VARI�VEIS, VEREMOS QUE CADA UMA TEM UM ID
		//OS ID'S S�O REFERENCIA DE MEMORIA
		//AS VARI�VEIS CRIADAS POR CONSTRUTOR TEM O MESMO CONTE�DO, MAS SEUS ID'S S�O DIFERENTES PORQUE A CADA VEZ
		//QUE USAMOS O OPERADOR "NEW", UM NOVO ESPA�O DE MEM�RIA � ALOCADO. J� QUANDO FAZEMOS A ATRIBUI��O SIMPLES
		//VERIFICAMOS QUE AMBAS AS VARI�VEIS "JAVA3" E "JAVA4" T�M O MESMO ID, MESMO UMA N�O FAZENDO REFER�NCIA � OUTRA
		//ISSO SIGNIFICA QUE TANTO "JAVA3" QUANTO "JAVA4" EST�O APONTANDO PARA O MESMO ENDERE�O DE MEMORIA
		//AO USAR O "NEW", � CRIADA UMA REF. DE MEMORIA QUE PODE APONTAR PARA UM OBJ JAVA (NO CASO DE STRING, � A PALAVRA)
		//NA ATRIBUI��O SIMPLES, EXISTE UMA ESP�CIE DE POOL, UM LUGAR ESPECIAL ONDE S�O CRIADAS AS STRINGS ATRAV�S DE 
		//ATRIBUI��O SIMPLES. ENT�O SER� VERIFICADO SE J� H� UMA STRING "JAVA" CRIADA; SE N�O, ALOCA ESPA�O, CRIA A REFER.
		//E ATRIBUI. AO CRIAR A OUTRA VAR QUE � IDENTICA � ANTERIOR (LEMBRAR QUE JAVA E CASE SENSITIVE). SER� FEITA A 
		//MESMA VERIFICA��O E SER� CONSTATADO QUE H� H� UMA STRING "JAVA" CRIADA, DA� ELE USAR� A MESMA REFER., N�O SENDO
		//ALOCADO ESPA�O DE MEM�RIA DIFERENTE PARA ESSE CASO.
		
		
	}

}
