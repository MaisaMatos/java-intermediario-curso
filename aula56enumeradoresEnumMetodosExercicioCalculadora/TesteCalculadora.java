package aula56enumeradoresEnumMetodosExercicioCalculadora;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		for(Operacoes oper : Operacoes.values()) {
			System.out.println(oper + " - " + oper.executarOperacao(15, 3));
		}

	}

}
