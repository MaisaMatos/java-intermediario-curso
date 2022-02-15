package aula75_84string;

public class Aula76stringConcatenacao {
	
	public static void main(String[] args) {
		
		String curso = "Curso ";
		String java = "Java";
		String cursoJava = curso + java;
		System.out.println(cursoJava);
		
		//podemos fazer concatenação de outros tipos de variaveis para uma variável string
		String resultado2Com2 = "Resultado 2+2 = " + (2+2);
		System.out.println(resultado2Com2);
		
		//se não colocar os parenteses na expressão numerica, veja o que acontece
		//há a concatenação dos tipos numericos, sendo eles transformados em string
		String resultado2Com2_ = "Resultado 2+2 = " + 2+2;
		System.out.println(resultado2Com2_);
		
		//também podemos passar um numero e transforma-lo em string através do metodo "valueOf()"
		String um = String.valueOf(1);
		System.out.println(um);//o 1 não é numérico, é uma string
		
		//concatenando textos para que saiam em uma linha
		String concatenacao = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," + 
				" sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
				" minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea " +
				" commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
				" esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat " +
				" non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println(concatenacao);
		
		
		//como o java se comporta com a concatenacao abaixo
		//ao fazer o debug, é possível verificar que a cada nova linha que é incrementada, é criado um novo ID
		//isso é porque AS STRINGS NO JAVA SÃO IMUTÁVEIS. AO FAZE UMA CONCATENAÇÃO E MODIFICAR A STRING,
		//NA VERDADE ESTAMOS CRIANDO UMA NOVA STRING E FAZENDO COM QUE A REFERENCIA DESSA VAR APONTE PARA A NOVA REFER
		//e as strings criadas antes (exemplo, a primeira linha foi ID29, depois ID30, agora ID31
		//essas criadas antes do ID31 ficam disponiveis para o garbage collector
		//isso impacta na performance do programa quando há milhares de elementos
		String concatenacao2 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit,";
		concatenacao2 += " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad ";
		concatenacao2 += " minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea ";
		concatenacao2 += " commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit ";
		concatenacao2 += " esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat ";
		concatenacao2 += " non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		System.out.println(concatenacao2);
		
	}

}
