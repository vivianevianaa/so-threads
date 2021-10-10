package questao3;

public class Teste {
	
	public static void main(String[] args) {
	ContaBancaria a = new ContaBancaria("A", 1000);
	//ContaBancaria b = new ContaBancaria("B", 1000);
	
	Deposito d1 = new Deposito(a, 500);
	Deposito d2 = new Deposito(a, 500);
	
	Saque s1 = new Saque(a, 1000);
	Saque s2 = new Saque(a, 1000);
	
	//Transferencia t1 = new Transferencia(a, b, 350);
	//Transferencia t2 = new Transferencia(b, a, 1499);
	
	d1.start();
	d2.start();
	
	s1.start();
	s2.start();
	
	}
}
