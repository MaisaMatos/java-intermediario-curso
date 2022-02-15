package aula64classesAninhadasInternasLocaisEAnonimas;

//classe Anonima � quando instanciamos a classe e mudamos seu comportamento ao instanciar


public class Anonima {
	
	public void imprimeTexto(){		
		System.out.println("qualquer texto");		
	}
	
	public static void main(String[] args) {
		
		//notar que aqui, ao chamar o construtor, ao inv� do ponto e v�rgula estamos abrind chaves, 
		//estamos adicionando um corpo para a classe
		//com isso, podemos sobrescrever comportamentos da classe e assim, em tempo de execu��o,
		//configurar esse novo comportamento.
		//al�m disso, classes an�nimas podem implementar interfaces
		
		Anonima anonima = new Anonima() {
			public void imprimeTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}			
		};
		
		anonima.imprimeTexto();
		
		//usando Interface
		//ao declarar e instanciar a Interface, obrigatoriamente temos que implementar seus m�todos
		//ent�o, � poss�vel instanciar uma Interface, por�m como classe an�nima
		//esse � um tipo de classe an�nima que estamos passando em tempo de instancia��o
		Texto texto = new Texto() {

			@Override
			public void imprimeTexto() {
				System.out.println("qualquer texto - interface");				
			}			
		};
		
		//ao chamar o m�todo, ele imprimir� o que foi definido no m�todo da interface que foi sobrescrito
		texto.imprimeTexto();
	}
}
