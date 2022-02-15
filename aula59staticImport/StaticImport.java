package aula59staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; acesso a todos os métodos da classe Math, mas é mais elegante usar cada import separado

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		//TODOS OS MÉTODOS DA CLASSE MATH SÃO ESTÁTICOS, POIS NÃO PRECISAMOS INSTANCIAR A CLASSE MATH PARA USA-LOS
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.sqrt(c));

		
		//caso precisássemos usar muito a classe Math (imagine fazer uma calculadora cientifica), poderíamos 
		//fazer isso sem ficar usando o "Math." a todo instante através de STATIC IMPORT
		//para tanto, é preciso fazer um import
		//quando já temos o import (vide lá em cima), não precisamos mais escrever Math.pow, por exemplo, só pow
		
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));
	}

}
