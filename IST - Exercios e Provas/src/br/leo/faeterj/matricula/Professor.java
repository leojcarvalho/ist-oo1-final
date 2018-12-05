package br.leo.faeterj.matricula;

public class Professor extends Pessoa{
	
	
	private String materia;
	private float salario;
	
	public Professor(String nome2, int idade2, String sexo2, String materia, float salario) {
		super(nome2, idade2, sexo2);
		this.materia = materia;
		this.salario = salario;
	}
	
	//Getters and Setters
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	

}
