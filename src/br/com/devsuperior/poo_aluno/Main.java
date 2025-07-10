package br.com.devsuperior.poo_aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = sc.next();
		
		System.out.println("Informe as tr�s notas: ");
		aluno.notaA = sc.nextDouble();
		aluno.notaB = sc.nextDouble();
		aluno.notaC = sc.nextDouble();
		
		System.out.println(aluno.giveResult());
		
		sc.close();
		
	}

}
