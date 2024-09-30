package poo_triangle;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	//criar um método que calcula área de triangulo delega à classe a responsabilidade de realizar os métodos que estão vinculadas a ela
	//modificador de acesso + tipo da função + nome da função + parâmetros que a função precisa receber
	//como não vou receber nada além do que já está em minha classe, não preciso colocar a, b e c como atributos da função pois eles já estão na classe.
	public double area() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p * (p-a)*(p-b)*(p-c));
		
		//ou: double result = Math.sqrt(p * (p-a)*(p-b)*(p-c));
		//return result;
	}
}
