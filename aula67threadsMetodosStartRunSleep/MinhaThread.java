package aula67threadsMetodosStartRunSleep;

public class MinhaThread extends Thread {
	
	private String nome;
	private int tempo;
	
	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	//a assinatura do m�todo "run" n�o recebe par�m.
	//vide o triangulo verde ao lado, que significa que estamos sobrescrevendo o m�todo
	/*public void run() {
	
		System.out.println("Executando a thread.");
		
	}*/
	
	//outro metodo run abaixo, por isso comentei o primeiro
	public void run() {
		
		try {
			
			for(int i=0; i<6; i++) {
				System.out.println(nome + " contador " + i);
				
				//colocando a thread para dormir				
				//Thread.sleep(100);
				Thread.sleep(tempo);//ao inv�s de 100, a thread vai dormir no tempo estipulado no construtor
			}
		//isto try-cath � uma exce��o verificada, que j� vimos antes	
		//ao chamar o metodo sleep h� uma possibilidade de a exception ser lan�ada
		//colocando (100) no m�todo sleep, ele executa em Teste rapidaente
		//colocando (900) no m�todo sleep, ele executa mais devagar cada uma das linhas
		//isso porque a thread � executada, ela imprime o contador, dorme por quase 1 segundo e a� ela volta
	    //para o "for" e imprime novamente o proximo
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(nome + " terminou a execu��o ");// estado "dead"
	}
	
}
