package aula64classesAninhadasInternasLocaisEAnonimas;

public class Local {
	
	public void metodoQualquer() {
		
		class ClasseLocal{ //classe dentro do método!Mas ela só tem escopo dentro do método
			
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
