package aula85_100classesUtilitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		
		
		//o programa pode estar sendo executado de um outro pa�s e precisa-se saber a que horas um determinado
		//registro foi modificado, da� � a hora daquele pa�s que vai para o BD. Ao mesmo tempo, o programa est�
		//sendo usado no BR, e vai o hor�rio do BR para o BD.
		//Aprenderemos a padronizar isso para n�o ficar aquela bagun�a na base de dados
		
		Calendar calendar = Calendar.getInstance();
		//para saber qual o fuso horario usado por essa data
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
		
		/*
		//para saber os TimeZones dispon�veis
		String[] fusos = TimeZone.getAvailableIDs();
		for(String fuso : fusos) {
			System.out.println(fuso);
		}
		*/ 
		
		
		//para trabalhar com fuso hor�rio diferente daquele de onde o programa est� sendo executado ou
		//configurar um fuso hor�rio padr�o
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		System.out.println(tzNY.getDisplayName());
		System.out.println(tzNY.getID());
		
		//tamb�m podemos usar o TimeZone para converter datas e salvar
		//pegar o hor�rio que eu estou agora e converter e salvar em algum lugar como se fosse o hor�rio do Brasil
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraNY = Calendar.getInstance(tzNY);
		System.out.println(agoraNY.getTimeZone());
		System.out.println(sdf.format(agoraNY.getTime()));
		
		//� poss�vel ver que as sa�das de horas dos dois c�digos acima s�o iguais. A diferen�a est� na hora do dia
		//para a qual temos que usar o "offset"
		//mas o fuso de NY n�o saiu correto aqui :(
		agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset(System.currentTimeMillis())/1000/60/60);
		System.out.println(sdf.format(agoraNY.getTime()));
		
		
		
		
		
	}

}
