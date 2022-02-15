package aula85_100classesUtilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {
	
	//A classe Calendar � uma instancia da classe GregorianCalendar
	//A classe Calendar em si � uma classe abstrata e a classe GregorianCalendar � uma subclasse da classe Calendar
	//Ao fazer um 'Calendar.getInstance()', na verdade o Java est� fazendo uma instancia da classe GregorianCalendar
	//A GregorianCalendar tamb�m pertende ao 'java.util', ela n�o � uma classe abstrata e e tamb�m n�o utiliza
	//o padr�o de projeto 'singleton' (ao contrario da classe Calendar), ela permite a instancia de classe

	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		//System.out.println(hoje);//toString similar ao da classe Calendar
		
		imprimirData(hoje);
		
		//nos projetos, vemos mais o uso da classe Calendar do que da GregCalendar
		//existe uma diferen�a entre as duas.
		//o m�todo "isLeepYear()" � para ver se o ano � bissexto ou n�o.
		//ao chamar o "hoje1." (classe Calendar), esse metodo n�o aparece, mas aparece ao chamar "hoje." (instancia de Greg)
		//ent�o, se no projeto precisarmos saber se um ano � bissexto, usar uma instancia da GregCal	
		
		System.out.println(hoje.isLeapYear(2021));//sa�da false, n�o � bissexto
		
		
		GregorianCalendar hoje2 = new GregorianCalendar(2017, 0, 1);
		imprimirData(hoje2);//sa�da 01/01/2017
		
		GregorianCalendar hoje3 = new GregorianCalendar(2017, 0, 1, 14, 30, 23);
		imprimirData(hoje3); //sa�da 01/01/2017 14:30:23
		
		
	}
	
	
	
	//no param estamos recebendo Calendar, mas na verdade estamos passando uma instancia do GregCalendar (hoje)
	//como a GregorianCalendar estende a Calendar, podemos usar o polimorfismo e passar o GregCale como parametro
	private static void imprimirData(Calendar hoje) {
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int min = hoje.get(Calendar.MINUTE);
		int seg = hoje.get(Calendar.SECOND);
		
		System.out.printf("Hoje �: %02d/%02d/%d %02d:%02d:%02d ", dia, (mes+1), ano, hora, min, seg);
		
		System.out.println();
	}

}
