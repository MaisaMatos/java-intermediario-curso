package aula65annotationsMetadados;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	//se h� um valor padr�o para alguma dessas informa�oe, colocar o "default" e o respectivo valor
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";

}
