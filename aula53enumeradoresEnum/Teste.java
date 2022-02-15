package aula53enumeradoresEnum;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();

	}
	
	//PARA COMPARAR, ABAIXO USAREMOS CONSTANTES E ENUM
	//a vantagem de usar o Enum � principalmente ao declarar atributos na classe
	//ex.: ao declarar uma classe que tem um atributo "diaDaSemana", � mais elegante declarar um atributo "diaDaSemana"
	//com isso, temos o controle de que o valor que se pode atribuir para a vari�vel do tipo da semana (seguda, por ex)
	//� somente um dos 7 valores que foram declarados no Enum
	//Ao contr�rio de criar constantes a nivel de leitura do c�digo que, neste caso como o atributo � do tipo int, 
	//n�o temos a garantia e nem o controle de que n�o vou colocar outro n�mero que n�o o do intervalo de 1 a 7,
	//visto que seria poss�vel atribuir, numa constante, o n�mero 10 � segunda-feira.
	
	//CONSTANTES
	private static void usandoConstantes() {
		
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java.");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
		
	}
	
	
	private static void imprimeDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Ter�a-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;	
		}
	}
	
	//ENUM
	
	
	private static void usandoEnum() {
		
		//para usar o Enum, declaramos o tipo do Enum, que � o seu nome (tipo nome da classe)
		//no caso, � "DiaSemana"
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quarta = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando Enum no Java.");
		imprimeDiaSemana(segunda);
		imprimeDiaSemana(terca);
		imprimeDiaSemana(quarta);
		imprimeDiaSemana(quinta);
		imprimeDiaSemana(sexta);
		imprimeDiaSemana(sabado);
		imprimeDiaSemana(domingo);
	}
	
	
	private static void imprimeDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Ter�a-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;	
		}
	}
	

	
}
