package aula73threadsResumeSuspendStop;

public class MinhaThread implements Runnable {
	
	//OS M�TODS RESUME (que retoma a execu��o de uma thread suspensa), SUSPEND E STOP ERAM METODOS DA CLASSE THREAD E AQUI ESTAMOS USANDO A RUNNABLE
	//VAMOS TENTAR COPIAR O COMPORTAMENTO DAQUELES M�TODOS (QUE N�O EXISTEM MAIS NO JAVA) AQUI NESTA CLASSE
	
	//para suspender a thread, usaremos o Wait(), que j� vimos antes
	
	private String nome;
	private boolean estaSuspensa;//flag inserida para fazermos a suspens�o
	private boolean foiTerminada;//para implementar o metodo stop, explicado ap�s o de suspens�o
	
	
	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSuspensa = false; //inicializando o seu valor no construtor com falso. Thread vai iniciar N�O suspensa
		new Thread(this, nome).start();;
	}
	

	@Override
	public void run() {
		
		System.out.println("Executando " + this.nome);
		
		//i < 10 � n�mero aleat�rio qualquer
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Thread " + nome + " , " + i);
				Thread.sleep(300);
				//para concluir a suspens�o, vamos chamar o Wait() enqto a thread estiver suspensa
				//para usar o Wait(), Notify() etc, � preciso estar num bloco "synchronized"
				//antes t�nhamos visto s� o m�todo, agora veremos o bloco
				//recurso a sincronizar(dentro dos par�nteses): como vamos suspender, resumir a execu��o da pr�pria thread,
				//vamos passar a pr�pria classe como recurso (this), ent�o esta classe precisa estar sincronizada
				//ao passar o "this", todos os recursos (atributos) tamb�m estar�o sincronizados
				synchronized (this) {
					while(estaSuspensa) {
						wait();
					}
					//trecho de c�digo inserido devido ao m�todo stop()
					//ao chamar o metodo, caso esteja suspensa, vai notificar, vai sair do while() e segue...
					if(this.foiTerminada) {
						break;//para sair do "for" e terminar a execu��o da thread
					}
				}
				
			} 
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		System.out.println("Thread " + this.nome + " terminada.");
		
	}	
	
	//tamb�m precisamos implementar o m�todo de suspender
	void suspend() {
		this.estaSuspensa = true;
	}
	
	//para podermos resumir, suspender a execu��o
	//tamb�m s� funciona com a palavra-chave synchronized
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();//como estamos usando o wait l� em cima, precisamos notificar a thread que est� suspensa esperando
	}

	synchronized void stop() {
		this.foiTerminada = true;
		notify();//se a classe estiver suspensa, estar� no wait(), por isso � preciso notifica-la
	}
	

}
