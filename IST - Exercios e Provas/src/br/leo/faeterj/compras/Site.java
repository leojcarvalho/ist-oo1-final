package br.leo.faeterj.compras;

public interface Site {
	
		
	public abstract void adicionarProduto(int idProd, String nome, double v, String t);
	
	public abstract void removerProduto(int idProd);
	
	public abstract void exibirListaProdutos();
	
	public abstract void escolherProduto();

}
