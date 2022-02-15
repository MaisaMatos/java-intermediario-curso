package aula62varargs;

public class ExemploVarargs {
	
	//o recurso Varargs permite que se passe infinitos par�metros para um m�todo, sem ter que declarar todos eles

	public static void main(String[] args) {
		
		System.out.println(soma(1, 2)); //ao chamar o m�todo 1 aqui, veja que ele s� aceita 2 parametros
		
		//para inserir mais par�metros, � preciso declarar
		
		System.out.println(soma(1, 2, 3)); //metodo 2
		
		int[] vetor = {1, 2, 3, 4, 5};//declarando um vetor de n numeros
		
		System.out.println(soma(vetor));//somente atrav�s de um vetor podemos passar v�rios par�metros
		
		//MAS ISSO TUDO FOI ANTES DO VARARGS, QUE VEIO A PARTIR DO JAVA5
		//ELE PODE SER USADO QUANDO N�O SABEMOS QUANTOS PARAMETROS SER�O PASSADOS
		//O VARARGS PERMITE QUE AO INV�S DE PRIMEIRO CRIAR UM VETOR PARA DEPOIS PASSA-LO PARA O M�TODO,
		//CONSEGUIMOS PASSAR OS N�MEROS DO VETOR DIRETAMENTE PARA O M�TODO
		//VIDE M�TODO USANDO O VARARGS
		
		//ao chamar o metodo com varargs abaixo, ao digitar o nome do m�todo "soma", dar um ctrl+espa�o
		//para abrir as possibilidades e selecione o "Integer...vetor".
		//ap�s, basta digitar quantos par�metros quiser
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

	}
	
	//metodo 1 com 2 parametros
	static int soma(int a, int b) {
		return a + b;
	}
	
	//metodo 2 com 3 parametros
	static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	//para fazer a somatoria de n n�meros, poder�amos declarar um vetor e passar todos os n�meros desejados dentro dele
	static int soma(int[] vetor) {
		
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
	
	//m�todo com varargs
	//o varargs aceita somente parametros que s�o de classes
	//aprendemos em Wrappers que cada tipo primitivo possui o equivalente a um objeto. Ex.: int => Integer
	//para avisar que usaremos infinitos par�metros, usamos os tr�s pontos logo ap�s a declara��o do tipo
	//significa dizer que ser�o v�rios parametros do tipo Integer
	//para acessar todos esses par�metros no Java, tambem fazemos como se fosse um vetor, iterando.
	
	//qual a diferen�a de um par�metro do tipo array (vide m�todo 2) para um do tipo varargs (m�todo 3)?
	//a diferen�a ser� na utiliza��o, vide o sysout
	//importante mencionar que se houver mais parametros al�m do varargs, este deve ser sempre o �ltimo
	
	static int soma(Integer... vetor ) {
		
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
	
	
	
	
		

}
