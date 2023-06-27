package empresa;

import java.util.ArrayList;

public class CriarTurma {
	public static void main(String[] args) {
		Turma nova = new Turma();
		
		nova.prof = new Professor();
		nova.prof.nome = "Leonardo";
		nova.alunos= new ArrayList();
		nova.alunos.add(new Aluno());
		nova.alunos.get(0).nome= "Super Mario";
	}
}
