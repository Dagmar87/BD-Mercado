package VIEW.EXE;

import java.util.List;
import java.util.Scanner;

import DAO.VENDADAO;
import DAO.VendaDAOImpl;
import ENTIDADES.VENDA;

public class VendaEXE {
	
	Scanner scan = new Scanner(System.in);
	
	VENDADAO vendaDAO = new VendaDAOImpl();
	
	VENDA vendaCreate = new VENDA();
	
	VENDA vendaEdit = new VENDA();
	
	public void VendaInserir(){
		
		System.out.println("****** Inserir Venda ******");
		System.out.println("Insira o id do cliente: ");
		vendaCreate.setId_cliente(scan.nextInt());
		System.out.println("Insira o id do produto: ");
		vendaCreate.setId_produto(scan.nextInt());
		System.out.println("Insira o id do funcionario: ");
		vendaCreate.setId_funcionario(scan.nextInt());
		vendaDAO.inserir(vendaCreate);		
		
	}
	
	public void VendaAlterar(){
		
		System.out.println("****** Alterar Venda ******");
		System.out.println("Insira o id do cliente: ");
		vendaEdit.setId_cliente(scan.nextInt());
		System.out.println("Insira o id do produto: ");
		vendaEdit.setId_produto(scan.nextInt());
		System.out.println("Insira o id do funcionario: ");
		vendaEdit.setId_funcionario(scan.nextInt());
		System.out.println("Insira o ID da venda válida para editar os dados : ");
		vendaEdit.setId_venda(scan.nextInt());
		vendaDAO.alterar(vendaEdit);
		
	}
	
	public void VendaListar(){
		
		System.out.println("****** Listar Venda ******");
		List<VENDA> listaVenda = vendaDAO.listarTodos();
		for(VENDA v: listaVenda){
			System.out.println("ID Cliente: " + v.getId_cliente()
			+ "| ID Produto: " + v.getId_produto()
			+ "| ID Funcionario: " + v.getId_funcionario());
		}
		
	}
	
	public void VendaRemover(){
		
		System.out.println("****** Remover Venda ******");
		System.out.println("Insira o ID da venda que deseja remover: ");
		vendaDAO.remover(scan.nextInt());
		
	}
	
	public void VendaPesquisar(){
		
		System.out.println("****** Pesquisar Venda ******");
		System.out.println("Insira o ID da venda que deseja pesquisar: ");
		VENDA ven = vendaDAO.pesquisar(scan.nextInt());
		System.out.println("ID Venda: " + ven.getId_venda()
				+ "| ID Cliente: " + ven.getId_cliente()
				+ "| ID Produto: " + ven.getId_produto()
				+ "| ID Funcionario: " + ven.getId_funcionario());
		
	}

}
