package br.leo.faeterj.compras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Loja implements Site {
	
	private int tolalProdutos;
	private List<Produto> produtos;
	//private Usuario users;
	//private Administrador admin;
 
	
	public Loja() {
		super();
		this.produtos = new ArrayList<Produto>();
	}

		
	public void adicionarProduto(int idProd, String nome, double v, String t) {
		
		Produto prod = new Produto(idProd, nome, v, t); 
		this.produtos.add(prod);
		this.tolalProdutos +=1;
			
		//System.out.printf("Novo Produto adicionado a lista\n");
	 }
	
	public void removerProduto(int idProd) {
		// Removendo
		for(Produto prd : produtos)
		{
	        try {

				if(prd.getIdProduto() == idProd)
				{
				    // Encontrou produto
					produtos.remove(prd); // Remove.
					this.tolalProdutos -=1;
					//System.out.printf("Novo Produto removida da lista\n");
				    break;
				}
			} catch (Exception e) {
				
				//e.printStackTrace();
				System.out.println("Erro Produto: " + e.getMessage());
			}
	    }
		
	}
	
	
	public void exibirListaProdutos() {
		System.out.println("---------------------------------");
		System.out.printf("Lista de Produtos disponíveis:\n\n");
		
			for (Produto prd : produtos){		
				try {
					System.out.println("Id Item: " + prd.getIdProduto()
							+ " Produto: " + prd.getNome()
							+ " Valor " + prd.getValor()
							+ " Tipo " + prd.getTipo());
				} catch (Exception e) {
					
					//e.printStackTrace();
					System.out.println("Erro Produto: " + e.getMessage());
				}
			}
		
		System.out.printf("\nTotal de Produtos: " + this.getTolalProdutos());
		System.out.printf("\n");
	}
	
	
	 	
	public void escolherProduto() {
		
		//Busca usuario Logado
		Login lg = new Login();
		Usuario u = lg.getUserLog();
		
		//Usuario u = new Usuario("Jose", "jose@uol.com.br", 22335578);
	
		//Cria carrinho
		Carrinho c = new Carrinho(1,u);
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
        int prod, qtde;
        char opcao;
        do {
        	System.out.println("\n----------------------------------------");
        	System.out.println("\nCARRINHO DE COMPRAS");
        	System.out.println("Digite o código do produto que deseja comprar: ");
            prod = entrada.nextInt();
            
            System.out.println("Digite a quantidade desejada do Produto escolhido: ");
            qtde = entrada.nextInt();
       
     
        	for (Produto pdt : produtos){
        			
        			try {
						if(pdt.getIdProduto() == prod)
						    {	
								c.adicionarItem(prod, pdt, qtde);

						        break;
						    }
					} catch (Exception e) {
						//e.printStackTrace();
						System.out.println("Erro Produto: " + e.getMessage());
					} 		
        		
        	 }

        //c.removerItem(2);
        //c.alterarQuantidade(1, 5);
        c.produtosCarrinho();
        	   	
        	//System.out.printf("O produto de foi inserido no carrinho, código: " + prod + "\n");
		
        opcao = ' '; // limpa o valor 
     
        
          System.out.print("\nDeseja inserir mais produtos (S / N)? : ");
          opcao = entrada.next().charAt(0);
        
        
        } while (opcao == 's' || opcao == 'S');
	}


	//Getters and Setters
	public int getTolalProdutos() {
		return tolalProdutos;
	}

	public void setTolalProdutos(int tolalProdutos) {
		this.tolalProdutos = tolalProdutos;
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}




}
