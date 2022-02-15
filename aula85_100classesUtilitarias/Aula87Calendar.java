package aula85_100classesUtilitarias;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		//ao contrário da classe Date, não instanciamos a classe Calendar
		//é porque já existe um calendário instanciado no Java, então chamamos o método 'getInstance'
		//ele já vai retornar um 'new Calendar'
		//esse padrão de já retornar uma instancia e não deixar o usuário instanciar o objeto é um padrão de projeto SINGLETON
		Calendar hoje = Calendar.getInstance();
		
		System.out.println(hoje); //a saída será um toString, bem esquisito
		
		//o Calendar trabalha com CONSTANTES
		//para sair a data de hoje
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		
		int mes = hoje.get(Calendar.MONTH);
		System.out.println(mes);//os meses no Java começam no 0 - Janeiro é o mes 0, fevefeiro é o mes 1...
		System.out.println(Calendar.NOVEMBER);//saída 10, é outra forma de pegar o mes
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println(dia);
		
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		
		int min = hoje.get(Calendar.MINUTE);
		System.out.println(min);
		
		int seg = hoje.get(Calendar.SECOND);
		System.out.println(seg);
		
		//a saída formatada da data será feira através do 'system.out.printf'
		//vide aula 63 para relembrar os códigos de formatação
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d ", dia, (mes+1), ano, hora, min, seg);
		
		System.out.println();
		
		//adicionando dias ao calendário atual para ver quando será a data
		//primeiro parametro é o que se quer mudar, segundo parametro é a qtde adicionada
		hoje.add(Calendar.DAY_OF_MONTH, 4);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		
		System.out.println();
		
		//excluindo dias ao calendário atual para ver quando será a data
		//primeiro parametro é o que se quer mudar, segundo parametro é a qtde a excluir
		hoje.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
	}

}
