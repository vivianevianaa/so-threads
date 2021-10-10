package questao3;

public class Transferencia extends Thread {
	private ContaBancaria contaSaque;
	private ContaBancaria contaDeposito;
	private double valor;
	
	public Transferencia (ContaBancaria contaSaque, ContaBancaria contaDeposito, double valor) {
		this.contaSaque = contaSaque;
		this.contaDeposito = contaDeposito;
		this.valor = valor;
	}
	
	public void run() {
		synchronized (contaSaque) {
			synchronized (contaDeposito) {
				double saldoContaSaque = contaSaque.getSaldo();
				double saldoContaDeposito = contaDeposito.getSaldo();
				
				if (this.valor > saldoContaSaque) {
					System.out.println("Transferência recusada. Saldo insuficiente.");
				} else {
					double saldoAttSaque = saldoContaSaque - this.valor;
					contaSaque.setSaldo(saldoAttSaque);
					
					double saldoAttDeposito = saldoContaDeposito + this.valor;
					contaDeposito.setSaldo(saldoAttDeposito);
					
					System.out.println("O valor de " + this.valor + " reais foi sacado da conta " + contaSaque.getNome() + " para a conta " + contaDeposito.getNome());
					
					System.out.println("Saldo atualizado da conta " + contaSaque.getNome() + ": " + contaSaque.getSaldo());
					System.out.println("Saldo atualizado da conta " + contaDeposito.getNome() + ": " + contaDeposito.getSaldo());
				}
			}
		}
	}
}
