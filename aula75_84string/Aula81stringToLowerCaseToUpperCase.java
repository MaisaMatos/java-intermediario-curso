package aula75_84string;

public class Aula81stringToLowerCaseToUpperCase {

	public static void main(String[] args) {
		
		//metodo toLowerCase = transforma em minúsculo
		String teste = "Teste";
		
		System.out.println(teste.toLowerCase());
		
		String testeMinusc = teste.toLowerCase();//este devolve a string transformada, o acima só transforma na impressao
		
		System.out.println(testeMinusc);
		
		//metodo toUpperCase = transforma em maiusculo
		String testeMaiusc = teste.toUpperCase();
		
		System.out.println(testeMaiusc);
		

	}

}
