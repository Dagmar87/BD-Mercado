package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ENTIDADES.VENDA;
import UTIL.JdbcUtil;

public class VendaDAOImpl implements VENDADAO{
	
	VENDA venda = new VENDA();

	@Override
	public void inserir(VENDA venda) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO VENDA (ID_CLIENTE, ID_PRODUTO, ID_FUNCIONARIO) VALUES (?, ?, ?)";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, venda.getId_cliente());
			ps.setInt(2, venda.getId_produto());
			ps.setInt(3, venda.getId_funcionario());

			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void alterar(VENDA venda) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE VENDA SET ID_CLIENTE = ?,  ID_PRODUTO = ?, ID_FUNCIONARIO = ? WHERE ID_VENDA = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, venda.getId_cliente());
			ps.setInt(2, venda.getId_produto());
			ps.setInt(3, venda.getId_funcionario());
			ps.setInt(4, venda.getId_venda());

			ps.execute();
			ps.close();
			conexao.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void remover(int id_venda) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM VENDA WHERE ID_VENDA = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_venda);
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();			
			
		}
		
	}

	@Override
	public VENDA pesquisar(int id_venda) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM VENDA WHERE ID_VENDA = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_venda);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				venda.setId_venda(res.getInt("ID_VENDA"));
				venda.setId_cliente(res.getInt("ID_CLIENTE"));
				venda.setId_produto(res.getInt("ID_PRODUTO"));
				venda.setId_funcionario(res.getInt("ID_FUNCIONARIO"));
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();	
			
		}
		
		return venda;
	}

	@Override
	public List<VENDA> listarTodos() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM VENDA";
		
		List<VENDA> listaVenda = new ArrayList<VENDA>();
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				venda = new VENDA();
				venda.setId_cliente(res.getInt("ID_CLIENTE"));
				venda.setId_produto(res.getInt("ID_PRODUTO"));
				venda.setId_funcionario(res.getInt("ID_FUNCIONARIO"));
				
				listaVenda.add(venda);
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return listaVenda;
	}

}
