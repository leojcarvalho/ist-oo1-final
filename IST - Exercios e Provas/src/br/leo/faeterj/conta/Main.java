package br.leo.faeterj.conta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c1 = new ContaCorrente(1,"cc","Joao");
		c1.abrirConta("cc");
		
		ContaCorrente c2 = new ContaCorrente(2,"cp","Maria");
		c2.abrirConta("cp");
		
		
		c1.depositar(1000, "Abertura de conta");
		c1.sacar(100, "Saque no Cartão");
		c1.sacar(153.20, "Pagamento no cartão");
		
		c1.depositar(550, "Crédito em conta corrente");
		c1.sacar(720, "Pagamento no cartão");
		
		c1.fecharConta();
		
		
		
		c1.estadoAtualConta();
		c2.estadoAtualConta();
		
		c1.extratoConta();
	}

}
