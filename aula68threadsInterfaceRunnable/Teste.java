package aula68threadsInterfaceRunnable;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		
		//ao rodar o c�digo at� aqui, nada acontecer�, pois a classe "MinhaThreadRunnable" apenas implementa a classe
		//Runnable, ela n�o � de fato um thread
		//Para ser uma thread de verdade � preciso passar essa classe Runnable para a thread
		
		//ao dar o ctr+space, existem algumas op��es de Thread()
		//usaremos a Thread(Runnable target); ou seja, passaremos como parametro uma classe que implementa a classe Runnable
		//
		//Thread t1 = new Thread(thread1);
		
		//ao rodar, ainda n�o ocorrer� nada porque est� faltando chamar o m�todo start
		//t1.start();

		//agora sim temos a classe funcionando
		
		//para facilicar o trabalho, podemos pegar as duas linhas de c�digo acima e coloca-las no contrutor
		//colocando no contrutor, ao instanciar a classe, tudo j� e chamado automaticamente
		
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 600);
		
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
		
		//AO EXECUTAR ESTE PROGRAMA MAIN CHEIO DE THREADS, ELE SE TORNA UM PROCESSO
		//DENTRO DESSE PROGRAMA H� 3 TAREFAS DIFERENTES, EXECUTADAS EM SEU PROPRIO TEMPO

	}
	
	
}
