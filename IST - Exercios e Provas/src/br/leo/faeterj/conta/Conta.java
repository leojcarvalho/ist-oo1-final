package br.leo.faeterj.conta;

public interface Conta {
	
	public abstract void estadoAtualConta();
	public abstract void abrirConta(String t);
	public abstract void fecharConta();
	public abstract double depositar(double valor, String h);
	public abstract double sacar(double valor, String h);
	public abstract void extratoConta();

}
