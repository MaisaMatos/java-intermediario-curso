package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste2 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",500);		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",500);
		
		//como comentamos a parte da Thread no construtor da outra classe, vamos refazer isso aqui
		//esta � a instancia das threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		//ao rodar, as tres tarefas ser�o executadas juntas pois o tempo � o mesmo para todas
		
		//a msg abaixo deveria aparecer no final das execu��es, mas ela aparece no come�o ou no meio
		//System.out.println("Programa finalizado.");
		
		//para resolver isso, veja abaixo a segunda op��o
		//antes era o "for", agora � o "while"
		//o "while" far� assim: enquanto a thread1 ou a thread2 ou a thread3 estiverem vivas,
		//pedimos para a thread principal ("Thread"), que � o programa do m�todo main,  dormir
		//assim, garantiremos que a msg de programa finalizado s� ser� impressa ao final do programa
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("Programa finalizado.");
		
		//agora aconteceu o desejado; no entanto, estamos colocando uma l�gica de programa��o extra dentro do metodo
		//main para garantir que a msg s� seja impressa ap�s o t�rmino das 3 threads
		//no entanto, isso n�o seria um c�digo muito limpo
		//ent�o faremos um Teste3 com outra op��o


	}

}
