package aula60escopoDeVariaveis;

public class TesteEscopo {

	public static void main(String[] args) {
		
		EscopoVariaveis escopo = new EscopoVariaveis();
		
		escopo.setValor(10); //settamos 10
		
		System.out.println(escopo.getValor()); //output  � 10, � o atributo
		
		System.out.println(escopo.calculaValor(20));//output � 30
		//Porque? Ao declarar um par�metro, � criada uma vari�vel local no Java com o mesmo nome
		//ao fazer qualquer refer�ncia a essa vari�vel dentro do m�todo, a refer�ncia � ao par�metro, e n�o ao atributo
		//veja no pr�prio m�todo que "valor" do par�metro tem uma cor diferente do "valor" do atributo
		//neste caso, o atributo "valor" n�o est� sendo modificado pelo m�todo
		//para que isso ocorresse, seria preciso fazer o "this.valor = valor";		
		
		System.out.println(escopo.getValor());//output � 10, � o atributo, n�o � modificado pelo m�todo
		
		System.out.println(escopo.teste()); //output � 4
		
		System.out.println(escopo.getValor());//output � 10, s� mudaria com o "this.valor"
		
		System.out.println();
		
		System.out.println(escopo.outroTeste());
		
		System.out.println();
		
		escopo.maisUmTeste();

	}
}
