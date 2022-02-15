package aula55enumeradoresEnumMetodosValueEValueOf;

import aula54enumeradoresEnumComoClasse.DiaSemana;

public class TesteEnum {

	public static void main(String[] args) {
		
		//importando o Enum a aula 54
		DiaSemana[] dias = DiaSemana.values();//método values retorna um array com TODOS os valores que estão no enumerador
											  //com isso, é possível iterar
		
		for(int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);//teremos a saída de TODOS dos dias da semana estipulados no Enum
		}
		
		//também podemos fazer o forEach
		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println(dia);
		}

	}

}
