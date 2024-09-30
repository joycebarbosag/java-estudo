package construtores;

import java.util.Locale;
import java.util.Scanner;

public class MainContaCorrente {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCorrente cc;

		System.out.println("Informe o número da conta: ");
		int numeroConta = sc.nextInt();

		System.out.println("Informe seu nome: ");
		String nome = sc.next();

		System.out.println("Deseja fazer um depósito inicial?");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.println("Informe o valor do depósito: ");
			double valor = sc.nextDouble();
			cc = new ContaCorrente(numeroConta, nome, valor);
		} else {
			cc = new ContaCorrente(numeroConta, nome);
		}
		
		System.out.println("Informações da conta:\n"
				+ "Titular: " + cc.getnomeTitular()
				+ "\nNúmero da conta: " + cc.getNumeroConta()
				+ "\nSaldo da conta: " + cc.getSaldo());
		
		System.out.println("Deseja fazer um saque?");
		char saqueResponse = sc.next().charAt(0);
		
		if(saqueResponse == 'y') {
			System.out.println("Informe o valor: ");
			double valor = sc.nextDouble();
			cc.sacar(valor);
		}
		
		System.out.println("Informações atualizadas da conta:\n"
				+ "Titular: " + cc.getnomeTitular()
				+ "\nNúmero da conta: " + cc.getNumeroConta()
				+ "\nSaldo da conta: " + cc.getSaldo());
	
		sc.close();
	}

}
