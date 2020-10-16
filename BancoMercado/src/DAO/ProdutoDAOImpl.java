package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ENTIDADES.PRODUTO;
import UTIL.JdbcUtil;

public class ProdutoDAOImpl implements PRODUTODAO{
	
	PRODUTO produto = new PRODUTO();

	@Override
	public void inserir(PRODUTO produto) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO PRODUTO (NOME_PRODUTO, QUANTIDADE)  VALUES (?, ?)";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, produto.getNomeProduto());
			ps.setInt(2, produto.getQuantidade());
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void alterar(PRODUTO produto) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE PRODUTO SET NOME_PRODUTO = ?, QUANTIDADE = ? WHERE ID_PRODUTO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, produto.getNomeProduto());
			ps.setInt(2, produto.getQuantidade());
			ps.setInt(3, produto.getId_produto());
			
			ps.execute();
			ps.close();
			conexao.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void remover(int id_produto) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM PRODUTO WHERE ID_PRODUTO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_produto);
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public PRODUTO pesquisar(int id_produto) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM PRODUTO WHERE ID_PRODUTO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_produto);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				produto.setId_produto(res.getInt("ID_PRODUTO"));
				produto.setNomeProduto(res.getString("NOME_PRODUTO"));
				produto.setQuantidade(res.getInt("QUANTIDADE"));
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return produto;
	}

	@Override
	public List<PRODUTO> listarTodos() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM PRODUTO";
		
		List<PRODUTO> listaProduto = new ArrayList<PRODUTO>();
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				produto = new PRODUTO();
				produto.setNomeProduto(res.getString("NOME_PRODUTO"));
				produto.setQuantidade(res.getInt("QUANTIDADE"));
				
				listaProduto.add(produto);
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return listaProduto;
	}

}
