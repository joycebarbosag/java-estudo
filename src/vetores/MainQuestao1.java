package vetores;

import java.util.Scanner;

public class MainQuestao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
		//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
		
		int qt;
		int control = 0;

		do {

			System.out.println("Informe a quantidade de números que serão lidos (até 10): ");
			qt = sc.nextInt();

		} while (qt > 10);

		int[] vect = new int[qt];

		System.out.println("Informe os números: ");
		for (int i = 0; i < vect.length; i++) {
			int valor = sc.nextInt();
			vect[i] = valor;

			if (vect[i] < 0) {
				control += 1;
			}
		}

		if (control > 0) {
			System.out.println("Números negativos: ");
			for (int i = 0; i < vect.length; i++) {
				if (vect[i] < 0) {
					System.out.println(vect[i]);
				}
			}
		}
	}
}