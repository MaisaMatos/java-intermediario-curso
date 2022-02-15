package aula62varargs;

public class ExemploVarargs {
	
	//o recurso Varargs permite que se passe infinitos parâmetros para um método, sem ter que declarar todos eles

	public static void main(String[] args) {
		
		System.out.println(soma(1, 2)); //ao chamar o método 1 aqui, veja que ele só aceita 2 parametros
		
		//para inserir mais parâmetros, é preciso declarar
		
		System.out.println(soma(1, 2, 3)); //metodo 2
		
		int[] vetor = {1, 2, 3, 4, 5};//declarando um vetor de n numeros
		
		System.out.println(soma(vetor));//somente através de um vetor podemos passar vários parâmetros
		
		//MAS ISSO TUDO FOI ANTES DO VARARGS, QUE VEIO A PARTIR DO JAVA5
		//ELE PODE SER USADO QUANDO NÃO SABEMOS QUANTOS PARAMETROS SERÃO PASSADOS
		//O VARARGS PERMITE QUE AO INVÉS DE PRIMEIRO CRIAR UM VETOR PARA DEPOIS PASSA-LO PARA O MÉTODO,
		//CONSEGUIMOS PASSAR OS NÚMEROS DO VETOR DIRETAMENTE PARA O MÉTODO
		//VIDE MÉTODO USANDO O VARARGS
		
		//ao chamar o metodo com varargs abaixo, ao digitar o nome do método "soma", dar um ctrl+espaço
		//para abrir as possibilidades e selecione o "Integer...vetor".
		//após, basta digitar quantos parâmetros quiser
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
	
	//para fazer a somatoria de n números, poderíamos declarar um vetor e passar todos os números desejados dentro dele
	static int soma(int[] vetor) {
		
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
	
	//método com varargs
	//o varargs aceita somente parametros que são de classes
	//aprendemos em Wrappers que cada tipo primitivo possui o equivalente a um objeto. Ex.: int => Integer
	//para avisar que usaremos infinitos parâmetros, usamos os três pontos logo após a declaração do tipo
	//significa dizer que serão vários parametros do tipo Integer
	//para acessar todos esses parâmetros no Java, tambem fazemos como se fosse um vetor, iterando.
	
	//qual a diferença de um parâmetro do tipo array (vide método 2) para um do tipo varargs (método 3)?
	//a diferença será na utilização, vide o sysout
	//importante mencionar que se houver mais parametros além do varargs, este deve ser sempre o último
	
	static int soma(Integer... vetor ) {
		
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
	}
	
	
	
	
		

}
