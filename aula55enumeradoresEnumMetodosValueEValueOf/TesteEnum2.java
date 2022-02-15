package aula55enumeradoresEnumMetodosValueEValueOf;

import aula53enumeradoresEnum.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {
		
		//utilizado Enum da aula 53
		//DiaSemana dia;
		
		//pode ser que ao gravar no banco de dados, queiramos gravar o pr�prio valor do Enum (segunda, terca, quarta...)
		//faremos isso conforme segue:
		
		//metodo valueOf: consigo obter o valor de um Enum atrav�s de uma String
		System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO")); //output: "DOMINGO"
		
		//consigo instanciar o Enum e j� atribui-lo ao metodo
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
		
		//se vc n�o souber, mas vc tiver um valor numa String, vc pode avaliar o valor dessa String transformando-a 
		//numa propria instancia de um enumerador.
		
		System.out.println(dia);
		

	}

}
