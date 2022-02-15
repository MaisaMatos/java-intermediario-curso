package aula85_100classesUtilitarias;

import java.util.Date;
//usada, por exemplo, na integração do Java com Banco de Dados, e temos uma classe que representará uma tabela,
//se a coluna do BD for do tipo Data, declararemos também o atributo com tipo Data 
//isso trabalhando com JDBC, JPA, Hybernate, etc

public class Aula86Date {

	public static void main(String[] args) {
		
		//data de hoje e horário de agora
		Date hoje = new Date();
		System.out.println(hoje); //sai data atual e horário
		
		//traz os milissegundos desde 1970
		//ele pode ser util em projetos, ao utilizar Banco de Jados e JPA
		System.out.println("Milissegundos desde 1 Jan 1970: " + hoje.getTime());
		
		//obtendo o dia do mês
		System.out.println(hoje.getDate());//saída dia 24

	}

}
