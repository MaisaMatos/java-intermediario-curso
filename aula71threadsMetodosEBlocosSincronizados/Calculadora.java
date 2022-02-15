package aula71threadsMetodosEBlocosSincronizados;

//para que essa classe possa ser compartilhada entre 2 ou mais threads, ela precisa ser estática.
//assim, 2 ou mais threads poderão acessar a mesma instancia dessa classe, que é onde pode ocorrer esse problema de
//o método ou recurso não estar sincronizado
//aí poderemos ver a diferença de comportamento de quando sincronizamos o código e quando não sincronizamos


public class Calculadora {
	
	private int soma;
	
	public synchronized int somaArray(int[] array) {
		
		soma = 0;
		
		for(int i=0; i<array.length; i++) {
			soma += array[i];
		
		
		//Syso para sabermos quem está executando a thread
		//método ".currentThread" pega o nome da thread que está acessando o método
		//e como em "MinhaThreadSoma" nós passamos "nome" como parâmetro, podemos usar o ".getName" aqui
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