package br.leo.faeterj.matricula;

public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	

	
	public Aluno(String nome2, int idade2, String sexo2, int matricula, String curso) {
		super(nome2, idade2, sexo2);
		this.matricula = matricula;
		this.curso = curso;
	}


	//Getters and Setters
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
