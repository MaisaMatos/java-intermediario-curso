package aula65annotationsMetadados;

//para usar a anota��o, apertar @ e cntrl+espa�o e selecionar a anota��o desejada
//o compilador vai dar erro pq temos informa��es a serem passadas para a anota��o

@InformacaoAula(
	autor = "Loiane",
	aulaNumero = 65,
	blog = "loiane.com"//sobrescrevendo o valor default		
)

//podemos definir aonde a anota��o ser� usada: se numa classe, num m�todo ou num atributo
//vamos inserir no m�todo main

public class Teste {
	
	@InformacaoAula(
			autor = "Loiane",
			aulaNumero = 65,
			blog = "loiane.com"//sobrescrevendo o valor default		
		)


	public static void main(String[] args) {
		
		
		

	}

}
