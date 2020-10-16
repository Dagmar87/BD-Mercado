package DAO;

import java.util.List;

import ENTIDADES.VENDA;

public interface VENDADAO {
	
	public void inserir(VENDA venda);
	
	public void alterar(VENDA venda);
	
	public void remover(int id_venda);
	
	public VENDA pesquisar(int id_venda);
	
	public List<VENDA> listarTodos();

}
