package poo_aluno;

public class Aluno {

	public String nome;
	public double notaA, notaB, notaC;

	public String giveResult() {
		
		double total = notaA + notaB + notaC;
		String msg;
		
		 msg = (total >= 60.00) 
				 ? "Final grade: " + total + "\nPass." 
				 : "Final grade: " + total + "\nFailed.\nMissing: " + (100 - total);
		
		 return msg;
	}

}
