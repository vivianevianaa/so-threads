package questao3;

public class Deposito extends Thread {
	private ContaBancaria conta;
	private double valor;
	
	public Deposito(ContaBancaria conta, double valor) {
		this.conta = conta;
		this.valor = valor;
	}
	
	public void run() {
		synchronized (conta) {
			double saldo = conta.getSaldo();
			double saldoAtt = this.valor + saldo;
			conta.setSaldo(saldoAtt);
			System.out.println("Foi depositado o valor de " + this.valor + " na conta " + conta.getNome() + ". O novo saldo é de: " + conta.getSaldo());
		}
	}
}
