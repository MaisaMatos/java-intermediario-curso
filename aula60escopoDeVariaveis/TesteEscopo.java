package aula60escopoDeVariaveis;

public class TesteEscopo {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		
		escopo.setValor(10); //settamos 10
		
		System.out.println(escopo.getValor()); //output  é 10, é o atributo
		
		System.out.println(escopo.calculaValor(20));//output é 30
		//Porque? Ao declarar um parâmetro, é criada uma variável local no Java com o mesmo nome
		//ao fazer qualquer referência a essa variável dentro do método, a referência é ao parâmetro, e não ao atributo
		//veja no próprio método que "valor" do parâmetro tem uma cor diferente do "valor" do atributo
		//neste caso, o atributo "valor" não está sendo modificado pelo método
		//para que isso ocorresse, seria preciso fazer o "this.valor = valor";		
		
		System.out.println(escopo.getValor());//output é 10, é o atributo, não é modificado pelo método
		
		System.out.println(escopo.teste()); //output é 4
		
		System.out.println(escopo.getValor());//output é 10, só mudaria com o "this.valor"
		
		System.out.println();
		
		System.out.println(escopo.outroTeste());
		
		System.out.println();
		
		escopo.maisUmTeste();

	}
}
