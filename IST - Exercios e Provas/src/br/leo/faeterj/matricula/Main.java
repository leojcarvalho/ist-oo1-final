package br.leo.faeterj.matricula;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor p1 = new Professor("Andre", 55, "M", "OO1", 5000 );
		Turma turma = new Turma("OO1 Noite",p1, "Orientaçao a Objeto Java");
		
		
		
		Aluno a1 = new Aluno("João",41, "M", 123, "Artes");
		turma.matricular(a1);
		
		Aluno a2 = new Aluno("Maria", 33, "F", 456, "Biologia");
		turma.matricular(a2);
		
		Aluno a3 = new Aluno("José", 34,"M", 568,"Portugues");
		turma.matricular(a3);
		
		Aluno a4 = new Aluno("Antônio", 30,"M", 743, "Mat2");
		turma.matricular(a4);
		
		Aluno a5 = new Aluno("Carlos", 25,"M", 643, "Mat1");
		turma.matricular(a5);
		
		
		turma.listaTurma();

	}

}
