package VIEW.EXE;

import java.util.List;
import java.util.Scanner;

import DAO.FUNCIONARIODAO;
import DAO.FuncionarioDAOImpl;
import ENTIDADES.FUNCIONARIO;

public class FuncionarioEXE {
	
	Scanner scan = new Scanner(System.in);
	
	FUNCIONARIODAO funcionarioDAO = new FuncionarioDAOImpl();
	
	FUNCIONARIO funcCreate = new FUNCIONARIO();
	
	FUNCIONARIO funEdit = new FUNCIONARIO();
	
	public void FuncionarioInserir(){
		
		System.out.println("****** Inserir Funcionario ******");
		System.out.println("Insira o nome do funcionario: ");
		funcCreate.setNomeFuncionario(scan.next());
		System.out.println("Insira o salario do funcionario: ");
		funcCreate.setSalarioFuncionario(scan.nextDouble());
		funcionarioDAO.inserir(funcCreate);
		
	}
	
	public void FuncionarioAlterar(){
		
		System.out.println("****** Alterar Funcionario ******");
		System.out.println("Insira o nome do funcionario: ");
		funEdit.setNomeFuncionario(scan.next());
		System.out.println("Insira o salario do funcionario: ");
		funEdit.setSalarioFuncionario(scan.nextDouble());
		System.out.println("Insira o ID do funcionario válido para editar os dados : ");
		funEdit.setId_funcionario(scan.nextInt());
		funcionarioDAO.alterar(funEdit);
		
	}
	
	public void FuncionarioListar(){
		
		System.out.println("****** Listar Funcionario ******");
		List<FUNCIONARIO> listaFuncionario = funcionarioDAO.listarTodos();
		for(FUNCIONARIO f: listaFuncionario){
			System.out.println("Nome do Funcionario: " + f.getNomeFuncionario()
				+ "| Salario do Funcionario: " + f.getSalarioFuncionario());
		}
		
	}
	
	public void FuncinarioRemover(){
		
		System.out.println("****** Remover Funcionario ******");
		System.out.println("Insira o ID do funcionario que deseja remover: ");
		funcionarioDAO.remover(scan.nextInt());
		
	}
	
	public void FuncionarioPesquisar(){
		
		System.out.println("****** Pesquisar Funcionario ******");
		System.out.println("Insira o ID do funcionario que deseja pesquisar: ");
		FUNCIONARIO func = funcionarioDAO.pesquisar(scan.nextInt());
		System.out.println("ID Funcionario: " + func.getId_funcionario()
				+"| Nome do Funcionario: " + func.getNomeFuncionario()
				+ "| Salario do Funcionario: " + func.getSalarioFuncionario());
		
	}

}
