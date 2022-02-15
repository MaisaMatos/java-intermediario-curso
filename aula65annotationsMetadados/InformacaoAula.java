package aula65annotationsMetadados;

@interface InformacaoAula {
	
	String autor();
	
	int aulaNumero();
	
	//se há um valor padrão para alguma dessas informaçoe, colocar o "default" e o respectivo valor
	String blog() default "http://loiane.com";
	
	String site() default "http://loiane.training";

}
