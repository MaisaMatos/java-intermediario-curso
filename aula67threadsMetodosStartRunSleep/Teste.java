package aula67threadsMetodosStartRunSleep;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThread thread	= new MinhaThread("Thread #1", 600);
		
		//ao executar assim, nada acontece
		
		//para uma thread ser executada, precisamos sobrescrever o método "run, cuja assinatura não recebe parâm.
		//vide na classe MinhaThread
		
		//mesmo incluindo o método "run", ao executar, nada acontece
		//é preciso iniciar a thread coforme abaixo
		
		//thread.start();//o metodo start vai chamar o metodo run
		//para não ficar chamando o start toda hora, podemos coloca-lo dentro do construtor
		
		
		//para vermos como as threads funcionam, vamos criar mais uma para trabalhar com multi-threads
		//o cod abaixo fará com que apareçam as duas threads na saída, mas executadas ao mesmo tempo
		//para melhorar, em "MinhaThread" colocaremos o atributo "tempo" e também no construtor
		MinhaThread thread2	= new MinhaThread("Thread #2", 900);
		
		MinhaThread thread3	= new MinhaThread("Thread #3", 500);
		
		//ESTAMOS EXECUTANDO TRES TAREFAS AO MESMO TEMPO NO NOSSO PROGRAMA
		//E CADA UMA TEM SEU PROPRIO PASSO
		
	}
	

}
