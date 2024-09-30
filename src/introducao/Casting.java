package introducao;

public class Casting {

	public static void main(String[] args) {
	
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a/b;
		//coloco o "(double)" para o java entender que quero meu resultado em double, apesar de "a" e "b" serem int.
		System.out.println(resultado);

	}

}
