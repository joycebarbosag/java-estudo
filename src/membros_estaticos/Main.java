package membros_estaticos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//como não criei os métodos como static, eu só posso chamar se instanciar a classe
		NonStaticCalculator calc = new NonStaticCalculator();
		System.out.println("Insira o valor do raio: ");
		double radius = sc.nextDouble();
		
		//lidando com objetos
		double c = calc.circunference(radius);
		double v = calc.volume(radius);
		
		System.out.printf("Circunferência: %.2f%nVolume: %.2f%nValor de PI: %.2f%n", c, v, calc.PI);
		
		//sem instancias objeto:
		System.out.println(" ****************************************** ");
		
		//estou chamando os metodos diretamente pela classe, independente de objetos.
		double c2 = StaticCalculator.circumference(radius);
		double v2 = StaticCalculator.volume(radius);
		
		System.out.printf("Circunferência: %.2f%nVolume: %.2f%nValor de PI: %.2f%n", c2, v2, StaticCalculator.PI);
	}

}
