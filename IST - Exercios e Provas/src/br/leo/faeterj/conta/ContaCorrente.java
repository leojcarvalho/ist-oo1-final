package br.leo.faeterj.conta;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente implements Conta {
	
	 public int numConta;
	 protected String tipo; //cc conta-corrente cp - conta poupança
	 private String nome;
	 private double saldo;
	 private boolean status; //true or false
	 private List<Movimentacao> movimentado;
	 	 
	 

	 public ContaCorrente(int numConta, String tipo, String nome) {
			super();
			this.numConta = numConta;
			this.tipo = tipo;
			this.nome = nome;
			this.status = false;
			this.saldo = 0;
			this.movimentado = new ArrayList<Movimentacao>();
		}
	
	public void estadoAtualConta() {
		
		String statusConta;
		if(this.isStatus()) {
			statusConta = "Aberta";
		}else {statusConta = "Fechada";}
		
		System.out.println("------------------------");
		System.out.println("Número Conta: " +this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Saldo Atual: " +this.getSaldo());
		System.out.println("Status da Conta: " + statusConta);
	
	}

	public void abrirConta(String t) {
		
		this.setTipo(t);
		this.setStatus(true);	 
		 
		System.out.println("Conta aberta com sucesso!");
		 
	 }
	 

	public void fecharConta() {
		 
		 if(this.getSaldo() > 0) {
			 System.out.println("Conta não pode ser fechada pois ainda possui saldo de: " + this.getSaldo());
			
		 } else if(this.getSaldo() < 0) {
			 System.out.println("Conta não pode ser fechada pois possui saldo devedor de: " + this.getSaldo());
	
		 }else {
			 this.setStatus(false);
			 System.out.println("Conta encerrada com sucesso!");
			 
		 }		 
		 
	 }

	 public double depositar(double valor, String h) {
		 if(this.isStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			
			Movimentacao mov = new Movimentacao(valor, h, "Crédito");
			this.movimentado.add(mov);
			
			 System.out.printf("Depósito realizado com sucesso na conta de %s, no valor de %.2f\n", this.getNome(),valor);
		 }else {
			 System.out.println("Depósito não permitada, a conta informada não existe\n");
		
		 }
		 
		 return this.saldo;
	 }
	 
	 public double sacar(double valor, String h) {
		 if(this.isStatus()){
			 
			 if (this.getSaldo() >= valor) { 
				 this.setSaldo(this.getSaldo() - valor);
				 
				 Movimentacao mov = new Movimentacao(valor, h, "Débito");
				 this.movimentado.add(mov);
			 
			 	
			 	System.out.printf("Retirada realizado na conta de %s, no valor de %.2f\n", this.getNome(),valor);
			 }else {
			 		System.out.println("Saldo insuficinete para saque");
			 	}
			 
			 
			 
		 }else {
			 System.out.println("Retirada náo permitada, a conta informada não existe\n");

		 }	
		 return this.saldo;
		 		 
	 }
	 
	 //Extrato de conta
	 public void extratoConta() {
		 	System.out.println("------------------------");
			for (Movimentacao mov : movimentado){
				System.out.println("Historico: " + mov.getHistorico() 
						+ " Valor: " + mov.getValor()
						+ "  " + mov.getTipo());
			}
		}
	 
	 
	 //Getters and Setters
	 
	 public int getNumConta() {
			return numConta;
		}

		public void setNumConta(int numConta) {
			this.numConta = numConta;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String dono) {
			this.nome = dono;
		}

		public boolean isStatus() {
			return status;
		}

		public void setStatus(boolean status) {
			this.status = status;
		}
		 public double getSaldo() {
				return saldo;
		}

		public void setSaldo(double saldo) {
				this.saldo = saldo;
		}


}

