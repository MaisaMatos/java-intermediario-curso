package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste4 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",500);		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",500);
		
		//como comentamos a parte da Thread no construtor da outra classe, vamos refazer isso aqui
		//esta é a instancia das threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		//cod colocados mais abaixo devido à necessidade lógica
		//t1.start();
		//t2.start();
		//t3.start();
		
		//ao rodar, as tres tarefas serão executadas juntas pois o tempo é o mesmo para todas
		
		//a msg abaixo deveria aparecer no final das execuções, mas ela aparece no começo ou no meio
		//System.out.println("Programa finalizado.");
		
		//para resolver isso, veja abaixo a terceira opção
		//antes era o "for", depois foi o "while", agora é o "join"
		
		t1.start();		
		//o método join vai esperar e execução da thread para só assim continuar o código.
		//ele também pode disparar a exceção, então precisamos de um try-catch
		//t2 só vai iniciar sua execução quanto t1 terminar ou então 200 milissegundos após o início da t1
		//o que acontecer primeiro.
		try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		t2.start();	//não pode haver argumento senão o compilador reclama	
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		t3.start();	
				
		System.out.println("Programa finalizado.");
		
		//do modo como está o codigo acima (de 35-51), a msg ainda aparece no meio do caminho
		
		//para que a msg seja impressa somente após o fim das 3 threads, comentei os try-catch com join e vide abaixo

	}

}
