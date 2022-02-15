package aula85_100classesUtilitarias;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {
	
	//usada qdo precisamos de mais precisão ou mais controle sobre a formatação do numero
	//ela estende a classe NumberFormat (é filha de)
	//utiliza patterns (posit, negat, prefi, sufix, fracion, expoente, etc)
	//utilizamos #, cada um desses definirá um número

	public static void main(String[] args) {
		
		//esta é uma forma
		String padrao = "###,###.##"; //padrão de formatação escolhido
		DecimalFormat df = new DecimalFormat(padrao);
		
		//esta é outra forma, sem passar o "padrão" no construtor
		//df.applyPattern(padrao);
		
		System.out.println(df.format(123456789.123));//executando, foi formatado conforme determinado antes
		
		
		//caso haja problemas com o separador de números (ponto e virgula) por causa do Locale
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("en", "United States"));
		dfs.setDecimalSeparator('.'); //setando o separador de decimais
		dfs.setGroupingSeparator(',');//setando o separador de milhares
		//será preciso instanciar novamente o DecimalFormat
		String padrao2 = "###,###.##";//mantém o separador em Inglês!
		df = new DecimalFormat(padrao2, dfs);
		System.out.println(df.format(123456789.123));
		
		//EU NAO ENTENDI DIREITO, POIS O PRIMEIRO PADRAO ESTÁ EM INGLES E IMPRIMIU EM PORTUGUES
		//E VICE-VERSA NO SEGUNDO PADRÃO
		
		//Configurando qual o tamanho do Grouping(milhar), agrupar a cada 4 numeros ao invés de a cada 3
		String padrao3 = "###,###.##";
		df = new DecimalFormat(padrao3, dfs);
		df.setGroupingSize(4);
		System.out.println(df.format(123456789.123));
		
		
		//configurando para sempre termos duas casas decimais
		String padrao4 = "###,###,###.00";
		df = new DecimalFormat(padrao4, dfs);
		System.out.println(df.format(123456789.1));//o num tem só uma casa dec e ele está colocando duas
		
		//configurando para caso o num tenha 1 casa depois e uma casa antes da virgula, apareça o zero
		String padrao5 = "###,###,##0.00";
		df = new DecimalFormat(padrao5, dfs);
		System.out.println(df.format(0.1));//o num tem só uma casa dec e ele está colocando duas
				
		
		//configurando para aparecer o % e numero negativo
		String padrao6 = "-###,###,000.00%";
		df = new DecimalFormat(padrao6, dfs);
		System.out.println(df.format(0.1));//o num tem só uma casa dec e ele está colocando duas
				
		
		//configurando para moeda
		String padrao7 = "\u00A4###,###,000.00";
		df = new DecimalFormat(padrao7, dfs);
		System.out.println(df.format(0.1));//o num tem só uma casa dec e ele está colocando duas
				
		
		
		
	}

}
