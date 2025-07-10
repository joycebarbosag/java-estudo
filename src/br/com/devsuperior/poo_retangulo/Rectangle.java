package br.com.devsuperior.poo_retangulo;

public class Rectangle {

	public double width;
	public double height;
	
	public double area(double w, double h) {
		return w * h;
	}
	
	public double perimetro(double w, double h) {
		return w * 2 + h * 2;
	}
	
	public double diagonal(double w, double h) {
		return Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
	}
}
