package aula71threadsMetodosEBlocosSincronizados;

public class MinhaThreadSoma implements Runnable {
	
	private String nome;
	private int[] nums;
	//esta é uma instancia estática para a classe soma; ou seja, todas as instancias da classe "MinhaThreadSoma" irão
	//compartilhar a Calculadora, que se torna então um recurso compartilhado
	private static Calculadora calc = new Calculadora();

	
	public MinhaThreadSoma(String nome, int[] nums) {
		this.nome = nome;
		this.nums = nums;
		new Thread(this, nome).start(); //isso é a mesma coisa que fazer o código abaixo
		
		//Thread t = new Thread(this, nome);
		//t.start();
	}

	//a tarefa da thread é muito simples, vide abaixo
	@Override
	public void run() {
		
		//para sabermos quando chamou a thread, aí vão alguns system.out
		
		System.out.println(this.nome + " iniciada ");
		
		int soma = calc.somaArray(this.nums);
		
		System.out.println("Resultado da soma para a thread " + this.nome + " é: " + soma);
		
		System.out.println(this.nome + " terminada ");
		
	}
}
