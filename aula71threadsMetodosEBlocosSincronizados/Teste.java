package aula71threadsMetodosEBlocosSincronizados;

public class Teste {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		
		//o resultado da calculadora deveria ser a soma dos n�meros do array, que � 15
		//mas o resultado est� sendo 26. Isso � porque a vari�vel "soma" que est� no "for" da "Calculadora"
		//est� sendo compartilhada entre as duas threads, visto que temos uma inst�ncia est�tica da Calculadora 
		//em "MinhaThreadSoma".
		//o c�digo n�o est� sincronizado, temos duas threads acessando o mesmo recurso (var "soma")
		//para resolver tudo isso, basta adicionar a palavra-chave "SYNCHRONIZED" no m�todo "somaArray"
		//isso far� com que apenas uma thread por vez possa acessar esse m�todo
		//n�o permitiremos que as duas threads acessem o m�todo, alterando "soma" ao mesmo tempo
		//fazendo isso e rodando de novo o c�digo, garantimos que o resultado final ser� o correto: 15
		

	}

}
