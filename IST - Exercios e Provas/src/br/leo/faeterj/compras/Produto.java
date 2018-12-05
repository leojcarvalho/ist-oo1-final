package br.leo.faeterj.compras;


public class Produto {
	private int idProduto;
	private String nome;
	private double valor;
	private String tipo;
	
	public Produto(int idProduto, String nome, double valor, String tipo) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
	}

	
	//Getters and Setters
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}




