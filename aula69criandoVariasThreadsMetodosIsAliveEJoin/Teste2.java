package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste2 {

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
		
		//para resolver isso, veja abaixo a segunda opção
		//antes era o "for", agora é o "while"
		//o "while" fará assim: enquanto a thread1 ou a thread2 ou a thread3 estiverem vivas,
		//pedimos para a thread principal ("Thread"), que é o programa do método main,  dormir
		//assim, garantiremos que a msg de programa finalizado só será impressa ao final do programa
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println("Programa finalizado.");
		
		//agora aconteceu o desejado; no entanto, estamos colocando uma lógica de programação extra dentro do metodo
		//main para garantir que a msg só seja impressa após o término das 3 threads
		//no entanto, isso não seria um código muito limpo
		//então faremos um Teste3 com outra opção


	}

}
