package aula66garbageCollector;

import aula61passagemParametrosPorValorEPorReferencia.Contato;

public class ColetorLixo {
	
	public static void obterMemoriaUsada() {
		
		//para facilicar o c�lculo de memoria usada, transformaremos de bytes para megas(vide codigo abaixo)
		final int MB = 1024 * 1024;//1024 � um kbyte, e isso d� 1 MB
		
		//no Java, obtemos a memoria em tempo de execu��o
		//o Java tem uma classe chamada Runtime, que pertence ao pacote java.lang
		Runtime runtime = Runtime.getRuntime();//instanciando o Runtime, conhecido como padr�o Singleton
		
		//h� tamb�m o freeMemory(qt memo a ser usada) e maxMemory(memo max da JVM)
		//runtime.totalMemory() - runtime.freeMemory();//calculando o qto de memo o programa est� usando em bytes	
		//dividindo por MB, teremos o resultado em MB		
		System.out.println((runtime.totalMemory() - runtime.freeMemory())/MB);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Contato[] contatos = new Contato[10000];
		Contato contato;
		
		for(int i=0; i<contatos.length; i++) {
		contato = new Contato("Contato"+i, "1234-5678"+i, "contato"+i+"@email.com");//construtor da classe!
		contatos[i] = contato;
		}
		System.out.println("Contatos criados.");
		
		obterMemoriaUsada();
		
		contatos = null;//ao final, estamos removendo as referencias a esses objetos da memoria
		
		//rodando o c�digo sem for�ar o garbage collector, n�o h� diferen�a entre antes e depois (6 e 6) de remover os contatos da memoria
		//for�aremos o garbage collector a seguir
		//todo metodo que estende a classe Object tem um m�todo "finalize", que marca os objetos na memo para serem coletados
		//pelo garbage collector
		//abaixo, estamos pedindo para executar a finaliza��o dos objetos que criamos.
		Runtime.getRuntime().runFinalization();
		
		//chamando o garbage collector, for�ando sua execu��o
		//mas n�o � garantido que ele ser� executado
		Runtime.getRuntime().gc();
		
		//ap�s o gc, deu 6 e 0.
		
		//NO ENTANTO, N�O USAMOS O GC EM NOSSOS PROGRAMAS!
		
		System.out.println("Contatos removidos da mem�ria.");
		
		obterMemoriaUsada();
	}

}
