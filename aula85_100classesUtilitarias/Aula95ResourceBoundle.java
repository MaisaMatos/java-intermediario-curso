package aula85_100classesUtilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBoundle {

	public static void main(String[] args) {
		
		//se o projeto for ser executado em diferentes locais, com diferentes l�nguas, fusos, labels (textos), customiza��es
		//campos obrigatorios = para isso existem os arquivos especiais Resource Bundle ou a classe Resource Bundle
		
		//o Resource Bundle geralmente � criado na raiz do "src". Para tanto:
		//ir em "src" > new > other > Geral > file > nomear o arquivo tipo: "meu-texto.properties"
		//".properties" geralmente � extens�o usada para colocar as propriedades da aplica�ao e, no mundo Java
		//os arquivos ".properties" podem ser muito �teis ao trabalhar com frameworks
		
				
		//logica para poder ler o arquivo de recursos "meu-texto.properties"
		//usando Locale padr�o
		
		System.out.println("Locale atual: " + Locale.getDefault());	
		
		ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

		System.out.println("Ol�: " + rb.getString("hello"));
		
		System.out.println("Mundo: " + rb.getString("world"));
		
		//usando outro Locale
		Locale.setDefault(new Locale("en_US", "en-US"));
		System.out.println("Locale atual: " + Locale.getDefault());
		
		rb = ResourceBundle.getBundle("meu-texto");
		
		System.out.println("Hello: " + rb.getString("hello"));
		
		System.out.println("World: " + rb.getString("world"));


	}

}
