package aula85_100classesUtilitarias;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasAPartirJava8 {

	public static void main(String[] args) {
		
		//� poss�vel trabalhar com objetos separadamente para Horas, Data e Horas + Data
		//esta API foi baseada na biblioteca "Joda-Time"
		
		//data (dd/MM/yyyy) = LOCALDATE
		//a sa�da ser� o padr�o ISO: yyyy-mm-dd
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		//usando o c�digo abaixo para colocar no formato ISO data em formato String
		System.out.println(LocalDate.of(2021, 11, 29));
		
		//outra forma de fazer isso, desde que a String esteja nesse mesmo formato, conseguimos parsear
		System.out.println(LocalDate.parse("2021-11-29"));
		
		//� facil adicionar ou diminuir dias com o LocalDate
		//com o ".plus" � poss�vel adicionar ano, meses, dias, semanas
		System.out.println(agora.plusDays(30));
		
		//voltando no tempo
		//com o ".minus" � poss�vel voltar ano, meses, dias, semanas
		//com outra forma diferente da mostrada no ".plus", quero diminuir 1 mes e vou usar o Enum "ChronoUnit"
		System.out.println(agora.minus(1, ChronoUnit.MONTHS));
		
		//qual dia da semana � hoje
		System.out.println(agora.getDayOfWeek());
		System.out.println(agora.getDayOfYear());
		
		//� ano bissexto ou n�o
		System.out.println(agora.isLeapYear());
		System.out.println(LocalDate.parse("2020-02-01").isLeapYear());
		
		//*****************************************************************************************************
		
		//s� hor�rio = LOCALTIME
		//padr�o ISO � "militar", n�o � AM ou PM
		LocalTime hAgora = LocalTime.now();
		System.out.println(hAgora);
		
		//configurando para sair s� hora e minuto
		System.out.println(LocalTime.of(15, 35));
		
		//conseguimos fazer o "parse", desde que o hor�rio tamb�m esteja em formato ISO
		System.out.println(LocalTime.parse("15:35"));
		
		//� poss�vel adicionar horas, minutos e segundos com o ".plus"
		System.out.println(hAgora.plusMinutes(60));
		System.out.println(hAgora.minus(40, ChronoUnit.MINUTES));
		
		//pegando apenas a hora, ou o minuto, ou o segundo
		System.out.println(hAgora.getHour());
		
		//****************************************************************************************************
		
		//data completa = data e hora = LOCALDATETIME
		//no formato ISO h� um T para separar a data da hora
		LocalDateTime agoraCompleto = LocalDateTime.now();
		System.out.println(agoraCompleto);
		
		//inserindo uma data 
		System.out.println(LocalDateTime.of(2021, 11, 30, 15, 45));
		
		//parse, passando uma string no padr�o ISO
		System.out.println(LocalDateTime.parse("2019-02-16T20:25:10"));
		
		
		//adicionando anos � data completa
		System.out.println(agoraCompleto.plusYears(20));
		
		
		//****************************************************************************************************
		
		//classe para tragalhar com o LocalDateTime a partir do Java8
		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		/*
		//tamb�m � poss�vel obter todas as zonas hor�rias
		Set<String> fusos = ZoneId.getAvailableZoneIds();//retorna um set de strings
		for(String f : fusos) {
			System.out.println(f);
		}
		*/
		
		ZoneId ny = ZoneId.of("America/New_York");
		ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.parse("2019-02-16T20:25:10"), ny);
		System.out.println(zdt);
		System.out.println(ZonedDateTime.parse("2019-02-16T20:25:10-05:00[America/New_York]"));
		
		//trabalhando com offset
		ZoneOffset	offset = ZoneOffset.of("+02:00");
		
		//aplicando a diferen�a de fuso hor�rios
		OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
		System.out.println(offsetdt);
		
		//***************************************************************************************
		
		//fazendo a convers�o de um objeto Calendar para esta API mais recente
		Date date = new Date();
		Calendar c = Calendar.getInstance();
		LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(), ny);
		System.out.println(ldtDate);
		System.out.println(LocalDateTime.ofInstant(c.toInstant(), ny));
		
	}

}
