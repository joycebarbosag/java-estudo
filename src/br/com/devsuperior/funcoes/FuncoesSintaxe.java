package br.com.devsuperior.funcoes;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {

		//com retorno
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		showResult(higher);
		
		//mais sofisticado:
		showResult(max(a,b,c));
		//se a func max j� retorna um valor do tipo int, eu posso passar a pr�pria func em showResult j� que essa � uma func que espera receber um valor inteiro.
		
		sc.close();
	}
	
	//public porque outras classes ser�o chamadas e static pq n�o depende de cria��o de obj
	public static int max(int a, int b, int c) {
		int aux;
		if (a > b && a > c) {
			aux = a;
		}else if (b > c && b > a) {
			aux = b;
		}else {
			aux = c;
		}
		return aux;
	}
	
	//quando uma fun��o s� devolve o resultado de uma a��o, sem permitir que ele seja reaproveitado no programa, ela � do tipo void.
	public static void showResult(int value) {
		System.out.printf("Maior: %s", value);
	}

}
