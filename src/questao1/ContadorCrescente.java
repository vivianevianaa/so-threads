package questao1;

public class ContadorCrescente implements Runnable {
	int contCrescente;
	String identificador;
	
	public ContadorCrescente(int contCrescente, String identificador) {
		this.contCrescente = 100;
		this.identificador = identificador;
	}
	
	@Override
	public void run() {
		for (int cont = 0; cont <= contCrescente; cont++) {
			System.out.println(identificador + ": " + cont);
		}
	}
}
