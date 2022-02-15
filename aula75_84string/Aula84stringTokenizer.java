package aula75_84string;

import java.util.StringTokenizer;

public class Aula84stringTokenizer {

	public static void main(String[] args) {
		
		//muito usada em leitura de arquivos com Java
		
		//com o string Tokenizer, podemos extrair informações de uma "stringona" ou superstring
		//porém, não a separaremos em arrays (vide aula 82), mas sim extrairemos 'tokens' dessa string
		
		String doArquivo = "1;Antonio;30;";
		
		//o primeiro parametro é: qual a string da qual queremos extrair as informaçoes
		//o segundo é o delimitador, que neste caso é o ponto e vírgula
		StringTokenizer st = new StringTokenizer(doArquivo, ";");
		
		//basicamente utilizamos dois métodos para extrair essas informações
		//enquanto o stringTokenizer tem mais tokens, vamos fazer algo para extrair esses tokens
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());//nextToken extrai a informação da string Tokenizer
		}

	}

}
