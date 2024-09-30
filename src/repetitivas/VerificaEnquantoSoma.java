package repetitivas;

import java.util.Scanner;

public class VerificaEnquantoSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número");
		int numero = sc.nextInt();
		int soma = 0;
		
		while(numero != 0) {
			System.out.printf("O número %d não é o finalizador da operação. Digite outro valor:", numero);
			numero = sc.nextInt();
			soma += numero;
		}
		System.out.printf("O número %d é o finalizador da operação. A soma de todos os números processados foi de: %d", numero, soma);
		sc.close();
	}

}
