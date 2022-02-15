package aula85_100classesUtilitarias;

import java.util.Date;
//usada, por exemplo, na integra��o do Java com Banco de Dados, e temos uma classe que representar� uma tabela,
//se a coluna do BD for do tipo Data, declararemos tamb�m o atributo com tipo Data 
//isso trabalhando com JDBC, JPA, Hybernate, etc

public class Aula86Date {

	public static void main(String[] args) {
		
		//data de hoje e hor�rio de agora
		Date hoje = new Date();
		System.out.println(hoje); //sai data atual e hor�rio
		
		//traz os milissegundos desde 1970
		//ele pode ser util em projetos, ao utilizar Banco de Jados e JPA
		System.out.println("Milissegundos desde 1 Jan 1970: " + hoje.getTime());
		
		//obtendo o dia do m�s
		System.out.println(hoje.getDate());//sa�da dia 24

	}

}
