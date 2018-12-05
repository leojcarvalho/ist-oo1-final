package br.leo.faeterj.compras;

public class Usuario extends Pessoa {
	

	private boolean status; //logado - deslogado
	
	public Usuario(String nome, String email, int senha) {
		super(nome, email, senha);
		this.status = true;
	}
	
	//Getters and Setters

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
	
	
}
