package poo_triangle;

public class Program {

	public static void main(String[] args) {
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		//acessa o atributo
		x.a = 4;
		x.b = 3;
		x.c = 6;
		
		y.a = 8;
		y.b = 16;
		y.c = 20;
		
		double somax = x.a + x.b + x.c;
		double somay = y.a + y.b + y.c;
		
		System.out.printf("Soma dos lados do tri‚ngulo x: %.0f%n", somax);
		System.out.printf("Soma dos lados do tri‚ngulo y: %.0f", somay);
		
		double areaX = x.area();
		double areaY = y.area();
		System.out.println("\n¡reas: " + areaX + " e " + areaY);
	}

}
