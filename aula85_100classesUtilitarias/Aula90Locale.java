package aula85_100classesUtilitarias;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {
		
		//dd/MM/yyyy Brasil
		//MM/dd/yyyy EUA
		
		//1.000,02 BR
		//1,000.02 EUA
		
		//descobrindo o Locale da minha maq
		Locale locale = Locale.getDefault();
		
		System.out.println(locale);
		
		//locais de internacionalização disponíveis na API
		Locale[] locales = Locale.getAvailableLocales();
		for(Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());	
			//otbendo o código da lingua
			System.out.println("Código da língua: " + loc.getLanguage());
			//obtendo o nome da lingua
			System.out.println("Língua: " + loc.getDisplayLanguage());
			//obtendo o código do pais
			System.out.println("Cód país: " + loc.getCountry());
			System.out.println("País: " + loc.getDisplayCountry());
			System.out.println("**********");
		}
		
		//se quiser forçar um locale no seu sistema
		Locale gb = new Locale("en", "Reino Unido");
		System.out.println(gb);
		Locale.setDefault(gb);
		System.out.println(Locale.getDefault());
		
		//em que essa mudança de locale implica? Muda a formatação do número
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(5000000000d));
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf1.format(5000000000d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println(nf2.format(5000000000d));
		
		//No caso do BR, precisa usar o new Locale ("pt", "BR") e irá mostrar o simbolo do Real
		
	}

}
