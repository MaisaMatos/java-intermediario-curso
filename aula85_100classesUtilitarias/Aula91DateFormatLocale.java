package aula85_100classesUtilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormatLocale {

	public static void main(String[] args) {
		
		//a classe DateFormat tamb�m � abstrata e n�o conseguimos instanciar diretamente essa classe
		//o bom de trabalhar com essa classe � que j� trabalhamos com o Locale da aplica��o
		
		//DATEFORMAT MAIS �TIL AO TRABALHAR COM LOCALE DA NOSSA APLICA�AO
		//O SIMPLEDATEFORMAT � QUANDO QUEREMOS ESPECIFICAR O FORMATO DA DATA
		//LOIANE TRABALHA MAIS COM O SIMPLEDATEFORMAT NOS PROJETOS (DD/MM/YYYY)
		
		//os exemplos abaixo s�o de data para String
		
		//se quiser formatar uma data usando as configura��es de onde o programa est� sendo executado
		Date hoje = new Date();
		System.out.println(hoje);
		System.out.println(Locale.getDefault());
		
		//como fazer para formatar a data conforme o Locale da aplica��o
		//getInstance() vai obter uma instancia do DateFormat com as config de formata��o do Locale
		//com o .format() pedimos para formatar a data de hoje
		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//se quiser modificar o Locale do servidor ou do computador
		Locale.setDefault(new Locale("en", "US"));

		hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);		
		
		//se quisermos s� o horario
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		//formatando s� a data
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
		
		//� poss�vel misturar tanto o formato da data quanto o da hora
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
