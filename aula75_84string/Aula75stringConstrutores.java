package aula75_84string;

public class Aula75stringConstrutores {

	public static void main(String[] args) {
		
		String vazia = new String();// equivale a " " quando usamos o construtor vazio
		System.out.println(vazia);
		
		String java = new String("JAVA");//podemos passar uma string para o construtor
		System.out.println(java);
		
		//podemos criar uma string a partir de outra string
		//ao dar o ctrl+espaco dentro dos parenteses vazios, há varias opções		
		String java1 = new String(java);
		System.out.println(java1);
		
		//vimos no ctrl+espaço que podemos também usar um array de char
		char[] charsJava = {'J', 'A', 'V', 'A'};
		String java2 = new String(charsJava);
		System.out.println(java2);
		
		//podemos especificar quais itens desejados num array
		//usando o ctrl+espaco offset (índices de início e fim do array), no qual dentro do construtor coloca-se
		//o nome da variável, o número da primeira posição e o número da última posição
		char[] abcdef = {'A', 'B', 'C', 'D', 'E'};
		String abc = new String(abcdef, 0, 3);
		System.out.println(abcdef);
		System.out.println(abc);
		
		//dá para trabalhar com bytes usando a tabela ASCII, na qual cada letra tem um valor correspondente
		byte[] ascii = {65, 66, 67, 68, 69};
		String abcde = new String(ascii);
		System.out.println(abcde);
		
		String bcd = new String(ascii, 1, 3);
		System.out.println(bcd);
		
		//atribuição simples
		String java3 = "JAVA";
		String java4 = "JAVA";
		System.out.println(java3);
		System.out.println(java4);
		
		//CRIANDO A STRING VIA CONSTRUTOR OU VIA ATRIBUIÇÃO SIMPLES, PARA O DEV, DÁ NA MESMA
		//PORÉM, INTERNAMENTE NO JAVA EXISTE UMA GRANDE DIFERENÇA ENTRE ESSES DOIS TIPOS
		//AO MARCAR A LINHA DE CODIGO 43 POR EXEMPLO E DEBUGAR, AO OLHAR NAS VARIÁVEIS, VEREMOS QUE CADA UMA TEM UM ID
		//OS ID'S SÃO REFERENCIA DE MEMORIA
		//AS VARIÁVEIS CRIADAS POR CONSTRUTOR TEM O MESMO CONTEÚDO, MAS SEUS ID'S SÃO DIFERENTES PORQUE A CADA VEZ
		//QUE USAMOS O OPERADOR "NEW", UM NOVO ESPAÇO DE MEMÓRIA É ALOCADO. JÁ QUANDO FAZEMOS A ATRIBUIÇÃO SIMPLES
		//VERIFICAMOS QUE AMBAS AS VARIÁVEIS "JAVA3" E "JAVA4" TÊM O MESMO ID, MESMO UMA NÃO FAZENDO REFERÊNCIA À OUTRA
		//ISSO SIGNIFICA QUE TANTO "JAVA3" QUANTO "JAVA4" ESTÃO APONTANDO PARA O MESMO ENDEREÇO DE MEMORIA
		//AO USAR O "NEW", É CRIADA UMA REF. DE MEMORIA QUE PODE APONTAR PARA UM OBJ JAVA (NO CASO DE STRING, É A PALAVRA)
		//NA ATRIBUIÇÃO SIMPLES, EXISTE UMA ESPÉCIE DE POOL, UM LUGAR ESPECIAL ONDE SÃO CRIADAS AS STRINGS ATRAVÉS DE 
		//ATRIBUIÇÃO SIMPLES. ENTÃO SERÁ VERIFICADO SE JÁ HÁ UMA STRING "JAVA" CRIADA; SE NÃO, ALOCA ESPAÇO, CRIA A REFER.
		//E ATRIBUI. AO CRIAR A OUTRA VAR QUE É IDENTICA À ANTERIOR (LEMBRAR QUE JAVA E CASE SENSITIVE). SERÁ FEITA A 
		//MESMA VERIFICAÇÃO E SERÁ CONSTATADO QUE HÁ HÁ UMA STRING "JAVA" CRIADA, DAÍ ELE USARÁ A MESMA REFER., NÃO SENDO
		//ALOCADO ESPAÇO DE MEMÓRIA DIFERENTE PARA ESSE CASO.
		
		
	}

}
