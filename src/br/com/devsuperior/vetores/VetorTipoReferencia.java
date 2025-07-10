package br.com.devsuperior.vetores;

import java.util.Locale;
import java.util.Scanner;

public class VetorTipoReferencia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de produtos: ");
		int qt = sc.nextInt();
		
		Produto[] vect = new Produto[qt];
		for(int i=0; i < vect.length; i++) {
			System.out.println("Informe o nome do produto: ");
			String name = sc.next();
			System.out.println("Informe o pre�o do produto: ");
			double preco = sc.nextDouble();
			
			vect[i] = new Produto(name, preco);
		}
		
		for(int i=0; i < vect.length; i++) {
			System.out.println(vect[i].getNome() + " - " + vect[i].getPreco());
		}
		
		sc.close();
	}

}
