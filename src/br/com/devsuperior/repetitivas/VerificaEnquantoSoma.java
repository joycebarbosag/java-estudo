package br.com.devsuperior.repetitivas;

import java.util.Scanner;

public class VerificaEnquantoSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um n�mero");
		int numero = sc.nextInt();
		int soma = 0;
		
		while(numero != 0) {
			System.out.printf("O n�mero %d n�o � o finalizador da opera��o. Digite outro valor:", numero);
			numero = sc.nextInt();
			soma += numero;
		}
		System.out.printf("O n�mero %d � o finalizador da opera��o. A soma de todos os n�meros processados foi de: %d", numero, soma);
		sc.close();
	}

}
