package condicional;

import java.util.Scanner;

public class VerificaValor {

	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		int codigo;
		int quantidade;
		double total;
		
		System.out.println("Digite o código do produto:");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade:");
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			total = quantidade * 4;
		}else if(codigo == 2) {
			total = quantidade * 4.50;
		}else if(codigo == 3) {
			total = quantidade * 5;
		}else if(codigo == 4) {
			total = quantidade * 2;
		}else {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: $%.2f", total);
		sc.close();

	}

}
