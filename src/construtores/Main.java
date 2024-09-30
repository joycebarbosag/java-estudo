package construtores;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Produto produto = new Produto("TV", 2.000, 2);
		
		//usando os encapsuladores
		produto.setName("Celular");
		System.out.println(produto.getName());

	}

}
