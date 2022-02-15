package aula54enumeradoresEnumComoClasse;

public class TesteEnum {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.DOMINGO; //veja, estamos instanciando bem parecido com uma classe normal
		
		//abaixo, o toString chamar� o nome (domingo) e o getValor chamar� o n�mero(7)
		
		//para o usu�rio, posso mostrar "segunda" e para o banco de dados, posso guardar o valor
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(21,10,2021, DiaSemana.QUINTA);//outra forma de escrever, usando a classe Data
		
	
	}

}
