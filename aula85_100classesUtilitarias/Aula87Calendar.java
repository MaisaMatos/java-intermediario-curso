package aula85_100classesUtilitarias;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		//ao contr�rio da classe Date, n�o instanciamos a classe Calendar
		//� porque j� existe um calend�rio instanciado no Java, ent�o chamamos o m�todo 'getInstance'
		//ele j� vai retornar um 'new Calendar'
		//esse padr�o de j� retornar uma instancia e n�o deixar o usu�rio instanciar o objeto � um padr�o de projeto SINGLETON
		Calendar hoje = Calendar.getInstance();
		
		System.out.println(hoje); //a sa�da ser� um toString, bem esquisito
		
		//o Calendar trabalha com CONSTANTES
		//para sair a data de hoje
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		
		int mes = hoje.get(Calendar.MONTH);
		System.out.println(mes);//os meses no Java come�am no 0 - Janeiro � o mes 0, fevefeiro � o mes 1...
		System.out.println(Calendar.NOVEMBER);//sa�da 10, � outra forma de pegar o mes
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		
		int min = hoje.get(Calendar.MINUTE);
		System.out.println(min);
		
		int seg = hoje.get(Calendar.SECOND);
		System.out.println(seg);
		
		//a sa�da formatada da data ser� feira atrav�s do 'system.out.printf'
		//vide aula 63 para relembrar os c�digos de formata��o
		System.out.printf("Hoje �: %02d/%02d/%d %02d:%02d:%02d ", dia, (mes+1), ano, hora, min, seg);
		
		System.out.println();
		
		//adicionando dias ao calend�rio atual para ver quando ser� a data
		//primeiro parametro � o que se quer mudar, segundo parametro � a qtde adicionada
		hoje.add(Calendar.DAY_OF_MONTH, 4);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		System.out.println();
		
		//excluindo dias ao calend�rio atual para ver quando ser� a data
		//primeiro parametro � o que se quer mudar, segundo parametro � a qtde a excluir
		hoje.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}

}
