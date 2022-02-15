package aula74threadsDeadlockExercicioSemafaro;

public class ThreadSemafaro implements Runnable {
	
	private CorSemafaro cor;
	private boolean parar;
	private boolean corMudou;
	
	
	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO; //atribuindo a cor inicial do semafaro
		this.parar = false;//isso � opcional, visto que toda var booleana por padr�o se inicia com falso
		this.corMudou = false;
		new Thread(this).start();//para poder inicar a thread e pode executar o m�todo "run"
	}

	//dentro de "run", vamos ficar mudando a cor do semafaro
	//e se n�o colocarmos nada, a cor vai ficar mudando para sempre
	//para termos uma flag, uma bandeira para parar a execu��o do semafaro, criaremos o boolean "parar"
	@Override
	public void run() {
		
		//enquanto n�o pedir para parar, vamos pedir para o semafaro esperar e depois trocamos de core
		//e faremos um switch, j� que estamos usando um Enum
		while(!parar) {
			try {
				switch (this.cor) {
				case VERMELHO:				
					Thread.sleep(2000);				
					break;
				case AMARELO:				
					Thread.sleep(300);				
					break;
				case VERDE:				
					Thread.sleep(1000);				
					break;	
				}
				//vamos pedir para mudar a cor, vide m�todo abaixo
				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//metodo privado, pois s� ser� usado dentro da pr�pria classe
	//e como faremos acesso a um atributo da pr�pria classe e para n�o correr o risco de uma outra thread
	//tentar usar ao mesmo tempo, o m�todo ficar� synchronized
	private synchronized void mudarCor() {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemafaro.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemafaro.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemafaro.AMARELO;
			break;	
		}
		this.corMudou = true;
		notify();//para notificar a thread que estiver esperando, teremos que criar um metodo para esperar mudar cor
	}
	
	//metodo para parar o funcionamento das threads ap�s as 10x estipuladas, sen�o ele fica rodando!
	public synchronized void desligarSemafaro() {
		this.parar = true;
	}
	
	
	
	public synchronized void esperaCorMudar() {
		while(!this.corMudou) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.corMudou = false;
	}

	public CorSemafaro getCor() {
		return cor;
	}
	
	
	

}
