package br.leo.faeterj.conta;

public class Movimentacao {
	private double valor;
	private String historico;
	private String tipo; // Credito - credito deposito, DConta - Debito conta corrente DCartao - Pagamento cartao
	
	public Movimentacao(double valor, String historico, String tipo) {
		super();
		this.valor = valor;
		this.historico = historico;
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
