package br.com.devsuperior.condicional;

import java.util.Scanner;

public class VerificaIntervalo {

	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero:");
		int numero;
		numero = sc.nextInt();
		
		if(numero >= 0 && numero <= 25) {
			System.out.printf("O n�mero %d est� entre o intervalo 0-25", numero);
		}else if(numero >= 25 && numero <= 50) {
			System.out.printf("O n�mero %d est� entre o intervalo 25-50", numero);
		}else if(numero >= 50 && numero <= 75) {
			System.out.printf("O n�mero %d est� entre o intervalo 25-75", numero);
		}else if(numero >= 75 && numero <= 100) {
			System.out.printf("O n�mero %d est� entre o intervalo 75-100", numero);
		}else {
			System.out.printf("O n�mero est� fora de um intervalo v�lido", numero);
		}

	}

}
