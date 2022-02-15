package aula73threadsResumeSuspendStop;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		
		
		//conforme est� o c�digo acima, as threads v�o contando de 1 a 10, se revezando e terminando juntas
		
		//agora, vamos supor que queremos iniciar e suspender a thread, paus�-la temporariamente
		//voltaremos na classe "MinhaThread"
		//ap�s colocar todas as altera��es para a suspens�o na classe, vamos continuar aqui
		//interpretando o c�digo:
			//vamos iniciar a execu��o com as duas linhas de c�digo acima
			//vamos suspender a primeira thread
			//haver� uma espera de 200 milissegundos
			//vamos suspender a segunda thread
			//vamos resumir a execu��o da primeira thread
		
		System.out.println("Pausando a thread #1");
		
		t1.suspend();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Pausando a thread #2");
		
		t2.suspend();
		
		System.out.println("Resumindo a thread #1");
		
		t1.resume();
		
		//�  poss�vel ver que as duas threads iniciaram, mas a segunda foi suspensa e a primeira continuou
		//no entanto, o programa ainda n�o se encerrou (bot�o vermelho stop continua ativo) porque
		//a thread2 foi suspensa, e o programa est� esperando que ela seja notificada para iniciar sua execu��o

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a thread #2");
		
		t2.resume();	
		
		//agora sim as duas threads iniciam e terminam sua execu��o
		
		System.out.println("Terminando a thread #1");

		
		t2.stop();
		
	}

}
