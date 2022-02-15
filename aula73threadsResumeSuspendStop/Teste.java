package aula73threadsResumeSuspendStop;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread t1 = new MinhaThread("#1");
		MinhaThread t2 = new MinhaThread("#2");
		
		
		
		//conforme está o código acima, as threads vão contando de 1 a 10, se revezando e terminando juntas
		
		//agora, vamos supor que queremos iniciar e suspender a thread, pausá-la temporariamente
		//voltaremos na classe "MinhaThread"
		//após colocar todas as alterações para a suspensão na classe, vamos continuar aqui
		//interpretando o código:
			//vamos iniciar a execução com as duas linhas de código acima
			//vamos suspender a primeira thread
			//haverá uma espera de 200 milissegundos
			//vamos suspender a segunda thread
			//vamos resumir a execução da primeira thread
		
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
		
		//É  possível ver que as duas threads iniciaram, mas a segunda foi suspensa e a primeira continuou
		//no entanto, o programa ainda não se encerrou (botão vermelho stop continua ativo) porque
		//a thread2 foi suspensa, e o programa está esperando que ela seja notificada para iniciar sua execução

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Resumindo a thread #2");
		
		t2.resume();	
		
		//agora sim as duas threads iniciam e terminam sua execução
		
		System.out.println("Terminando a thread #1");

		
		t2.stop();
		
	}

}
