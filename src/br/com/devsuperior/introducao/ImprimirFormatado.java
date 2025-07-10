package br.com.devsuperior.introducao;

import java.util.Locale;

public class ImprimirFormatado {

	public static void main(String[] args) {
		
		double x = 10.36527;
		String nome = "Joyce";
		
		System.out.println("Hello world!");
		
		//para formatar dados --> %.qtd+f+%n onde: f substitui a vari�vel flutuante e n quebra a linha
		//tr�s casas decimais
		System.out.printf("%.3f%n", x);
		
		//duas casas decimais
		System.out.printf("%.2f%n", x);
		
		//sem ser n�mero, f vira s
		System.out.printf("Meu nome � %s. %nE o seu?%n", nome);
		
		//tipos de atalho: f (flutuante), s (nome), d (int), c (char) e b (boolean). 
		//Ex:
		
		//para mudar a localizacao do decimal
		//Locale.setDefault(Locale.US);
				
		int idade = 25;
		double salario = 2.000;
		System.out.printf("%s t�m %d anos e recebe %.3f reais.", nome, idade, salario);
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%n%nProducts:%n%s, which price is $%.2f%n%s, which price is %.2f%n%n"
		+ "Record: %d years old, code %d and gender: %c%n%nMeasure with eight decimal places: %.8f%n"
		+ "Rouded (three decimal places: %.3f%n", product1,price1,product2,price2,age,code,gender,measure,measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
