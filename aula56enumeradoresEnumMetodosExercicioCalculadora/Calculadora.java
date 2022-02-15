package aula56enumeradoresEnumMetodosExercicioCalculadora;

public class Calculadora {
	
	private Operacoes operacoes;
	private double calculo;
	
	
	public Calculadora() {
		super();
	}

	public Calculadora(Operacoes operacoes, double calculo) {
		super();
		this.operacoes = operacoes;
		this.calculo = calculo;
	}

	public Operacoes getOperacoes() {
		return operacoes;
	}

	public void setOperacoes(Operacoes operacoes) {
		this.operacoes = operacoes;
	}

	public double getCalculo() {
		return calculo;
	}

	public void setCalculo(double calculo) {
		this.calculo = calculo;
	}

	@Override
	public String toString() {
		return "Calculadora [operacoes=" + operacoes + ", calculo=" + calculo + "]";
	}
	
	
	
	

}
