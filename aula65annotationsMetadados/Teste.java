package aula65annotationsMetadados;

//para usar a anotação, apertar @ e cntrl+espaço e selecionar a anotação desejada
//o compilador vai dar erro pq temos informações a serem passadas para a anotação

@InformacaoAula(
	autor = "Loiane",
	aulaNumero = 65,
	blog = "loiane.com"//sobrescrevendo o valor default		
)

//podemos definir aonde a anotação será usada: se numa classe, num método ou num atributo
//vamos inserir no método main

public class Teste {
	
	@InformacaoAula(
			autor = "Loiane",
			aulaNumero = 65,
			blog = "loiane.com"//sobrescrevendo o valor default		
		)


	public static void main(String[] args) {
		
		
		

	}

}
