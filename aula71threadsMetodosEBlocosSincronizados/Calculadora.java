package aula71threadsMetodosEBlocosSincronizados;

//para que essa classe possa ser compartilhada entre 2 ou mais threads, ela precisa ser est�tica.
//assim, 2 ou mais threads poder�o acessar a mesma instancia dessa classe, que � onde pode ocorrer esse problema de
//o m�todo ou recurso n�o estar sincronizado
//a� poderemos ver a diferen�a de comportamento de quando sincronizamos o c�digo e quando n�o sincronizamos


public class Calculadora {
	
	private int soma;
	
	public synchronized int somaArray(int[] array) {
		
		soma = 0;
		
		for(int i=0; i<array.length; i++) {
			soma += array[i];
		
		
		//Syso para sabermos quem est� executando a thread
		//m�todo ".currentThread" pega o nome da thread que est� acessando o m�todo
		//e como em "MinhaThreadSoma" n�s passamos "nome" como par�metro, podemos usar o ".getName" aqui
		System.out.println("Executando a soma " + Thread.currentThread().getName() + 
				" somando o valor " + array[i] + " com total de " + soma );
		
		//para ser compartilhado entre as threads, pediremos para a cada "passada de for" para esperarmos um pouco
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
		return soma;
	}

}