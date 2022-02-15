package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",500);		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",500);
		
		//como comentamos a parte da Thread no construtor da outra classe, vamos refazer isso aqui
		//esta é a instancia das threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		//ao rodar, as tres tarefas serão executadas juntas pois o tempo é o mesmo para todas
		
		//a msg abaixo deveria aparecer no final das execuções, mas ela aparece no começo ou no meio
		//System.out.println("Programa finalizado.");
		
		//para resolver isso, veja abaixo a primeira opção
		for(int i=0; i<16; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//ainda assim a msg abaixo não é impressa no fim das tarefas colocando no for "i<7", mas sim "i<16"
		//isso é, tivemos que chutar um número no "for", o que não é bom
		System.out.println("Programa finalizado.");
		
		//FAMOS FAZER UM TESTE2 E MODIFICAR AS COISAS PARA MELHORÁ-LAS
	}

}
