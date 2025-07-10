package br.com.devsuperior.poo_triangle;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	//criar um m�todo que calcula �rea de triangulo delega � classe a responsabilidade de realizar os m�todos que est�o vinculadas a ela
	//modificador de acesso + tipo da fun��o + nome da fun��o + par�metros que a fun��o precisa receber
	//como n�o vou receber nada al�m do que j� est� em minha classe, n�o preciso colocar a, b e c como atributos da fun��o pois eles j� est�o na classe.
	public double area() {
		double p = (a+b+c)/2.0;
		return Math.sqrt(p * (p-a)*(p-b)*(p-c));
		
		//ou: double result = Math.sqrt(p * (p-a)*(p-b)*(p-c));
		//return result;
	}
}
