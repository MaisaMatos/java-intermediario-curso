package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste4 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",500);		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",500);
		
		//como comentamos a parte da Thread no construtor da outra classe, vamos refazer isso aqui
		//esta � a instancia das threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		//cod colocados mais abaixo devido � necessidade l�gica
		//t1.start();
		//t2.start();
		//t3.start();
		
		//ao rodar, as tres tarefas ser�o executadas juntas pois o tempo � o mesmo para todas
		
		//a msg abaixo deveria aparecer no final das execu��es, mas ela aparece no come�o ou no meio
		//System.out.println("Programa finalizado.");
		
		//para resolver isso, veja abaixo a terceira op��o
		//antes era o "for", depois foi o "while", agora � o "join"
		
		t1.start();		
		//o m�todo join vai esperar e execu��o da thread para s� assim continuar o c�digo.
		//ele tamb�m pode disparar a exce��o, ent�o precisamos de um try-catch
		//t2 s� vai iniciar sua execu��o quanto t1 terminar ou ent�o 200 milissegundos ap�s o in�cio da t1
		//o que acontecer primeiro.
		try {
			t1.join(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		t2.start();	//n�o pode haver argumento sen�o o compilador reclama	
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		t3.start();	
				
		System.out.println("Programa finalizado.");
		
		//do modo como est� o codigo acima (de 35-51), a msg ainda aparece no meio do caminho
		
		//para que a msg seja impressa somente ap�s o fim das 3 threads, comentei os try-catch com join e vide abaixo

	}

}
