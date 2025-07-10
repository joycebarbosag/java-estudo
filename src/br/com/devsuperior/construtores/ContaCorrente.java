package br.com.devsuperior.construtores;

public class ContaCorrente {
	
	private Integer numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaCorrente(Integer numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public ContaCorrente(Integer numeroConta, String nomeTitular, double deposito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		//protejo meu construtor de mudan�as que possam acontecer no m�todo depositar e mantenho 
		//o encapsulamento do saldo (que � private e s� pode ser acessado pelos m�todos depositar e/ou sacar).
		depositar(deposito);
	}
	
	public Integer getNumeroConta() {
		return numeroConta;
	}

	public String getnomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor +5;
	}
}
