package aula60escopoDeVariaveis;

public class EscopoVariaveis {
	
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int calculaValor(int valor) {
		valor = valor + 10;
		return valor;
	}
	
	public int teste() {
		int valor = 5;
		if(true) {
			valor--;
		}
		return valor;
	}
	
	public int outroTeste() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		//a var "int i" foi especialmente declarada para o bloco "for". Por isso, ao tentar usar o "i" fora do bloco,
		//haver� erro de compila��o.
		
		System.out.println();
		
		int j;
		for(j=0; j<10; j++) {
			System.out.println(j);
		}
		//aqui, ao contr�rio do exemplo acima, declaramos a var fora do bloco "for"
		//� por isso que conseguimos referenciar a var fora do bloco		
		
		return j;
	}
	
	public void maisUmTeste() {
		boolean flag = true;
		if(flag) {
			int umaVariavel = 10;
			umaVariavel++;
			System.out.println(umaVariavel);
		}
		
		//System.out.println(umaVariavel); // erro de compila��o, pois a var s� vale dentro do bloco "if"
	}
	
	public void maisUmOutroTeste(int num) {//a var "int num" vale at� o final do m�todo
		
		int total = 0; //a var "total" vale at� o final do m�todo
		
		try {
			int outroNum = 0; //tem escopo s� dentro do "try"
			
			total = num/outroNum;//notar que aqui usamos "num" e "total", declaradas no in�cio do m�todo
			
		} catch(Exception e) { // a var "e" s� � vis�vel dentro do bloco do "catch"
			e.printStackTrace();
		} finally{
			
			total++;
			//outroNum++; //erro de compila��o
			//e.printStackTrace(); //erro de compila��o
		}
		
		num++;
		//outroNum++; //erro de compila��o
		//e.printStackTrace(); //erro de compila��o
	}

}
