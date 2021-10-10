package questao3;

public class Saque extends Thread {
	private ContaBancaria conta;
	private double valor;
	
	public Saque(ContaBancaria conta, double valor) {
		this.conta = conta;
		this.valor = valor;
	}
	
	public void run() {
		synchronized (conta) {
			double saldo = conta.getSaldo();
			
			if (this.valor > saldo) {
				System.out.println("Saldo insuficiente.");
			} else {
				double saldoAtt = saldo - this.valor;
				conta.setSaldo(saldoAtt);
				System.out.println("Foi sacado o valor de " + this.valor + " da conta " + conta.getNome() + ". O novo saldo é de: " + conta.getSaldo());
			}
		}
	}
}
