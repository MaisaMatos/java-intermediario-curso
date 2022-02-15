package aula85_100classesUtilitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {
		
		
		//o programa pode estar sendo executado de um outro país e precisa-se saber a que horas um determinado
		//registro foi modificado, daí é a hora daquele país que vai para o BD. Ao mesmo tempo, o programa está
		//sendo usado no BR, e vai o horário do BR para o BD.
		//Aprenderemos a padronizar isso para não ficar aquela bagunça na base de dados
		
		Calendar calendar = Calendar.getInstance();
		//para saber qual o fuso horario usado por essa data
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);
		System.out.println(tz.getDisplayName());
		System.out.println(tz.getID());
		
		/*
		//para saber os TimeZones disponíveis
		String[] fusos = TimeZone.getAvailableIDs();
		for(String fuso : fusos) {
			System.out.println(fuso);
		}
		*/ 
		
		
		//para trabalhar com fuso horário diferente daquele de onde o programa está sendo executado ou
		//configurar um fuso horário padrão
		TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
		System.out.println(tzNY.getDisplayName());
		System.out.println(tzNY.getID());
		
		//também podemos usar o TimeZone para converter datas e salvar
		//pegar o horário que eu estou agora e converter e salvar em algum lugar como se fosse o horário do Brasil
		Calendar agora = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
		System.out.println(sdf.format(agora.getTime()));
		
		Calendar agoraNY = Calendar.getInstance(tzNY);
		System.out.println(agoraNY.getTimeZone());
		System.out.println(sdf.format(agoraNY.getTime()));
		
		//É possível ver que as saídas de horas dos dois códigos acima são iguais. A diferença está na hora do dia
		//para a qual temos que usar o "offset"
		//mas o fuso de NY não saiu correto aqui :(
		agoraNY.add(Calendar.HOUR_OF_DAY, tzNY.getOffset(System.currentTimeMillis())/1000/60/60);
		System.out.println(sdf.format(agoraNY.getTime()));
		
		
		
		
		
	}

}
