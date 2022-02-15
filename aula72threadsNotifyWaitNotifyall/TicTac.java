package aula72threadsNotifyWaitNotifyall;

//faremos um programa com duas threads, a tic e a tac
//sua tarefa ser� imprimir "tic" ou "tac" na tela
//faremos com que a sa�da seja sincronizada; ou seja: tic, tac, tic, tac... n vezes


public class TicTac {

	boolean tic; //essa var indicar� qual � a hora do tic e qual q hora do tac ser impresso
	
	//para usar os m�todos wait(), notify() e notifyAll(), tem que ser num bloco de c�digo sincronizado
	synchronized void tic(boolean estaExecutando) {		
		if(!estaExecutando) {//enquanto tic estiver executando, n�o n�o passar� por este if
			tic = true;
			notify();//se n�o estiver executando, notificar a outra thread
			return;
		}
		System.out.print("Tic ");		
		tic = true;//� true pq estamos executando o tic
		notify();//notifica a thread do tac que ela pode ser executada.		
		try {
			while(tic) {//enquanto for tic, pedimos para esperar	
				wait();
			} 
		} catch (InterruptedException e) {
				e.printStackTrace();
		}		
	}	
		
	
	synchronized void tac(boolean estaExecutando) {			
		if(!estaExecutando) {
			tic = false;
			notify();//se n�o estiver executando, notificar a outra thread
			return;
		}			
		System.out.println("Tac ");		
		tic = false;
		notify();		
		try {
			while(!tic) {			
				wait();
			} 
		} catch (InterruptedException e) {
				e.printStackTrace();
		}		
	}
		
}
	
	

