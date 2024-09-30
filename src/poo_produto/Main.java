package poo_produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Qual o nome do produto?");
		produto.name = sc.next();
		System.out.println("Qual o valor do produto?");
		produto.price = sc.nextDouble();
		System.out.println("Qual a quantidade do produto?");
		produto.qt = sc.nextInt();
		
		System.out.printf("Nome: %s%nValor: %.2f%nQuantidade: %d%n", produto.name, produto.price, produto.qt);
		
		System.out.println("Product data: " + produto);
		
		System.out.println("Insira a quantidade de produtos novos no estoque: ");
		int qt;
		qt = sc.nextInt();
		produto.addProducts(qt);
		
		System.out.println("Update data: " + produto);
		
		System.out.println("Insira a quantidade que deseja remover do estoque: ");
		qt = sc.nextInt();
		produto.removeProduct(qt);
		
		System.out.println("Update data: " + produto);
		
		sc.close();
	}

}
