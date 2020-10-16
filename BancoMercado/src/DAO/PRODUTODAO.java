package DAO;

import java.util.List;

import ENTIDADES.PRODUTO;

public interface PRODUTODAO {
	
	public void inserir(PRODUTO produto);
	
	public void alterar(PRODUTO produto);
	
	public void remover(int id_produto);
	
	public PRODUTO pesquisar(int id_produto);
	
	public List<PRODUTO> listarTodos();

}
