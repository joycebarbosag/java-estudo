package br.com.devsuperior.condicional;

import java.util.Scanner;

public class VerificaPar {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero.");
		int numeroInteiro;
		numeroInteiro = sc.nextInt();

		if (numeroInteiro % 2 == 0) {
			System.out.printf("O n�mero %d � par.", numeroInteiro);
		} else {
			System.out.printf("O n�mero %d � �mpar.", numeroInteiro);
		}
		sc.close();

	}

}
