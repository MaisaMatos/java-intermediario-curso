package aula75_84string;

public class Aula83stringBuilderStringBuffer {

	public static void main(String[] args) {
		
		//como podemos fazer a concatena��o de todas essas strings do array para que todas fiquem dentro 
		//da string 'alfabeto'
		
		String[] letras = {"B", "C", "D", "E", "F"};
		
		String alfabeto = "";
		
		//poder�amos iterar. No entanto, as strings s�o imut�veis e seu valor n�o muda ao fazer concatena��o
		//cada um tem um ID...
		//ao concatenar, o que estamos fazendo � criar uma string nova com o conte�do da antiga + o da nova
		//al�m disso, pensando a nivel de sistemas, isso n�o � perform�tico
		
		for(String letra : letras) {
			alfabeto += letra;
		}
		System.out.println(alfabeto);
		
		//classe StringBuffer = mais elegante para se fazer isso
		//ele criar� um 'buff' (cole��o de strings), onde se pode adicionar novas strings e, ao final
		//chamando o m�todo 'toString', teremos uma string �nica
		StringBuffer sb = new StringBuffer();
		for(String letra : letras) {
			sb.append(letra);//o 'append' � para adicionar a string desejada, vai se fazendo isso para adicionar tudo o que se deseja
		}
		alfabeto = sb.toString();		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);//uma outra forma de se ter o mesmo resultado acima
		System.out.println(alfabeto);
		
		//a classe StringBuffer tamb�m tem outros m�todos
		//se quiser fazer o reverso da string 'alfabeto'
		System.out.println(sb.reverse());
		
		
		
		//classe StringBuilder
		//a diferen�a entre StringBuffer e StringBuilder, j� que t�m a mesma sa�da, � seguinte:
		//o StringBuffer � 'threadsafe': se estivermos num ambiente com mais de uma thread, precisamos usar o SBuffer
		//j� o StringBuilder n�o � 'threadsafe' e pode ser usado fora desses casos
		StringBuilder sb_ = new StringBuilder();
		for(String letra : letras) {
			sb_.append(letra);
		}
		alfabeto = sb_.toString();		
		System.out.println(alfabeto);
		
	}

}
