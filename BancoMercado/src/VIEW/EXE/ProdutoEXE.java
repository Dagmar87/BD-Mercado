package VIEW.EXE;

import java.util.List;
import java.util.Scanner;

import DAO.PRODUTODAO;
import DAO.ProdutoDAOImpl;
import ENTIDADES.PRODUTO;

public class ProdutoEXE {
	
	Scanner scan = new Scanner(System.in);
	
	PRODUTODAO produtoDAO = new ProdutoDAOImpl();
	
	PRODUTO produtoCreate = new PRODUTO();
	
	PRODUTO produtoEdit = new PRODUTO();
	
	public void ProdutoInserir(){
		
		System.out.println("****** Inserir Produto ******");
		System.out.println("Insira o nome do produto: ");
		produtoCreate.setNomeProduto(scan.next());
		System.out.println("Insira a quantidade do produto: ");
		produtoCreate.setQuantidade(scan.nextInt());
		produtoDAO.inserir(produtoCreate);
		
	}
	
	public void ProdutoAlterar(){
		
		System.out.println("****** Alterar Produto ******");
		System.out.println("Insira o nome do produto: ");
		produtoEdit.setNomeProduto(scan.next());
		System.out.println("Insira a quantidade do produto: ");
		produtoEdit.setQuantidade(scan.nextInt());
		System.out.println("Insira o ID do produto válido para editar os dados : ");
		produtoEdit.setId_produto(scan.nextInt());
		produtoDAO.alterar(produtoEdit);
		
	}
	
	public void ProdutoListar(){
		
		System.out.println("****** Listar Produto ******");
		List<PRODUTO> listaProduto = produtoDAO.listarTodos();
		for(PRODUTO p : listaProduto){
			System.out.println("Nome do Produto: " + p.getNomeProduto()
			+ "| Quantidade: " + p.getQuantidade());
		}
		
	}
	
	public void ProdutoRemover(){
		
		System.out.println("****** Remover Produto ******");
		System.out.println("Insira o ID do produto que deseja remover: ");
		produtoDAO.remover(scan.nextInt());
	
	}

	public void ProdutoPesquisar(){
		
		System.out.println("****** Pesquisar Produto ******");
		System.out.println("Insira o ID do produto que deseja pesquisar: ");
		PRODUTO pro = produtoDAO.pesquisar(scan.nextInt());
		System.out.println("ID Produto: " + pro.getId_produto() 
		+ "| Nome do Produto: " + pro.getNomeProduto()
		+ "| Quantidade: " + pro.getQuantidade());
	
	}

}
