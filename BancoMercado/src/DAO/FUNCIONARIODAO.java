package DAO;

import java.util.List;

import ENTIDADES.FUNCIONARIO;

public interface FUNCIONARIODAO {
	
	public void inserir(FUNCIONARIO funcionario);
	
	public void alterar(FUNCIONARIO funcionario);
	
	public void remover(int id_funcionario);
	
	public FUNCIONARIO pesquisar(int id_funcionario);
	
	public List<FUNCIONARIO> listarTodos();

}
