package br.leo.faeterj.compras;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ManipulaArquivo {
	

	public static void leitor(String path, Loja l, Administrador adm) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        StringTokenizer st = null;
        String linha = null;
        
        String dado0;         // Se usuario - nome, se Produto - idProduto
        String dado1;         // Se usuario - email, se Produto - nome
        String dado2;        // Se usuario - senha, se Produto - valor
        String dado3;        // Apenas para Produto - tipo
        
        
       //Loja nova = new Loja();  
       //Administrador adm= new Administrador("Leo", "leo@leo", 123456 );
        
        while ((linha =  buffRead.readLine()) != null) {
         	// UTILIZA DELIMITADOR ; PARA DIVIDIR OS CAMPOS
            st = new StringTokenizer(linha, ";");
            String dados = null;
            
            while (st.hasMoreTokens()) {
            	
            	//Campo nome ou idProduto
            	dados = st.nextToken();
            	dado0 = dados;
            	//Campo email ou nome
            	dados = st.nextToken();
            	dado1 = dados;
            	// Campo senha ou valor
            	dados = st.nextToken();
            	dado2 = dados;
            	
            	
            	if(path.equals("/tmp/usuarios.txt")) {
            
	            	//System.out.println("Nome " + dado0
	            	//	+ "email " + dado1
	            	//	+ "senha " + dado2);
	            	
	            	//insere usuarios na Lista
	        		adm.adicionarUsuario(dado0, dado1, Integer.parseInt(dado2));
	        		//adm.removerUsuario("Jose");  
            	}else {
            		// Campo tipo
                	dados = st.nextToken();
                	dado3 = dados;	
            		//System.out.println("Produto " + dado0
    	            //		+ "nome " + dado1
    	            //		+ "valor " + dado2
    	            //		+ "tipo " + dado3);
    	            	
    	            	//insere usuarios na Lista    	
    	        		l.adicionarProduto(Integer.parseInt(dado0), dado1, Double.parseDouble(dado2), dado3);
    	        		//nova.removerProduto(2); //teste do método remover - OK
            		
            	}
        		
            }   
            
        } 
        if(path.equals("/tmp/usuarios.txt")) {
        	adm.exibirListaUsuarios();
        }else {
        	l.exibirListaProdutos();
        	l.escolherProduto();
        }
        
        
       buffRead.close();
    }
 
    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
 

}
