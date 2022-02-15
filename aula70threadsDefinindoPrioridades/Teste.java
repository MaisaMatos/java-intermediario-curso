package aula70threadsDefinindoPrioridades;

import aula69criandoVariasThreadsMetodosIsAliveEJoin.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		/*t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);*/
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
		//a ordem das threads varia, n�o � sempre 1, 2 e 3. Isso depende de v�rios fatores
		//por ex. depende da prioridade das threads. Quando instanciamos threads no Java, se n�o "falarmos nada"
		//para o programa, todas as threads ter�o prioridade normal. Mas � poss�vel alterar isso, usando
		//o m�todo "setPriority()", cujo atributo pode ter valores de 1 a 10.
		//na maioria das vezes, a thread priorit�ria ser� executada antes das outras, mas isso n�o � uma regra,
		//visto que realmente a prioridade depende de v�rios fatores, como o SO.
		//e tamb�m � poss�vel usar as CONSTANTES
		

	}

}
