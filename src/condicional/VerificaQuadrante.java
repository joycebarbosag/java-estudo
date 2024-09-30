package condicional;

import java.util.Scanner;

public class VerificaQuadrante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		System.out.println("Informe o primeiro número:");
		a = sc.nextDouble();
		System.out.println("Informe o segundo número:");
		b = sc.nextDouble();
		
		if(a == 0.0 && b == 0.0) {
			System.out.println("Os dois números estão na origem do plano cartesiano.");
		}else if(a > 0.0 && b > 0.0) {
			System.out.println("Os dois números estão no Q1 do plano cartesiano.");
		}else if(a < 0.0 && b > 0.0) {
			System.out.println("Os dois números estão no Q2 do plano cartesiano.");
		}else if(a < 0.0 && b < 0.0) {
			System.out.println("Os dois números estão no Q3 do plano cartesiano.");
		}else if(a > 0.0 && b < 0.0) {
			System.out.println("Os dois números estão no Q4 do plano cartesiano.");
		}
		sc.close();
	}

}
