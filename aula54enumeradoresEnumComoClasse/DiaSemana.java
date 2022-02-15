package aula54enumeradoresEnumComoClasse;

//queremos ter um enumerador que se pare�a bastante com Constantes
//tipo as da aula 53, quanto a constante SEGUNDA tem o valor 1

public enum DiaSemana {
	
	//os parenteses e numeros dentro deles s�o os construtores dos Enum
	SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
	
	private int valor; //atributo
	
	//para o Enum, n�o usaremos nenhum modificador de acesso
	
	DiaSemana(int valor){//construtor
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	
}
