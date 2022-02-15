package aula63printf;

public class ExemploPrintF {

	public static void main(String[] args) {
		
		
		//selecionar o "printf" String format, Object...args
		//temos dois parametros para passar, sendo o primeiro uma String e o segundo, um varargs
		//ao informar a String, quando se quer formatar dados no Java, 
		//System.out.printf(null, args);
		
		
		//se eu quero passar um argumento do tipo String e informar que ele é desse tipo, 
		//utiliza-se o símbolo "%" para indicar o tipo de dado que passaremos para o método
		//e o código correspondente. No caso de String, é um "s" minúsculo
		//onde era args, passamos o parâmetro, que pode ser de qualquer tipo
		//Veremos que ele vai imprimir concatenado
		System.out.printf("Hello %s ", "Olá, Mundo!");
		
		//também dá certo conforme abaixo
		//observar que o cursor não pula de linha, por isso usaremos um sysout println para separar
		
		System.out.println();
		System.out.printf("%s ", "Olá, Mundo!");
		
		//usando o "%S", queremos que todo o texto seja impresso em caixa alta
		System.out.println();
		System.out.printf("%S ", "Olá, Mundo!");
		
		//fazendo a saída somente de um caracter
		System.out.println();
		System.out.printf("%c ", 'c');
		
		System.out.println();
		System.out.printf("%C ", 'c');
		
		//podemos substituir o sysout println pelo que segue abaixo
		System.out.printf("%n");
		
		//também podemos usar o printf para fazer a saida formatada de valores, sendo eles inteiros ou flutuantes
		//para numero inteiro, a formatação é "%d
		int valor = 123456789;
		System.out.printf("%d", valor );
		
		System.out.println();
		
		//ponto flutuante, mas com arredondamento
		double pontoFlutuante = 3.123456789;
		System.out.printf("%f", pontoFlutuante );
		
		System.out.println();
		
		//colocando qtd de espaço de caracteres antes da saída da String (somando os espaços em branco e o escrito, dá 20)
		//alinhamento à direita
		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);
		
		System.out.println();
		
		//alinhamento à esquerda
		String olaMundo1 = "Olá, Mundo!";
		System.out.printf("%-20s", olaMundo1);
		
		System.out.println();
		
		//imprimindo sinal de + na frente do número
		//para imprimir com sinal negativo, basta deixar o valor da variável com sinal negativo
		//mesmo com o "%+d", sairá com o sinal negativo
		System.out.printf("%+d", valor );
		
		System.out.println();
		
		//o valor terá que ter 15 digitos, e completa o que não tiver com zero
		System.out.printf("%015d", valor);
		
		System.out.println();
		
		//separador de milhares com virgula ou ponto
		System.out.printf("%,d", valor);
		
		System.out.println();
		
		//ao colocar um espaço antes do "d", ele imprimirá o sinal junto com o número
		//mas se for positivo, ele imprime o espaço antes do número
		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		
		System.out.println();
		
		//para definir a qtd de cadas decimais, com arredondamento
		System.out.printf("%.3f", pontoFlutuante );
		
		System.out.println();
		
		//saída de valor monetário, com espaço de 10 dígitos entre o cifrão e o valor, com precisão de 2  dígitos
		System.out.printf("R$%10.2f", pontoFlutuante );
		
		System.out.println();
		
		testeMaisCompleto();

	}
	
	
	//método similar ao de impressao de nf de supermercado
	//o sysout é o system.out.printf(format, args)
	//dentro dos parênteses do parâmetro, tudo o que vem antes da vírgula é o formato, e depois os argumentos
	//%s = String
	//%02d = inteiro (número do item), completa com zero (pois trabalhamos com 5 itens), mantém 2 cadas decimais, o "d" indica que é um número
	//R$%,10.2f%n = % pt flutuante, "," separa com vírgula, "10" número com 10 espaços, ".2" com precisão de 2, "f" de flutuante, "%n" muda de linha
	//nos argumentos será preciso informar três, sendo que:
	//o primeiro precisa ser uma String ("Item")
	//o segundo argumento será o "i+1" para que o item venha: item1, item2, item3...
	//o terceiro argumento será o preço =  precos[i]
	private static void testeMaisCompleto() {
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
	}
	
	
	
	
	

}
