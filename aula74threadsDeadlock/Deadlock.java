package aula74threadsDeadlock;

public class Deadlock {
	
	//aqui, usaremos classes aninhadas, mas pode-se fazer como vínhamos fazendo nas aulas e separar as classes
	
	public static void main(String[] args) {
		
		final String RECURSO1 = "Recurso #1";
		final String RECURSO2 = "Recurso #2";
		
		Thread t1 = new Thread() {
			
			public void run() {
				synchronized (RECURSO1) {
					System.out.println("Thread #1 bloqueou o Recurso 1");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #1 tentando acesso ao Recurso 2");
					
					synchronized (RECURSO2) {
						System.out.println("Thread #1 bloqueou o Recurso 2");
					}
				}
			}
		};
		
		
		Thread t2 = new Thread() {
			
			public void run() {
				synchronized (RECURSO2) {
					System.out.println("Thread #2 bloqueou o Recurso 2");
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Thread #2 tentando acesso ao Recurso 1");
					
					synchronized (RECURSO1) {
						System.out.println("Thread #2 bloqueou o Recurso 1");
					}
				}
			}
		};

		//para executar as duas threads, temos que chamar o metodo start()
		t1.start();
		t2.start();
		
		//aparecerá o deadlock, mostrando que ambas as threads bloquearam os respectivos recursos e estão
		//tentando acessar os outros recursos. O programa não para, botão vermelho de stop fica ativo
		
		//para evitar os deadlocks, devemos usar os métodos wait() e notify(), pois assim liberaremos temporariamente
		//o recurso e depois podemos voltar a utiliza-lo.
		
		
		
		
		
		
		
		
	}

}
