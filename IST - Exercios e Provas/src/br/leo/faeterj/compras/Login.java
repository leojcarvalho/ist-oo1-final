package br.leo.faeterj.compras;

import java.util.List;
import java.util.Scanner;

public class Login {
	
	private Administrador admin;
	private boolean userLogado;
	public List<Usuario> listUser;
	private Usuario userLog;
	
	

	public Login(Administrador admin) {
		super();
		
		this.setAdmin(admin);
		this.userLogado = false;
		this.listUser = admin.getUsers();

	}
	public Login() {
		super();

	}
	

	public void solicitaLogin() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);  
		String log;
		int pwd;
        
        do {
        	System.out.println("Entre com seu login: ");
            log= entrada.next();
            
            System.out.println("Digite sua Senha: ");
            pwd = entrada.nextInt();
       
     
        	for (Usuario usr : listUser){
        		
        			try {
						if((usr.getNome().equals(log)) && (usr.getSenha() == pwd))
						    {	
								this.userLogado = true;
								System.out.printf("\nUsuario LOGADO\n");
						        
								this.userLog = usr;
								//System.out.printf("\nUsuario \n"+ this.userLog.getNome());
								break;
						          
						    }
					} catch (Exception e) {
						//e.printStackTrace();
						System.out.println("Erro Login: " + e.getMessage());
					} 		
        		
        	 }
         
        System.out.printf("\nUsuario senha Errados! Tente novamente!\n");
        } while (this.userLogado != true);

		
	}		


	public boolean isUserLogado() {
		return userLogado;
	}


	public void setUserLogado(boolean userLogado) {
		this.userLogado = userLogado;
	}

	public Usuario getUserLog() {
		return userLog;
	}

	public void setUserLog(Usuario userLog) {
		this.userLog = userLog;
	}
	public Administrador getAdmin() {
		return admin;
	}
	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
	
	



}

	