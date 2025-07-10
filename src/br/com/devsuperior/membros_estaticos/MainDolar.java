package br.com.devsuperior.membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class MainDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do dolar: ");
		double dolar = sc.nextDouble();
		System.out.println("Informe o valor em reais: ");
		double reais = sc.nextDouble();
		
		System.out.println("Valor convertido: " + CalculandoDolar.calcularDolar(reais, dolar));
		
		sc.close();
	}

}
