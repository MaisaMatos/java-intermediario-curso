package aula71threadsMetodosEBlocosSincronizados;

public class Teste {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array);
		MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array);
		
		//o resultado da calculadora deveria ser a soma dos números do array, que é 15
		//mas o resultado está sendo 26. Isso é porque a variável "soma" que está no "for" da "Calculadora"
		//está sendo compartilhada entre as duas threads, visto que temos uma instância estática da Calculadora 
		//em "MinhaThreadSoma".
		//o código não está sincronizado, temos duas threads acessando o mesmo recurso (var "soma")
		//para resolver tudo isso, basta adicionar a palavra-chave "SYNCHRONIZED" no método "somaArray"
		//isso fará com que apenas uma thread por vez possa acessar esse método
		//não permitiremos que as duas threads acessem o método, alterando "soma" ao mesmo tempo
		//fazendo isso e rodando de novo o código, garantimos que o resultado final será o correto: 15
		

	}

}
