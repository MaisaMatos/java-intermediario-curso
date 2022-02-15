package aula75_84string;

public class Aula82Pessoa {
	
	private int cod;
	private String nome;
	private int idade;
	
		
	public Aula82Pessoa() {
		super();
	
	}

	public Aula82Pessoa(int cod, String nome, int idade) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aula82Pessoa [cod=" + cod + ", nome=" + nome + ", idade=" + idade + "]";
	}
	
	

}
