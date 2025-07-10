package br.com.devsuperior.vetores;

import java.util.Scanner;

public class MainQuestao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e depois N n�meros inteiros
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os n�meros negativos lidos.
		
		int qt;
		int control = 0;

		do {

			System.out.println("Informe a quantidade de n�meros que ser�o lidos (at� 10): ");
			qt = sc.nextInt();

		} while (qt > 10);

		int[] vect = new int[qt];

		System.out.println("Informe os n�meros: ");
		for (int i = 0; i < vect.length; i++) {
			int valor = sc.nextInt();
			vect[i] = valor;

			if (vect[i] < 0) {
				control += 1;
			}
		}

		if (control > 0) {
			System.out.println("N�meros negativos: ");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
	}
}