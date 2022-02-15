package aula72threadsNotifyWaitNotifyall;

public class ThreadTicTac implements Runnable {

	TicTac tt;
	Thread t;
	
	final int NUM = 5;
	
	public ThreadTicTac(String nome, TicTac tt) {
		this.tt = tt;
		t = new Thread(this, nome);
		t.start();
	}

	@Override
	public void run() {
		//estamos pedindo para executar o m�todo tic 5 vezes e quando terminar a execu��o, vai dar um "return" e parar o metodo
		if(t.getName().equalsIgnoreCase("Tic")) {
			for(int i=0; i<NUM; i++) {
				tt.tic(true);
			}
			tt.tic(false);//quando o de cima termina, passa false para terminar a execu��o
		} else	{
			for(int i=0; i<NUM; i++) {
				tt.tac(true);
			}
			tt.tac(false);
		}
		
	}
	
}
