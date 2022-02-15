package aula64classesAninhadasInternasLocaisEAnonimas;

public class Local {
	
	public void metodoQualquer() {
		
		class ClasseLocal{ //classe dentro do m�todo!Mas ela s� tem escopo dentro do m�todo
			
			private String texto = "texto classe local";
			
			public void imprimeTexto() {
				System.out.println(texto);
			}
		}
		
		ClasseLocal local = new ClasseLocal();
		
		local.imprimeTexto();		
		
	}
	
	public static void main(String[] args) {
		
		Local externa = new Local();
		
		externa.metodoQualquer();
		
	}

}
