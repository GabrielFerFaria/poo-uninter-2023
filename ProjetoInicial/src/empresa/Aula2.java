package empresa;

import java.util.ArrayList;

public class Aula2 {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a.matricula = 100001;
		a.nome = "Mario";
		a.cpf = "111.222.333-44";
		
		Aluno b = new Aluno(100001,"SuperLuigi","222.333.555-57");
		
		
		a.info();
		b.info();
		
		Aluno c = new Aluno(10003);
		
		ArrayList<Aluno> alunos = new ArrayList();
		
		alunos.add(c);
		alunos.add(new Aluno(100004,"Bowser","777,888,999-10"));
	}

}