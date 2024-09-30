package introducao;

import java.util.Scanner;

public class InputDados {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		String nome, sobrenome;
		int idade;
		
		System.out.println("Digite seu nome:");
		nome = sc.next();
		System.out.println("Digite seu sobrenome:");
		sobrenome = sc.next();
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();
		System.out.printf("Nome: %s%nSobrenome: %s%nIdade: %d", nome, sobrenome, idade);
		
		//Para pegar variáveis tipo char:
		char gender;
		System.out.printf("%nDigite seu gênero (F para mulher e M para homem):");
		gender = sc.next().charAt(0);
		System.out.printf("Seu gênero é: %c", gender);
	}

}
