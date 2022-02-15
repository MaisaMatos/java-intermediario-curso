package aula57WrappersClassesDeTiposPrimitivos;

public class TesteWrapper {

	public static void main(String[] args) {
		
		//vamos declarar variáveis que representem tipos primitivos do Java
		short num1 = 1;
		byte num2 = 0;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.555555;
		boolean flag = true;
		char a = 'a';

		//o Java não é 100% orientado a objetos (o Ruby é, tem classe para tudo) devido aos tipos primitivos
		//as classes Wrappers representam os tipos primitivos do Java
		//ou seja, temos classes represetando cada um dos tipos listados anteriormente
		//veja abaixo
		
		//-------------------CLASSES REPRESENTANDO OS TIPOS PRIMITIVOS INTEIROS------------------------------
		
		//--------------------CLASSE SHORT--------------------		
		Short num7 = new Short(num1);
		//esta classe representa, empacota um tipo primitivo short
		//veja que ela é instanciada normalmente e dentro do construtor, ela dá opçoes
		//passei uma variável, mas poderia ter passado um número short, e ele pediria pra fazer o casting
		
		//veja o casting abaixo
		Short num7a = new Short((short) 1);
		
		
		//--------------------CLASSE BYTE---------------------
		Byte num8 = new Byte((byte) 10);
		
		
		//--------------------CLASS INTEGER-------------------
		Integer num9 = new Integer(100);
		
		
		//--------------------CLASS LONG----------------------
		Long num10 = new Long(10000l);
		
		
		//--------------------CLASSES REPRESENTANDO OS TIPOS PRIMITIVOS FLUTUANTES----------------------------
		
		//--------------------CLASSE FLOAT--------------------
		Float num11 = new Float(3.5f);
		
		//--------------------CLASSE DOUBLE-------------------
		Double num12 = new Double(3.55555);
		
		
		//--------------------CLASSE BOOLEAN------------------------------------------------------------------
		Boolean flag2 = new Boolean(true);
		
		
		//--------------------CLASSE REPRESENTANDO UM CARACTER------------------------------------------------
		
		Character b = new Character('a');
		
		//----------------------------------------------------------------------------------------------------
		
		//ao instanciar qualquer uma dessas classes, é possível passar um String no construtor:
		//não dá erro de compilação, mas pode dar uma exceção do tipo "number format exception"
		//porque é possível inserir letras nessa String onde deveria existir só números
		Integer num13 = new Integer("10000");
		
		Double num14 = new Double("3.5");
		
		//----------------------------------------------------------------------------------------------------
		
		//Cada classe Wrapper possui métodos, que retornarão valores
		//ao colocar o ponto e apertar o espaço, veremos vários métodos
		//em todas as classes Wrappers é possível fazer a conversão de um tipo para o outro
		System.out.println(num13.intValue());
		
		Long num15 = num13.longValue();//conversão na instância
		
		System.out.println(num13.longValue());//conversão na impressão
		
		//-----------------------------------------------------------------------------------------------------
		
		//é possível também fazer o Parse de valores de String para os tipos primitivos
		
		int num16 = Integer.parseInt("10000");//transformando o valor de uma String em Int
											  //isso também pode disparar uma exceção
		
		
		double num17 = Double.parseDouble("3.5555");
		System.out.println(num17);
		
		//-------------------------METODO VALUEOF -------------------------------------------------------------
		
		Integer num18 = Integer.valueOf(1343);//vai transformar um tipo int primitivo em uma instancia da classe Integer
		System.out.println(num18);
		
		//---------------------COMPARAÇÂO---------------------------------------------------------------------
		
		System.out.println(num9 == num13); //vai dar false pq num9 e do tipo de uma classe e o num13 também é uma instancia de objeto
										   //o sinal == não funciona com Wrappers
		
		
		
		
		
		
		
		
		
		
		
	}

}
