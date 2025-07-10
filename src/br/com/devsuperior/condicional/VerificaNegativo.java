package br.com.devsuperior.condicional;

import java.util.Scanner;

public class VerificaNegativo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero.");
		
		double numero;
		numero = sc.nextDouble();
		
		if(numero < 0) { 
			System.out.printf("O n�mero %.2f � negativo.", numero);
		 }else {
			 System.out.printf("O n�mero %.2f n�o � negativo.", numero);
		}
		sc.close();
	}

}
