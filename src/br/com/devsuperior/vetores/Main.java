package br.com.devsuperior.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int qt = sc.nextInt();
		
		double[] vect = new double[qt];

		System.out.println("Informe as alturas: ");
		double soma = 0;
		for(int i=0; i < vect.length; i++) {
			System.out.println(i+1 + ": ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double avg = soma/qt;
		System.out.printf("M�dia das alturas: %.2f", avg);
		
		sc.close();
	}

}
