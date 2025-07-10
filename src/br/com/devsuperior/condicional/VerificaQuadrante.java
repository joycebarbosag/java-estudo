package br.com.devsuperior.condicional;

import java.util.Scanner;

public class VerificaQuadrante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b;
		System.out.println("Informe o primeiro n�mero:");
		a = sc.nextDouble();
		System.out.println("Informe o segundo n�mero:");
		b = sc.nextDouble();
		
		if(a == 0.0 && b == 0.0) {
			System.out.println("Os dois n�meros est�o na origem do plano cartesiano.");
		}else if(a > 0.0 && b > 0.0) {
			System.out.println("Os dois n�meros est�o no Q1 do plano cartesiano.");
		}else if(a < 0.0 && b > 0.0) {
			System.out.println("Os dois n�meros est�o no Q2 do plano cartesiano.");
		}else if(a < 0.0 && b < 0.0) {
			System.out.println("Os dois n�meros est�o no Q3 do plano cartesiano.");
		}else if(a > 0.0 && b < 0.0) {
			System.out.println("Os dois n�meros est�o no Q4 do plano cartesiano.");
		}
		sc.close();
	}

}
