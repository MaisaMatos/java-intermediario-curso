package aula71threadsMetodosEBlocosSincronizados;

public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] nums;
	//esta � uma instancia est�tica para a classe soma; ou seja, todas as instancias da classe "MinhaThreadSoma" ir�o
	//compartilhar a Calculadora, que se torna ent�o um recurso compartilhado
	private static Calculadora calc = new Calculadora();

	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start(); //isso � a mesma coisa que fazer o c�digo abaixo
		
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	//a tarefa da thread � muito simples, vide abaixo
	@Override
	public void run() {
		
		//para sabermos quando chamou a thread, a� v�o alguns system.out
		
		System.out.println(this.nome + " iniciada ");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para a thread " + this.nome + " �: " + soma);
		
		System.out.println(this.nome + " terminada ");
		
	}
}
