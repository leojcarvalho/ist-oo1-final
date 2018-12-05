package br.leo.faeterj.compras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private int idCompra;
	private Usuario user;
	private double valorTotal;
	private List<ItensCarrinho> itens;
	
	public Carrinho(int id, Usuario user) {
		super();
		this.idCompra = id;
		this.user = user;
		this.valorTotal = 0;
		this.itens = new ArrayList<ItensCarrinho>();
	}
	
	public void adicionarItem(int id, Produto prod, int qtd) {
				
		try {
			ItensCarrinho item = new ItensCarrinho(id, prod, qtd, prod.getValor()); 
			this.itens.add(item);
				
			System.out.printf("\nProduto adicionado com sucesso ao carrinho");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Erro Carrinho: " + e.getMessage());
		}
		
	 }
	public void removerItem(int id) {
		
		// Removendo
		for (ItensCarrinho it : itens)
	    {
	        try {
				if(it.getIdItem() == id)
				{
				    // Encontrou produto
				    itens.remove(it); // Remove.
				    System.out.printf("Item removido da lista\n");
				    break;
				}
			} catch (Exception e) {
				
				System.out.println("Erro Item: " + e.getMessage());
			}
	    }
	
	}
	public void alterarQuantidade(int id, int novaQtde) {
		// alterando qtde de um determinado produto
	    for (ItensCarrinho it : itens)
	    {
	        try {
				if(it.getIdItem() == id)
				{
				    it.setQtd(novaQtde);// Altera.
				    System.out.printf("Item alterado da lista\n");
				    break;
				}
			} catch (Exception e) {
				System.out.println("Erro Produto: " + e.getMessage());
			}
	    }	
	}
	
	//Itens do Carrino
	public void produtosCarrinho() {
			
		System.out.println("\n----------------------------------------");
		//System.out.println("Usuário logado: " + this.user.getNome());	
		System.out.println("Produtos incluídos no carrinho: \n");	
		for (ItensCarrinho it : itens){
			try {
				
				System.out.println("Id Item: " + it.getIdItem()
							+ " Produto: " + it.getProduto().getNome()
							+ " Qtde: " + it.getQtd()
							+ " Valor " + it.getValor());
					
				valorTotal +=it.getValor();
			
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("Erro Carrinho: " + e.getMessage());
			}
			
		}
		System.out.println("\n VALOR TOTAL do Carrinho: " + valorTotal);
	}
	
	public void pagamento() {
		
		
	}
	
	
	
	//Getters and Setters
	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int id) {
		this.idCompra = id;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItensCarrinho> getItens() {
		return itens;
	}

	public void setItens(List<ItensCarrinho> itens) {
		this.itens = itens;
	}
	
	
	
}
