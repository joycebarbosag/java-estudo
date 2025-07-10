package br.com.devsuperior.poo_funcionario;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public void increaseSalary(double percentage) {
		double increaseIn = percentage / 100 * salarioBruto;
		salarioBruto += increaseIn;
	}

	public double netSalary() {
		return salarioBruto - imposto;
	}

	public String toString() {
		return nome + ", recebe $" + String.format("%.2f", netSalary());
	}
}
