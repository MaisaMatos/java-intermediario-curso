package aula75_84string;

import java.util.StringTokenizer;

public class Aula84stringTokenizer {

	public static void main(String[] args) {
		
		//muito usada em leitura de arquivos com Java
		
		//com o string Tokenizer, podemos extrair informa��es de uma "stringona" ou superstring
		//por�m, n�o a separaremos em arrays (vide aula 82), mas sim extrairemos 'tokens' dessa string
		
		String doArquivo = "1;Antonio;30;";
		
		//o primeiro parametro �: qual a string da qual queremos extrair as informa�oes
		//o segundo � o delimitador, que neste caso � o ponto e v�rgula
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		//basicamente utilizamos dois m�todos para extrair essas informa��es
		//enquanto o stringTokenizer tem mais tokens, vamos fazer algo para extrair esses tokens
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());//nextToken extrai a informa��o da string Tokenizer
		}

	}

}
