package aula59staticImport;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; acesso a todos os m�todos da classe Math, mas � mais elegante usar cada import separado

public class StaticImport {

	public static void main(String[] args) {
		
		double a = 2;
		double b = 3;
		double c = 4;
		
		//TODOS OS M�TODOS DA CLASSE MATH S�O EST�TICOS, POIS N�O PRECISAMOS INSTANCIAR A CLASSE MATH PARA USA-LOS
		
		System.out.println(Math.pow(2, 3));
		
		System.out.println(Math.sqrt(c));

		
		//caso precis�ssemos usar muito a classe Math (imagine fazer uma calculadora cientifica), poder�amos 
		//fazer isso sem ficar usando o "Math." a todo instante atrav�s de STATIC IMPORT
		//para tanto, � preciso fazer um import
		//quando j� temos o import (vide l� em cima), n�o precisamos mais escrever Math.pow, por exemplo, s� pow
		
		System.out.println(pow(a, b));
		System.out.println(sqrt(c));
	}

}
