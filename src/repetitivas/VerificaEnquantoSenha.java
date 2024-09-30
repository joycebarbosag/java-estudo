package repetitivas;

import java.util.Scanner;

public class VerificaEnquantoSenha {

	public static void main(String[] args) {
		
		int senha = 2002;
		System.out.println("Informe sua senha: ");
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		while (valor != senha) {
			System.out.println("Senha Inválida.\nInforme sua senha:");
			valor = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		sc.close();

	}

}
