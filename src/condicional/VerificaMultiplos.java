package condicional;

import java.util.Scanner;

public class VerificaMultiplos {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe dois números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.printf("Os números %d e %d são múltiplos", a, b);
		}
		else {
			System.out.printf("Os números %d e %d não são múltiplos", a,b);
		}
		sc.close();
	}

}
