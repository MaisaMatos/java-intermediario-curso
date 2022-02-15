package aula85_100classesUtilitarias;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerBigDecimal {
	
	

	public static void main(String[] args) {
		
		//veja a falta de precis�o do Java com c�lculos de numeros decimais
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);//sa�da 0.010000000000000002, deveria ser apenas 0,01!
		
		//BigDecimal quando formos trabalhar com double ou float
		
		//Big Integer quando formos trabalhar com int. long
		
		//Refazendo o c�lculo acima usando o BigDecimal
		BigDecimal _a = new BigDecimal("0.03");//h� v�rios construtores, aqui usamos o de String
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);//aqui � preciso usar um m�todo para fazer as opera��es
		System.out.println(_c);
		
		//soma de grandes numeros
		BigDecimal bd1 = new BigDecimal("123456789.0987654321");
		BigDecimal bd2 = new BigDecimal("0987654321.123456789");
		System.out.println(bd1.add(bd2)); //metodo de soma
		
		//multiplicacao
		System.out.println(bd1.multiply(bd2));
		
		//divisao
		//desvantagem dessa api � que pode ficar verboso, pois � preciso traalhar com metodos
		//e as opera��es entre BigDecimal precisam de inst�ncias 
		//vide abaixo que, para dividir por 2, tive que instanciar o 2 que ainda n�o havia sido feito	
		System.out.println(bd1.divide(new BigDecimal(2)));

		//BigInteger = semelhante ao BigDecimal, inclusive nos m�todos
		BigInteger bi = new BigInteger("100000002222222333333");
		System.out.println(bi);
	}

}
