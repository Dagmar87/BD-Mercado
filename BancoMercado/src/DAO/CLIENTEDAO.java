package DAO;

import java.util.List;

import ENTIDADES.CLIENTE;

public interface CLIENTEDAO {
	
	public void inserir(CLIENTE cliente);
	
	public void alterar(CLIENTE cliente);
	
	public void remover(int id_cliente);
	
	public CLIENTE pesquisar(int id_cliente);
	
	public List<CLIENTE> listarTodos();

}
