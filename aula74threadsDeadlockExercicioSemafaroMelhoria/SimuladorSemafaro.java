package aula74threadsDeadlockExercicioSemafaroMelhoria;

public class SimuladorSemafaro {
	
	public static void main(String[] args) {
		
		ThreadSemafaro semafaro = new ThreadSemafaro();
		
		//pediremos para imprimir 10x as cores no console
		for(int i=0; i<10; i++) {
			System.out.println(semafaro.getCor());
			semafaro.esperaCorMudar();
		}
		
		semafaro.desligarSemafaro();
	}
	

}
