package poo_produto;

public class Produto {
	public String name;
	public double price;
	public int qt;
	
	public double totalValueInStock() {
		return price * qt;
	}
	
	//void pq a função não vai retornar nada, só add valores
	//apesar de ter o mesmo nome "qt", esse "qt" é externo à classe, isso é: um valor que não é um atributo. Por isso passamos como parâmetro da classe.
	public void addProducts(int qt) {
		//this é uma autoreferência ao obj
		this.qt += qt;
	}
	
	public void removeProduct(int qt) {
		this.qt -= qt;
	}
	
	//sobreponho o método padrão de object e faço o meu toString
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
