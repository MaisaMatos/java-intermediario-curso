package aula58autoboxingUnboxing;

public class TesteAutoboxing {
	
	//Autoboxing e autounboxing: processos de transformar um tipo primitivo em 	um tipo objeto e vice-versa
	
	public static void main(String[] args) {
		
		
		//autoboxing
		//vamos pegar esses valores e coloca-los dentro de uma caixinha que representa o tipo primitivo
		//fazemos isso simplesmente passando diretamente o tipo primitivo
		//ao invés de chamar o construtor da classe (vide o "antes"), podemos automaticamente fazer a atribuição direta
		
		//antes: Short num7a = new Short((short) 1);
		Short num7a = 1;
		//antes: Byte num8 = new Byte((byte) 10);
		Byte num8 = 10;
		//antes: Integer num9 = new Integer(100);
		Integer num9 = 100;
		//antes: Long num10 = new Long(10000l);
		Long num10 = 10000l;
		//antes: Float num11 = new Float(3.5f);
		Float num11 = 3.5f;
		//antes: Double num12 = new Double(3.55555);
		Double num12 = 3.55555;
		//antes: Boolean flag2 = new Boolean(true);
		Boolean flag2 = true;
		//antes: Character b = new Character('a');
		Character b = 'a';
		
		
		
		//auto unboxing
		//transformo o tipo que é de uma determinada classe em um tipo primitivo novamente
		int num13 = num9;
		
		//o que foi feito acima seria a mesma coisa de usar o método int.value abaixo
		//só que ao invés de chamar métodos, é mais fácil fazer a conversão direta		
		num9.intValue();
		
		//autoboxing em expressoes
		//as classes Wrappers também podem ser usadas em expressões
		num9++;
		System.out.println(num9);
				
		//o num13 já é primitivo
		//auto unboxing do num9 e depois é feito o autoboxing do resultado do valor da expressão para o num14	
		//em suma, o resultado da expressão, que está em tipo primitivo, é transformado em objeto novamente.
		Integer num14 = num13/num9;
		
		
		//mau uso: ao trabalhar muito com expressões, é melhor usar direto os tipos primitivos do Java, e não as classes Wrappers
		//fazendo autoboxing
		Double a1, b1, c1;
		a1 = 10.0;
		b1 = 12.2;
		c1 = 4.7;
		
		Double media = (a1 + b1 + c1)/3;//autoo unboxing dos valores para primitivos, pega o resultado da expressao e transformar novamente em um numero que representa um objeto
		System.out.println(media);
		
		
		
		
		
		
		
	}

}
