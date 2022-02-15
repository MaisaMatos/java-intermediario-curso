package aula64classesAninhadasInternasLocaisEAnonimas;

public class Externa {

	private String texto = "texto externo";
	
	public class Interna {
		
		private String texto = "texto interno";
		
		public void imprimeTexto() {
			
			System.out.println(texto);
			
			//consegue ver membros da classe externa
			System.out.println(Externa.this.texto);
		}
	}
	
	public static void main(String[] args) {
		
		Externa externa = new Externa();
		
		//se a classe Interna fosse estática, não precisaríamos da instância da classe Externa para instanciar a Interna
		Interna interna = externa.new Interna();
		
		interna.imprimeTexto();
		
		
		
	}
	
}
