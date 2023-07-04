package empresa;

public class Curso {
	String nome;
	double mensalidade;
	
	void info() {
		System.out.println("Nome Curso: "+nome);
		System.out.println("Mensalidade Curso: "+mensalidade);
	}

	public Curso(String nome, double mensalidade) {
		this.nome = nome;
		this.mensalidade = mensalidade;
	}
	
	
}
