package questao1;

public class ContadorDecrescente extends Thread {
	int contDecrescente;
	String identificador;
	
	public ContadorDecrescente (int contDecrescente, String identificador) {
		this.contDecrescente = 100;
		this.identificador = identificador;
	}
	
	@Override
	public void run() {
		for (int cont = contDecrescente; cont >= 0; cont--) {
			System.out.println(identificador + ": " + cont);
		}
	}
}
