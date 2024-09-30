package poo_funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		funcionario.nome = sc.next();
		
		System.out.println("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.println("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Em quanto deseja aumentar o salário?");
		double increase = sc.nextDouble();
		
		System.out.println("Salário antes do aumento: " +  funcionario.netSalary());
		
		funcionario.increaseSalary(increase);
		System.out.println("Após aumento: " + funcionario);

		sc.close();
	}

}
