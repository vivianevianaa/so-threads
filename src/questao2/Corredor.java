package questao2;

public class Corredor extends Thread {
	String nomeCorredor;
	int tamTrajeto;
	int tempo;
	
	public Corredor (String nomeCorredor, int tamTrajeto, int tempo) {
		this.nomeCorredor = nomeCorredor;
		this.tamTrajeto = tamTrajeto;
		this.tempo = tempo;
	}
	
	public void run() {
		for (int cont = tamTrajeto; cont >= 0; cont--) {
			System.out.println("Faltam " + cont + " metros para o corredor " + nomeCorredor);
			
			try {
				sleep(tempo*1000);
				System.out.println(nomeCorredor + " está descansando.");
			} catch (InterruptedException e) {
				System.out.println(e);
			}	
		}
		System.out.println(nomeCorredor + " ---- chegou!");
	}
}
