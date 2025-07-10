package br.com.devsuperior.condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia;
		String retorno;
		
		System.out.println("Informe um n�mero para saber o dia da semana: ");
		dia = sc.nextInt();
		
		switch(dia) {
		case 1:
			retorno = "Domingo.";
			break;
		case 2:
			retorno = "Segunda.";
			break;
		case 3:
			retorno = "Ter�a.";
			break;
		case 4:
			retorno = "Quarta.";
			break;
		case 5:
			retorno = "Quinta.";
			break;
		case 6:
			retorno = "Sexta.";
			break;
		case 7:
			retorno = "S�bado.";
			break;
		default:
			retorno = "Valor inv�lido";
			break;
		}
		
		System.out.printf("O dia da semana �: %s", retorno);
		sc.close();

	}

}
