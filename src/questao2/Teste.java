package questao2;

public class Teste {

	public static void main(String[] args) {
		Corredor corredor1 = new Corredor("Corredor 1", 15, 3);
		Corredor corredor2 = new Corredor("Corredor 2", 15, 4);
		Corredor corredor3 = new Corredor("Corredor 3", 15, 2);
		Corredor corredor4 = new Corredor("Corredor 4", 15, 5);
		
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
	}
}
