package br.leo.faeterj.compras;

import java.util.Scanner;

public class Pagamento {
	
	private boolean pgto;
	
	public Pagamento() {
		super();
		this.pgto = false;
	}

	public void solicitaPagamento() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);  
		int pg;
	    
		 do {
			System.out.println("PAGAMENTO: ");
	    	System.out.println("Informe os numeros do Cartão de Crédito: ");
	        pg= entrada.nextInt();
	        
	        if(pg != 0 ) {
	        	this.pgto = true;
	        	System.out.printf("\nCompra Finalizada com SUCESSO!!!!!!\n");
	        	break;
	        }else {
	        	
	        	System.out.printf("\nPreencha novamente os números do cartao!\n");
		    	break;
	        }
	        
		 } while (this.pgto != true);
	        
	      
	   
	 
	    	
	}
}
