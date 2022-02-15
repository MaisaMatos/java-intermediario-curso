package aula85_100classesUtilitarias;

public class Aula85Math {

	public static void main(String[] args) {
		
		//exponenciação
		System.out.println(Math.pow(2, 3)); //8
		
		//arredondamento
		System.out.println(Math.round(4.7)); //acima de 4,5 arredonda para cima (saída 5)
		
		System.out.println(Math.round(4.4)); //abaixo de 4,5 arredonda para baixo (saída 4)
		
		System.out.println(Math.ceil(4.7)); //arredonda sempre para cima
		
		System.out.println(Math.ceil(4.4)); //arredonda sempre para cima
		
		System.out.println(Math.floor(4.4)); //arredonda sempre para baixo
		
		System.out.println(Math.floor(4.4)); //arredonda sempre para baixo
		
		//gerar numeros aleatorios
		System.out.println(Math.random());//saída com varias casas decimais
		
		System.out.println(Math.round(Math.random()*10));//numero randomico até 10
		
		System.out.println(Math.round(Math.random()*100));//numero randomico até 100
		
		
		//funcoes trigonométricas
		System.out.println(Math.sin(Math.toRadians(30)));//seno
		
		System.out.println(Math.cos(Math.toRadians(1)));//coseno
		
		System.out.println(Math.tan(Math.toRadians(45)));//tangente
		
		//Devido à imprecisão do Java para se trabalhar com números primitivos, foram desenvolvidas as classes
		//BigNumber e BigDecimal, que são usadas em sistemas financeiros
		
		
		
		
	}

}
