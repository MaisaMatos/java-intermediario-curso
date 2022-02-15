package aula74threadsDeadlockExercicioSemafaro;

public class ThreadSemafaro implements Runnable {
	
	private CorSemafaro cor;
	private boolean parar;
	private boolean corMudou;
	
	
	public ThreadSemafaro() {
		this.cor = CorSemafaro.VERMELHO; //atribuindo a cor inicial do semafaro
		this.parar = false;//isso é opcional, visto que toda var booleana por padrão se inicia com falso
		this.corMudou = false;
		new Thread(this).start();//para poder inicar a thread e pode executar o método "run"
	}

	//dentro de "run", vamos ficar mudando a cor do semafaro
	//e se não colocarmos nada, a cor vai ficar mudando para sempre
	//para termos uma flag, uma bandeira para parar a execução do semafaro, criaremos o boolean "parar"
	@Override
	public void run() {
		
		//enquanto não pedir para parar, vamos pedir para o semafaro esperar e depois trocamos de core
		//e faremos um switch, já que estamos usando um Enum
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
				//vamos pedir para mudar a cor, vide método abaixo
				this.mudarCor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//metodo privado, pois só será usado dentro da própria classe
	//e como faremos acesso a um atributo da própria classe e para não correr o risco de uma outra thread
	//tentar usar ao mesmo tempo, o método ficará synchronized
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
	
	//metodo para parar o funcionamento das threads após as 10x estipuladas, senão ele fica rodando!
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
