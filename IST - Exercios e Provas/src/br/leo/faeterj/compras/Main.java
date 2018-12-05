package br.leo.faeterj.compras;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Usuario[] user = new Usuario[5];
		//Produto[] prd = new Produto[20];
		
		//Loja
		//Loja lj = new Loja();
		
		//Arquivos
		
		String userPath = "/tmp/usuarios.txt";
		String prdPath = "/tmp/produtos.txt";
		
		//Nova Loja
		Loja extra = new Loja();
		//Admin
		Administrador adm = new Administrador("Leo", "leo@leo", 123456 );
		
		//Carrega Usuarios 
		ManipulaArquivo.leitor(userPath,extra, adm);
		
		//Login
		Login l = new Login(adm);
		l.solicitaLogin();
		//Recuera usuario logado
		l.getUserLog();
		
		
		//Carrega Produtos
		ManipulaArquivo.leitor(prdPath,extra, adm);
		
		//Pgto
		Pagamento p = new Pagamento();
		p.solicitaPagamento();
		
		
		
		
		
		
		
		//Usuários
		//Usuario user = new Usuario("Jose", "jose@uol.com.br", 22335578);
		
	//Usuario[] u = new Usuario[5];
		//u[0] =  new Usuario("Jose", "jose@uol.com.br", 22335578);
		
		
		
		//Loja
		//Loja extra = new Loja();
		
		//extra.adicionarUsuario("Jose", "jose@uol.com.br", 22335578);
		//extra.adicionarUsuario("Maria", "maria@uol.com.br", 114466178);
		
		//extra.exibirListaUsuarios();
		
		//extra.adicionarProduto(1, "Balde", 50, "Limpeza");
		//extra.adicionarProduto(2, "Toalha", 30, "Cama e mesa");
		//extra.adicionarProduto(3, "Televisão", 250, "Eletronicos");
		//extra.adicionarProduto(4, "Banana", 5, "Fruta");
		//extra.removerProduto(3);
		//extra.exibirListaProdutos();
		//extra.escolherProduto();
		
		//Carrinho
		//Carrinho car = new Carrinho(1, u);
		
		
		//Produto prod1 = new Produto(1, "Balde", 50, "Limpeza");
		//Produto prod2 = new Produto(2, "Toalha", 30, "Cama e mesa");
		
		
		//car.adicionarItem(prod1.getIdProduto(), prod1, 3);
		//car.adicionarItem(prod2.getIdProduto(), prod2, 1);	
		//car.removerItem(2);
		//car.alterarQuantidade(1, 5);
		
		
		//car.produtosCarrinho();
		
	
		
		
	}

}
