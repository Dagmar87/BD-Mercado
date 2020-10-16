package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ENTIDADES.FUNCIONARIO;
import UTIL.JdbcUtil;

public class FuncionarioDAOImpl implements FUNCIONARIODAO{
	
	FUNCIONARIO funcionario = new FUNCIONARIO();

	@Override
	public void inserir(FUNCIONARIO funcionario) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO FUNCIONARIO (NOME_FUNCIONARIO, SALARIO_FUNCIONARIO) VALUES (?, ?)";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, funcionario.getNomeFuncionario());
			ps.setDouble(2, funcionario.getSalarioFuncionario());
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void alterar(FUNCIONARIO funcionario) {
		// TODO Auto-generated method stub
		
		String sql = "UPDATE FUNCIONARIO SET NOME_FUNCIONARIO = ?,  SALARIO_FUNCIONARIO = ? WHERE ID_FUNCIONARIO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, funcionario.getNomeFuncionario());
			ps.setDouble(2, funcionario.getSalarioFuncionario());
			ps.setInt(3, funcionario.getId_funcionario());
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public void remover(int id_funcionario) {
		// TODO Auto-generated method stub
		
		String sql = "DELETE FROM FUNCIONARIO WHERE ID_FUNCIONARIO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_funcionario);
			
			ps.execute();
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

	@Override
	public FUNCIONARIO pesquisar(int id_funcionario) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM FUNCIONARIO WHERE ID_FUNCIONARIO = ?";
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setInt(1, id_funcionario);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				funcionario.setId_funcionario(res.getInt("ID_FUNCIONARIO"));
				funcionario.setNomeFuncionario(res.getString("NOME_FUNCIONARIO"));
				funcionario.setSalarioFuncionario(res.getDouble("SALARIO_FUNCIONARIO"));
				
			}
			
			ps.close();
			conexao.close();
				
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return funcionario;
	}

	@Override
	public List<FUNCIONARIO> listarTodos() {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM FUNCIONARIO";
		
		List<FUNCIONARIO> listaFuncionario = new ArrayList<FUNCIONARIO>();
		
		Connection conexao;
		
		try {
			
			conexao = JdbcUtil.getConexao();
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()){
				
				funcionario = new FUNCIONARIO();
				funcionario.setNomeFuncionario(res.getString("NOME_FUNCIONARIO"));
				funcionario.setSalarioFuncionario(res.getDouble("SALARIO_FUNCIONARIO"));
				
				listaFuncionario.add(funcionario);
				
			}
			
			ps.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();			
			
		}
		
		return listaFuncionario;
	}
	
}
