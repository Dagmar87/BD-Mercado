package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ENTIDADES.CLIENTE;
import UTIL.JdbcUtil;

public class ClienteDAOImpl implements CLIENTEDAO{
	
	CLIENTE cliente = new CLIENTE();

	@Override
	public void inserir(CLIENTE cliente) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO CLIENTE (NOME_CLIENTE) VALUES (?)";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, cliente.getNomeCliente());
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void alterar(CLIENTE cliente) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE CLIENTE SET NOME_CLIENTE = ? WHERE ID_CLIENTE = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, cliente.getNomeCliente());
			ps.setInt(2, cliente.getId_cliente());
			
			ps.execute();
			ps.close();
			conexao.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void remover(int id_cliente) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM CLIENTE WHERE ID_CLIENTE = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_cliente);
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public CLIENTE pesquisar(int id_cliente) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM CLIENTE WHERE ID_CLIENTE = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_cliente);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				cliente.setId_cliente(res.getInt("ID_CLIENTE"));
				cliente.setNomeCliente(res.getString("NOME_CLIENTE"));
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return cliente;
	}

	@Override
	public List<CLIENTE> listarTodos() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM CLIENTE";
		
		List<CLIENTE> listaCliente = new ArrayList<CLIENTE>();
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				cliente = new CLIENTE();
				cliente.setNomeCliente(res.getString("NOME_CLIENTE"));
				
				listaCliente.add(cliente);
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return listaCliente;
	}
	
}
