package br.leo.faeterj.compras;

public class ItensCarrinho {
	
	private int idItem;
	private Produto produto;
	private int qtd;
	private double valor;
	
	public ItensCarrinho(int id, Produto prod, int qt, double valor) {
		super();
		this.idItem= id;
		this.produto = prod;
		this.qtd = qt;
		this.setValor(valor);
	}
	
	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		
		this.valor = valor * this.getQtd();
	}
	
}
