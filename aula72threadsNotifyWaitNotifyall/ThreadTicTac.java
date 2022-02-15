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
		//estamos pedindo para executar o método tic 5 vezes e quando terminar a execução, vai dar um "return" e parar o metodo
		if(t.getName().equalsIgnoreCase("Tic")) {
			for(int i=0; i<NUM; i++) {
				tt.tic(true);
			}
			tt.tic(false);//quando o de cima termina, passa false para terminar a execução
		} else	{
			for(int i=0; i<NUM; i++) {
				tt.tac(true);
			}
			tt.tac(false);
		}
		
	}
	
}
