package aula63printf;

public class ExemploPrintF {

	public static void main(String[] args) {
		
		
		//selecionar o "printf" String format, Object...args
		//temos dois parametros para passar, sendo o primeiro uma String e o segundo, um varargs
		//ao informar a String, quando se quer formatar dados no Java, 
		//System.out.printf(null, args);
		
		
		//se eu quero passar um argumento do tipo String e informar que ele � desse tipo, 
		//utiliza-se o s�mbolo "%" para indicar o tipo de dado que passaremos para o m�todo
		//e o c�digo correspondente. No caso de String, � um "s" min�sculo
		//onde era args, passamos o par�metro, que pode ser de qualquer tipo
		//Veremos que ele vai imprimir concatenado
		System.out.printf("Hello %s ", "Ol�, Mundo!");
		
		//tamb�m d� certo conforme abaixo
		//observar que o cursor n�o pula de linha, por isso usaremos um sysout println para separar
		
		System.out.println();
		System.out.printf("%s ", "Ol�, Mundo!");
		
		//usando o "%S", queremos que todo o texto seja impresso em caixa alta
		System.out.println();
		System.out.printf("%S ", "Ol�, Mundo!");
		
		//fazendo a sa�da somente de um caracter
		System.out.println();
		System.out.printf("%c ", 'c');
		
		System.out.println();
		System.out.printf("%C ", 'c');
		
		//podemos substituir o sysout println pelo que segue abaixo
		System.out.printf("%n");
		
		//tamb�m podemos usar o printf para fazer a saida formatada de valores, sendo eles inteiros ou flutuantes
		//para numero inteiro, a formata��o � "%d
		int valor = 123456789;
		System.out.printf("%d", valor );
		
		System.out.println();
		
		//ponto flutuante, mas com arredondamento
		double pontoFlutuante = 3.123456789;
		System.out.printf("%f", pontoFlutuante );
		
		System.out.println();
		
		//colocando qtd de espa�o de caracteres antes da sa�da da String (somando os espa�os em branco e o escrito, d� 20)
		//alinhamento � direita
		String olaMundo = "Ol�, Mundo!";
		System.out.printf("%20s", olaMundo);
		
		System.out.println();
		
		//alinhamento � esquerda
		String olaMundo1 = "Ol�, Mundo!";
		System.out.printf("%-20s", olaMundo1);
		
		System.out.println();
		
		//imprimindo sinal de + na frente do n�mero
		//para imprimir com sinal negativo, basta deixar o valor da vari�vel com sinal negativo
		//mesmo com o "%+d", sair� com o sinal negativo
		System.out.printf("%+d", valor );
		
		System.out.println();
		
		//o valor ter� que ter 15 digitos, e completa o que n�o tiver com zero
		System.out.printf("%015d", valor);
		
		System.out.println();
		
		//separador de milhares com virgula ou ponto
		System.out.printf("%,d", valor);
		
		System.out.println();
		
		//ao colocar um espa�o antes do "d", ele imprimir� o sinal junto com o n�mero
		//mas se for positivo, ele imprime o espa�o antes do n�mero
		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		
		System.out.println();
		
		//para definir a qtd de cadas decimais, com arredondamento
		System.out.printf("%.3f", pontoFlutuante );
		
		System.out.println();
		
		//sa�da de valor monet�rio, com espa�o de 10 d�gitos entre o cifr�o e o valor, com precis�o de 2  d�gitos
		System.out.printf("R$%10.2f", pontoFlutuante );
		
		System.out.println();
		
		testeMaisCompleto();

	}
	
	
	//m�todo similar ao de impressao de nf de supermercado
	//o sysout � o system.out.printf(format, args)
	//dentro dos par�nteses do par�metro, tudo o que vem antes da v�rgula � o formato, e depois os argumentos
	//%s = String
	//%02d = inteiro (n�mero do item), completa com zero (pois trabalhamos com 5 itens), mant�m 2 cadas decimais, o "d" indica que � um n�mero
	//R$%,10.2f%n = % pt flutuante, "," separa com v�rgula, "10" n�mero com 10 espa�os, ".2" com precis�o de 2, "f" de flutuante, "%n" muda de linha
	//nos argumentos ser� preciso informar tr�s, sendo que:
	//o primeiro precisa ser uma String ("Item")
	//o segundo argumento ser� o "i+1" para que o item venha: item1, item2, item3...
	//o terceiro argumento ser� o pre�o =  precos[i]
	private static void testeMaisCompleto() {
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}
	
	
	
	
	

}
