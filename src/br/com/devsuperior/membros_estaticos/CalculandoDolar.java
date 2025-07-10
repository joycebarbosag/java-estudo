package br.com.devsuperior.membros_estaticos;

public class CalculandoDolar {
	
	public static final double IOF = 0.06;
	
	public static double calcularDolar(double reais, double dolar) {
		
		double realEmDolar = reais * dolar;
		double imposto = realEmDolar * IOF;
		
		return realEmDolar + imposto;

	}
}
