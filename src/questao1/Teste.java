package questao1;

public class Teste {

	public static void main(String[] args) {
		ContadorCrescente contador1 = new ContadorCrescente(100, "T1");
		ContadorCrescente contador2 = new ContadorCrescente(100, "T2");
		
		ContadorDecrescente contador3 = new ContadorDecrescente(100, "T3");
		ContadorDecrescente contador4 = new ContadorDecrescente(100, "T4");

		Thread cont1 = new Thread(contador1);
		Thread cont2 = new Thread(contador2);

		
		cont1.start();
		cont2.start();
		contador3.start();
		contador4.start();
	}
}
