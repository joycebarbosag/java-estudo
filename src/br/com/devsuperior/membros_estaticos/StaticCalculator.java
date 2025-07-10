package br.com.devsuperior.membros_estaticos;

public class StaticCalculator {
	 
	//Os valores dos c�lculos n�o mudam para calculadoras diferentes, ou seja, s�o calculos est�ticos assim como o valor de PI.
	
	public static final double PI = 3.14159;
	
	
	//a fun��o pode ser calculada independente de objetos
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
