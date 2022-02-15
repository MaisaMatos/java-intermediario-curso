package aula85_100classesUtilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormatLocale {

	public static void main(String[] args) {
		
		//a classe DateFormat também é abstrata e não conseguimos instanciar diretamente essa classe
		//o bom de trabalhar com essa classe é que já trabalhamos com o Locale da aplicação
		
		//DATEFORMAT MAIS ÚTIL AO TRABALHAR COM LOCALE DA NOSSA APLICAÇAO
		//O SIMPLEDATEFORMAT É QUANDO QUEREMOS ESPECIFICAR O FORMATO DA DATA
		//LOIANE TRABALHA MAIS COM O SIMPLEDATEFORMAT NOS PROJETOS (DD/MM/YYYY)
		
		//os exemplos abaixo são de data para String
		
		//se quiser formatar uma data usando as configurações de onde o programa está sendo executado
		Date hoje = new Date();
		System.out.println(hoje);
		System.out.println(Locale.getDefault());
		
		//como fazer para formatar a data conforme o Locale da aplicação
		//getInstance() vai obter uma instancia do DateFormat com as config de formatação do Locale
		//com o .format() pedimos para formatar a data de hoje
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//se quiser modificar o Locale do servidor ou do computador
		Locale.setDefault(new Locale("en", "US"));

		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);		
		
		//se quisermos só o horario
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formatando só a data
		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formatando dia e hora
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//usando .getTimeInstance() com o parametro "int style"; quando tem "int", podemos usar CONSTANTES
		//SHORT; formato curto da hora	
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);
		
		//é possível misturar tanto o formato da data quanto o da hora
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
		System.out.println(hojeFormatado);
		
		//String para data
		Locale.setDefault(new Locale("pt", "BR"));
		
		String data = "12/02/2017 14:25";
		try {
			Date dataDate = DateFormat.getInstance().parse(data);
			System.out.println(dataDate);
			
			//transformando o obj tipo Date em tipo Calendar
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(dataDate);
			System.out.println(calendario);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
