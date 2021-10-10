package questao3;

public class ContaBancaria {
	private String nome;
	private double saldo;
	
	public ContaBancaria (String nome, int saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
