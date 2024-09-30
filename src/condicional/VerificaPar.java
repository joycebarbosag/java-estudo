package condicional;

import java.util.Scanner;

public class VerificaPar {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número.");
		int numeroInteiro;
		numeroInteiro = sc.nextInt();

		if (numeroInteiro % 2 == 0) {
			System.out.printf("O número %d é par.", numeroInteiro);
		} else {
			System.out.printf("O número %d é ímpar.", numeroInteiro);
		}
		sc.close();

	}

}
