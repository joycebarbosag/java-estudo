package br.com.devsuperior.repetitivas;

import java.util.Scanner;

public class VerificaEnquantoValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um n�mero para verifica��o:");
		int numero = sc.nextInt();
		
		while (numero != 10) {
			System.out.printf("%d � diferente de 10. Informe outro n�mero:%n", numero);
			numero = sc.nextInt();
		}
		System.out.printf("O n�mero %d � o desejado! Programa finalizado.", numero);
		sc.close();
	}

}
