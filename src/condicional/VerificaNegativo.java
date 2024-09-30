package condicional;

import java.util.Scanner;

public class VerificaNegativo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número.");
		
		double numero;
		numero = sc.nextDouble();
		
		if(numero < 0) { 
			System.out.printf("O número %.2f é negativo.", numero);
		 }else {
			 System.out.printf("O número %.2f não é negativo.", numero);
		}
		sc.close();
	}

}
