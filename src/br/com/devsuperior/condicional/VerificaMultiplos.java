package br.com.devsuperior.condicional;

import java.util.Scanner;

public class VerificaMultiplos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois n�meros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.printf("Os n�meros %d e %d s�o m�ltiplos", a, b);
		}
		else {
			System.out.printf("Os n�meros %d e %d n�o s�o m�ltiplos", a,b);
		}
		sc.close();
	}

}
