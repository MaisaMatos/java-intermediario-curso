package aula64classesAninhadasInternasLocaisEAnonimas;

//classe Anonima é quando instanciamos a classe e mudamos seu comportamento ao instanciar


public class Anonima {
	
	public void imprimeTexto(){		
		System.out.println("qualquer texto");		
	}
	
	public static void main(String[] args) {
		
		//notar que aqui, ao chamar o construtor, ao invé do ponto e vírgula estamos abrind chaves, 
		//estamos adicionando um corpo para a classe
		//com isso, podemos sobrescrever comportamentos da classe e assim, em tempo de execução,
		//configurar esse novo comportamento.
		//além disso, classes anônimas podem implementar interfaces
		
		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}			
		};
		
		anonima.imprimeTexto();
		
		//usando Interface
		//ao declarar e instanciar a Interface, obrigatoriamente temos que implementar seus métodos
		//então, é possível instanciar uma Interface, porém como classe anônima
		//esse é um tipo de classe anônima que estamos passando em tempo de instanciação
		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");				
			}			
		};
		
		//ao chamar o método, ele imprimirá o que foi definido no método da interface que foi sobrescrito
		texto.imprimeTexto();
	}
}
