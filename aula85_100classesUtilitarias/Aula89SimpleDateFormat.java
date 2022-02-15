package aula85_100classesUtilitarias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) {
		
		//vimos na aula 87 como imprimir datas com o "printf", agora veremos um metodo mais elegante
		
		
		//usar a documentaçaõ Java para verificar os símbolos necessários
		//a principio, queremos apenas pegar o ano da data
		SimpleDateFormat sdf = new SimpleDateFormat("y");	
		
		//se quiser a data de hoje = Calendar.getIntance()
		//se quiser uma data específica = new GregorianCalendar()
		Calendar data = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		
		//para sair a data formatada
		//sdf.format(data): veja que o parametro que ela recebe é um obj tipo Date, mas queremos Calendar
		//sdf.format(data.getTime()): para obter a data do Calendar
		//o getTime() retorna uma instancia da classe Date
		System.out.println(sdf.format(data.getTime())); //saiu o ano 2010
		
		//voltando na documentação, vamos complementar a data
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");//com duas casas
		
		Calendar data1 = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		
		System.out.println(sdf1.format(data1.getTime()));
		
		
		//voltando na documentação
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MMM/yyyy");//com 3 Ms, sai as 3 primeiras letras do mes
				
		Calendar data2 = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
				
		System.out.println(sdf2.format(data2.getTime()));
		
		
		//voltando na documentação, vamos complementar a data agora com a hora
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
				
		Calendar data4 = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
				
		System.out.println(sdf4.format(data4.getTime()));
		
		
		//se quiser trabalhar com a classe Date neste caso, também pode
		Date hoje = new Date();
		System.out.println(sdf4.format(hoje));
		
		//se vc tiver um caso que for pra formatar somente o horario atual da data de hoje, tanto faz 
		//usar o 'Calendar data' (obtendo o getInstance()) ou então apenas fazendo um 'Date hoje = new Date()'
		
		
		
		//suponha que no lugar de guardar uma informação ou objeto do tipo data, você tenha uma String
		//e seja preciso passar essa String para data
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "20/02/2000";
		
		//ao incluir o metodo 'parse', o compilador reclama porque ele pode lançar uma exceçao, usar try-catch
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			System.out.println(minhaDataEmDate);
			System.out.println(sdf4.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
