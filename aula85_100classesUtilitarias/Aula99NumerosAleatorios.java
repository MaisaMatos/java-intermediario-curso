package aula85_100classesUtilitarias;

import java.util.Random;

public class Aula99NumerosAleatorios {

	public static void main(String[] args) {
		
		//existem duas formas de gerar numeros aleatorios no Java
		//essa � melhor para gerar numeros aleatorios com ranges grandes (1 ao 10, 1 ao 100)
		//usamos o "floor" para arredondar para cima
		//usamos o "*10" para sair um n�mero inteiro, caso contr�rio sai um decimal
		System.out.println(Math.floor(Math.random()*10));

		System.out.println(Math.floor(Math.random()*100));
		
		
		
		//para um range menor, usar a classe Random
		//se quiser inteiro: nextInt; h� tamb�m nextDouble, nextLong...
		Random aleatorio = new Random();
		
		System.out.println(aleatorio.nextInt()); //sem limite de n�mero
		
		System.out.println(aleatorio.nextInt(100)); //de 0 a 100 exclusive. Se quiser incluir o 100, informar 101
	}

}
