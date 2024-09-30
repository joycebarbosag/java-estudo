package poo_retangulo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		System.out.println("Informe o valor da altura: ");
		Scanner sc = new Scanner(System.in);
		double h = sc.nextDouble();
		System.out.println("Informe o valor da largura: ");
		double w = sc.nextDouble();

		System.out.printf("Valor da área: %.2f%nValor do perímetro: %.2f%nValor da diagonal: %.2f%n",
				rectangle.area(w, h), rectangle.perimetro(w, h), rectangle.diagonal(w, h));

		sc.close();
	}

}
