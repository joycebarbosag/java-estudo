package strings;

public class FuncoesParaStrings {

	public static void main(String[] args) {
		
		String org = "Joyce Emanuelli  ";
		String s1 = org.toLowerCase();
		String s2 = org.toUpperCase();
		String s3 = org.trim();
		//substring é a partir do caracter x, até o caracter antes de y (caso especificado)
		String s4 = org.substring(2);
		String s5 = org.substring(2,8);
		String s6 = org.replace('j', 'X');
		//para garantir que vai ler o "j" minúsculo:
		String s7 = org.toLowerCase().replace('j', 'X').trim();
		
		//retorna a primeira posição do caracter que passo de parâmetro
		int i = org.indexOf("e");
		
		//retorna a última posição do caracter que passo de parâmetro
		int x = org.lastIndexOf("e");
		
		System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s, %s", s1, s2,s3,s4,s5,s6,s7, i, x);
		
		//split = recorta uma string com base em um separador e joga em uma variável
		String s = "Joyce Emanuelli";
		String[] vec = s.split(" ");
		System.out.println(vec.length);
		for (int c=0; c<vec.length; c++) {
			System.out.println(vec[c]);
		}

	}

}
