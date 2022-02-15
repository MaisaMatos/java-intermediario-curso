package aula69criandoVariasThreadsMetodosIsAliveEJoin;

public class Teste3 {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1",500);		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2",700);		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3",800);
		
		//como comentamos a parte da Thread no construtor da outra classe, vamos refazer isso aqui
		//esta é a instancia das threads
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();			
		t2.start();				
		t3.start();	
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//o codigo acima faz o seguinte: inicia as 3 threads (start), elas serão executadas, depois o programa pedirá
		//para esperar a execução das três (join) acabarem, pra só depois imprimir a msg
				
		System.out.println("Programa finalizado.");
		
		//USAR O METODO JOIN PARA ESPERAR A EXECUÇÃO DE UM DETERMINADO METODO ACABAR É A FORMA MAIS ELEGANTE DO QUE
		//O MÉTODO ISALIVE
	}

}
