package aula68threadsInterfaceRunnable;

public class MinhaThreadRunnable implements Runnable {
	
	private String nome;
	private int tempo;
	
	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		//como é preciso passar uma instancia da classe Runnable na linha de código abaixo, podemos passar o proprio "this"
		//pois o "this" faz referência à propria classe; ou seja, estamos passando a propria classe como parametro
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				Thread.sleep(tempo);
			}		
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		System.out.println(nome + "terminou a execução.");
	}
}


