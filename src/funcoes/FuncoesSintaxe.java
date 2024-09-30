package funcoes;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {

		//com retorno
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		showResult(higher);
		
		//mais sofisticado:
		showResult(max(a,b,c));
		//se a func max já retorna um valor do tipo int, eu posso passar a própria func em showResult já que essa é uma func que espera receber um valor inteiro.
		
		sc.close();
	}
	
	//public porque outras classes serão chamadas e static pq não depende de criação de obj
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
	
	//quando uma função só devolve o resultado de uma ação, sem permitir que ele seja reaproveitado no programa, ela é do tipo void.
	public static void showResult(int value) {
		System.out.printf("Maior: %s", value);
	}

}
