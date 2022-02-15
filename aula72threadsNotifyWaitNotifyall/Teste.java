package aula72threadsNotifyWaitNotifyall;

public class Teste {

	public static void main(String[] args) {
		
		TicTac tt = new TicTac();
		ThreadTicTac tic = new ThreadTicTac("tic", tt);
		ThreadTicTac tac = new ThreadTicTac("tac", tt);
		
		//queremos que as threads terminem e esperem a execu��o de cada uma
		try {
			tic.t.join();
			tac.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//SEM OS NOFIFY E WAIT, O C�DIGO IRIA EXECUTAR PRIMEIRAMENTE OS 5 TICS E DEPOIS OS 5 TACS
		
	}
	

}
