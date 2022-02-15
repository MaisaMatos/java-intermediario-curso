package aula73threadsResumeSuspendStop;

public class MinhaThread implements Runnable {
	
	//OS MÉTODS RESUME (que retoma a execução de uma thread suspensa), SUSPEND E STOP ERAM METODOS DA CLASSE THREAD E AQUI ESTAMOS USANDO A RUNNABLE
	//VAMOS TENTAR COPIAR O COMPORTAMENTO DAQUELES MÉTODOS (QUE NÃO EXISTEM MAIS NO JAVA) AQUI NESTA CLASSE
	
	//para suspender a thread, usaremos o Wait(), que já vimos antes
	
	private String nome;
	private boolean estaSuspensa;//flag inserida para fazermos a suspensão
	private boolean foiTerminada;//para implementar o metodo stop, explicado após o de suspensão
	
	
	public MinhaThread(String nome) {
		this.nome = nome;
		this.estaSuspensa = false; //inicializando o seu valor no construtor com falso. Thread vai iniciar NÃO suspensa
		new Thread(this, nome).start();;
	}
	

	@Override
	public void run() {
		
		System.out.println("Executando " + this.nome);
		
		//i < 10 é número aleatório qualquer
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Thread " + nome + " , " + i);
				Thread.sleep(300);
				//para concluir a suspensão, vamos chamar o Wait() enqto a thread estiver suspensa
				//para usar o Wait(), Notify() etc, é preciso estar num bloco "synchronized"
				//antes tínhamos visto só o método, agora veremos o bloco
				//recurso a sincronizar(dentro dos parênteses): como vamos suspender, resumir a execução da própria thread,
				//vamos passar a própria classe como recurso (this), então esta classe precisa estar sincronizada
				//ao passar o "this", todos os recursos (atributos) também estarão sincronizados
				synchronized (this) {
					while(estaSuspensa) {
						wait();
					}
					//trecho de código inserido devido ao método stop()
					//ao chamar o metodo, caso esteja suspensa, vai notificar, vai sair do while() e segue...
					if(this.foiTerminada) {
						break;//para sair do "for" e terminar a execução da thread
					}
				}
				
			} 
		} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		System.out.println("Thread " + this.nome + " terminada.");
		
	}	
	
	//também precisamos implementar o método de suspender
	void suspend() {
		this.estaSuspensa = true;
	}
	
	//para podermos resumir, suspender a execução
	//também só funciona com a palavra-chave synchronized
	synchronized void resume() {
		this.estaSuspensa = false;
		notify();//como estamos usando o wait lá em cima, precisamos notificar a thread que está suspensa esperando
	}

	synchronized void stop() {
		this.foiTerminada = true;
		notify();//se a classe estiver suspensa, estará no wait(), por isso é preciso notifica-la
	}
	

}
