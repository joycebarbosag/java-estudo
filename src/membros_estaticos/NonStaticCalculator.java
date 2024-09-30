package membros_estaticos;

public class NonStaticCalculator {

	//final diz que é uma constante, valor que não muda.
	//constantes são sempre escristas 100% em maiúsculo.
	public final double PI = 3.14159;
	
	
	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
