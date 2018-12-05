package br.leo.faeterj.compras;

import java.util.ArrayList;
import java.util.List;


public class Administrador extends Pessoa {
	
	private String turno;
	private double salario;
	public List<Usuario> users;
	
	

	public Administrador(String nome, String email, int senha) {
		super(nome, email, senha);
		this.turno= "Integral";
		this.salario = 1000;
		this.users = new ArrayList<Usuario>();
	}
	
	public void adicionarUsuario(String n, String email, int s) {
		
		Usuario user = new Usuario(n, email, s);
		this.users.add(user);	
		System.out.printf("Novo Usuário incluído\n");
	 }
	
	public void removerUsuario(String n) {
		// Removendo
				for(Usuario u : users)
				{
			        try {

						if(u.getNome().equals(n))
						{
						    // Encontrou produto
							users.remove(u); // Remove.
							System.out.printf("Usuario removido da lista\n");
						    break;
						}
					} catch (Exception e) {
						
						//e.printStackTrace();
						System.out.println("Erro usuario: " + e.getMessage());
					}
			    }
	}
	
	public void exibirListaUsuarios() {
		System.out.println("\n----------------------------------------");
		System.out.printf("Lista de Usuarios Cadastrados:\n\n");
		
			for (Usuario usr : users){		
				try {
					System.out.println("Nome: " + usr.getNome()
							+ " Email: " + usr.getEmail()
							+ " Senha: " + usr.getSenha());
				} catch (Exception e) {
					
					//e.printStackTrace();
					System.out.println("Erro Produto: " + e.getMessage());
				}
			}
		
		
		System.out.printf("\n");
	}
	
	//Getters and Setters
	
	public double getSalario() {
		return salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public List<Usuario> getUsers() {
		return users;
	}

	public void setUsers(List<Usuario> users) {
		this.users = users;
	}
	
	
	

}
