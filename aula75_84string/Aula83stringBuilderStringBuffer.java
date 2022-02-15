package aula75_84string;

public class Aula83stringBuilderStringBuffer {

	public static void main(String[] args) {
		
		//como podemos fazer a concatenação de todas essas strings do array para que todas fiquem dentro 
		//da string 'alfabeto'
		
		String[] letras = {"B", "C", "D", "E", "F"};
		
		String alfabeto = "";
		
		//poderíamos iterar. No entanto, as strings são imutáveis e seu valor não muda ao fazer concatenação
		//cada um tem um ID...
		//ao concatenar, o que estamos fazendo é criar uma string nova com o conteúdo da antiga + o da nova
		//além disso, pensando a nivel de sistemas, isso não é performático
		
		for(String letra : letras) {
			alfabeto += letra;
		}
		System.out.println(alfabeto);
		
		//classe StringBuffer = mais elegante para se fazer isso
		//ele criará um 'buff' (coleção de strings), onde se pode adicionar novas strings e, ao final
		//chamando o método 'toString', teremos uma string única
		StringBuffer sb = new StringBuffer();
		for(String letra : letras) {
			sb.append(letra);//o 'append' é para adicionar a string desejada, vai se fazendo isso para adicionar tudo o que se deseja
		}
		alfabeto = sb.toString();		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);//uma outra forma de se ter o mesmo resultado acima
		System.out.println(alfabeto);
		
		//a classe StringBuffer também tem outros métodos
		//se quiser fazer o reverso da string 'alfabeto'
		System.out.println(sb.reverse());
		
		
		
		//classe StringBuilder
		//a diferença entre StringBuffer e StringBuilder, já que têm a mesma saída, é seguinte:
		//o StringBuffer é 'threadsafe': se estivermos num ambiente com mais de uma thread, precisamos usar o SBuffer
		//já o StringBuilder não é 'threadsafe' e pode ser usado fora desses casos
		StringBuilder sb_ = new StringBuilder();
		for(String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();		
		System.out.println(alfabeto);
		
	}

}
