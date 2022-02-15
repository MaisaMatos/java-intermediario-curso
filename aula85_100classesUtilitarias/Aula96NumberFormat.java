package aula85_100classesUtilitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {
	
	//usado geralmente qdo queremos formatar numeros sem muita necessidade de precisão decimal 
	//qdo se trabalha com moedas, onde a precisão decimal é importante, usamos a Decimal Format
	//1.000,00 - BR
	//1,000.00 - EUA => importancia de formatar conf o local onde a aplicação será usada
	

	public static void main(String[] args) throws ParseException {
		
	Locale en = new Locale("en", "United States");
	NumberFormat nf = NumberFormat.getInstance(en);
	
	String num = nf.format(100.99); 
	System.out.println(num); //sai com ponto
	
	Locale br = new Locale("pt", "Brazil");
	nf = NumberFormat.getInstance(br);
	num = nf.format(100.99);
	System.out.println(num); //sai com virgula
	
	//MOEDA (SEM MUITA PRECISÃO)
	//Locale.getDefault pega o Locale settado no SO que se está utilizando
	NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
	
	String valor = moeda.format(200.99);
	System.out.println(valor);//sai com o simbolo da moeda
	
	Currency currency = moeda.getCurrency();
	System.out.println(currency);
	
	//PORCENTAGEM
	NumberFormat porcent = NumberFormat.getPercentInstance();
	String porcentagem = porcent.format(99.987);
	System.out.println(porcentagem);
	
	porcent.setMaximumIntegerDigits(4);//settando o máximo de casas decimais para o número inteiro
	porcent.setMinimumIntegerDigits(3);
	

	porcent.setMaximumFractionDigits(2);//setando o min de digitos fracionarios
	porcent.setMinimumFractionDigits(1);//setando o min de digitos fracionarios
	
	porcentagem = porcent.format(99.987);
	System.out.println(porcentagem);
	
	//ARREDONDAMENTO
	nf = NumberFormat.getInstance(Locale.getDefault());
	
	nf.setRoundingMode(RoundingMode.UP);
	nf.setMaximumFractionDigits(0);
	nf.setMinimumFractionDigits(0);
	System.out.println(nf.format(99.50));
	
	//estamos sempre usando o ".format()", mas também é possível parsear
	Number num3 = nf.parse("100,00");
	System.out.println(num3.intValue());
	
	
	
	
	
	
		
	
	
		
		

	}

}
