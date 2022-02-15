package aula55enumeradoresEnumMetodosValueEValueOf;

import aula54enumeradoresEnumComoClasse.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		//importando o Enum a aula 54
		DiaSemana[] dias = DiaSemana.values();//m�todo values retorna um array com TODOS os valores que est�o no enumerador
											  //com isso, � poss�vel iterar
		
		for(int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);//teremos a sa�da de TODOS dos dias da semana estipulados no Enum
		}
		
		//tamb�m podemos fazer o forEach
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}

	}

}
