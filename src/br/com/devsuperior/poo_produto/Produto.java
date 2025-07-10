package br.com.devsuperior.poo_produto;

public class Produto {
	public String name;
	public double price;
	public int qt;
	
	public double totalValueInStock() {
		return price * qt;
	}
	
	//void pq a fun��o n�o vai retornar nada, s� add valores
	//apesar de ter o mesmo nome "qt", esse "qt" � externo � classe, isso �: um valor que n�o � um atributo. Por isso passamos como par�metro da classe.
	public void addProducts(int qt) {
		//this � uma autorefer�ncia ao obj
		this.qt += qt;
	}
	
	public void removeProduct(int qt) {
		this.qt -= qt;
	}
	
	//sobreponho o m�todo padr�o de object e fa�o o meu toString
	public String toString() {
		return name
				+ " $"
				+ String.format("%.2f", price)
				+ ", "
				+ qt
				+ " unidades, Total: $"
				+ totalValueInStock();
	}
}
