package br.leo.faeterj.matricula;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nome;
	private Professor prof;
	private String disciplina;
	private List<Aluno> matriculados;
	
	public Turma(String n,Professor professor,String disc) {
		super();
		this.setNome(n);
		this.setProf(professor);
		this.setDisciplina(disc);	
		this.setMatriculados(new ArrayList<Aluno>());
	}
	
	
	
	
	
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}
	
	public void listaTurma() {
		System.out.println("Professor: " + this.prof.getNome());
		System.out.println("Disciplina: " + this.getDisciplina());

		System.out.println("Aluno relacionado da turma: " + this.getNome());
		
		for (Aluno aluno : this.getMatriculados()){
			System.out.println("Nome: " + aluno.getNome() 
					+ " Matricula: " + aluno.getMatricula()
					);
		}
	}
	
	//Getters and Setters
		public Professor getProf() {
			return prof;
		}

		public void setProf(Professor prof) {
			this.prof = prof;
		}

		public List<Aluno> getMatriculados() {
			return matriculados;
		}

		public void setMatriculados(List<Aluno> matriculados) {
			this.matriculados = matriculados;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(String disciplina) {
			this.disciplina = disciplina;
		}
}
