package aula61passagemParametrosPorValorEPorReferencia;

public class PassagemValorParametro {

	public static void main(String[] args) {
		
		//pilha do programa
		Contato contato = new Contato("Contato 1", "1234-4567", "contato1@email.com");
		int valor = 10;
		
		System.out.println("********** VALORES ORIGINAIS **********");
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("********** EXEMPLO 1 **********");
		
		//ao chamar o m�todo abaixo, nada muda em rela��o ao que foi settado em "contato" e em "valor"
		//apesar de termos alterado esses valores no m�todo
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("********** EXEMPLO 2 **********");
		
		//aqui, s� o que muda � o nome "contato", que muda de "Contato 1" para "Contato20"
		testePassagemValorReferencia2(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
				
	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {
		
		//pilha do m�todo
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	}
	
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		
		//pilha do m�todo
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato" + novoValor);
	}
	
	
}
