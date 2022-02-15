package aula85_100classesUtilitarias;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerBigDecimal {
	
	

	public static void main(String[] args) {
		
		//veja a falta de precisão do Java com cálculos de numeros decimais
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);//saída 0.010000000000000002, deveria ser apenas 0,01!
		
		//BigDecimal quando formos trabalhar com double ou float
		
		//Big Integer quando formos trabalhar com int. long
		
		//Refazendo o cálculo acima usando o BigDecimal
		BigDecimal _a = new BigDecimal("0.03");//há vários construtores, aqui usamos o de String
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a);//aqui é preciso usar um método para fazer as operações
		System.out.println(_c);
		
		//soma de grandes numeros
		BigDecimal bd1 = new BigDecimal("123456789.0987654321");
		BigDecimal bd2 = new BigDecimal("0987654321.123456789");
		System.out.println(bd1.add(bd2)); //metodo de soma
		
		//multiplicacao
		System.out.println(bd1.multiply(bd2));
		
		//divisao
		//desvantagem dessa api é que pode ficar verboso, pois é preciso traalhar com metodos
		//e as operações entre BigDecimal precisam de instâncias 
		//vide abaixo que, para dividir por 2, tive que instanciar o 2 que ainda não havia sido feito	
		System.out.println(bd1.divide(new BigDecimal(2)));

		//BigInteger = semelhante ao BigDecimal, inclusive nos métodos
		BigInteger bi = new BigInteger("100000002222222333333");
		System.out.println(bi);
	}

}
