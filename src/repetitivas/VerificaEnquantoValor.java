package repetitivas;

import java.util.Scanner;

public class VerificaEnquantoValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número para verificação:");
		int numero = sc.nextInt();
		
		while (numero != 10) {
			System.out.printf("%d é diferente de 10. Informe outro número:%n", numero);
			numero = sc.nextInt();
		}
		System.out.printf("O número %d é o desejado! Programa finalizado.", numero);
		sc.close();
	}

}
