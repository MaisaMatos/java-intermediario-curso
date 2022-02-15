package aula56enumeradoresEnumMetodosExercicioCalculadora;

public class CalculadoraLoiane {
	
	//observar que Loiane fez tudo em uma classe só. Na mesma classe da Calculadora ela criou o Enum e o Main
	
	enum Operacao{
		
		SOMAR("+") {
			@Override
			public double executarOperacao(double x, double y) {
				return x + y;
			}
		}, 
		
		SUBTRAIR("-") {
			@Override
			public double executarOperacao(double x, double y) {
				return x - y;
			}
		}, 
		
		MULTIPLICAR("*") {
			@Override
			public double executarOperacao(double x, double y) {
				return x * y;
			}
		},
		
		DIVIDIR("/") {
			@Override
			public double executarOperacao(double x, double y) {
				return x / y;
			}
		};
		
		private String simbolo;
		
		//construtor
		Operacao(String simbolo){
			this.simbolo = simbolo;
		}
		
		//toString
		public String toString() {
			return this.simbolo;
		}
		
		//metodo abstrato
		public abstract double executarOperacao(double x, double y);
		
	}
	
	public static void main(String[] args) {
		
		double x = 15;
		double y = 3;
		
		for(Operacao op : Operacao.values()) {
			System.out.println(x + " ");
			System.out.println(op.toString() + " ");
			System.out.println(y + " ");
			System.out.println(op.executarOperacao(x, y));
			System.out.println();
		}
		
	}

}
