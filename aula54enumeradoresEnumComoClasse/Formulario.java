package aula54enumeradoresEnumComoClasse;

public class Formulario {
	
	//dependendo do projeto, declaramos o Enum como uma classe separada (vide Dia da Semana)
	//ou, se for algo muito específico para uma determinada classe e não se fará o reuso para outras classes,
	//pode-se declarar o Enum dentro de uma classe e fazer seu uso ali mesmo.
	
	enum Genero{
		FEMININO('F'), MASCULINO('M');
		
		private char valor;
		
		Genero(char valor){
			this.valor = valor;
		}
	}
	
	private String nome;
	private String genero;
	
	

}
