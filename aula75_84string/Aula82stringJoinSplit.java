package aula75_84string;

public class Aula82stringJoinSplit {

	public static void main(String[] args) {
		
		//metodo join
		//nos parametros: juntaremos todos os elementos atrav�s de uma ',' e depois, os elementos que se quer
		//os parametros s�o do tipo "varArgs" (podem ser infinitos parametros, e todos do mesmo tipo)
		String alfabeto = String.join(" , ", "A", "B", "C", "D");
		System.out.println(alfabeto);

		
		//metodo split
		//muito util para ler arquivos flat file
		//separa strings
		//usando Regex (expressao regular) de v�rgula e espa�o, pq � o delimitador que h� em alfabeto (vide acima, A, B...)
		//queremos pegar s� as letras, sem as virgulas e espa�os
		String[] letras = alfabeto.split(", ");
		for(String letra : letras) {
			System.out.println(letra);
		}
		
		
		//exemplo de arquivo flat file no qual podemos usar split
		String doArquivo = "1;Antonio;30;";
		String infos[] = doArquivo.split(";");
		for(String info : infos) {
			System.out.println(info);
		}
		
		//exemplo de arquivo flat file numero 2
		String doArquivo2 = "1;Antonio;30;";
		String infos2[] = doArquivo2.split(";");
		//aqui o compilador vai reclamar, estamos pondo String (info) e ele quer Int, faremos um Wrapper
		Aula82Pessoa pessoa = new Aula82Pessoa(Integer.parseInt(infos[0]), infos[1], Integer.parseInt(infos[2]));
		System.out.println(pessoa);
		
	}

}
