package VIEW.EXE;

import java.util.List;
import java.util.Scanner;

import DAO.CLIENTEDAO;
import DAO.ClienteDAOImpl;
import ENTIDADES.CLIENTE;

public class ClienteEXE {
	
	Scanner scan = new Scanner(System.in);
	
	CLIENTEDAO clienteDAO = new ClienteDAOImpl();
	
	CLIENTE clienteCreate = new CLIENTE();
			
	CLIENTE clienteEdit = new CLIENTE();		
	
	public void ClienteInserir(){
		
		System.out.println("****** Inserir Cliente ******");
		System.out.println("Insira o nome do cliente: ");
		clienteCreate.setNomeCliente(scan.next());
		clienteDAO.inserir(clienteCreate);
		
	}
	
	public void ClienteAlterar(){
		
		System.out.println("****** Alterar Cliente ******");
		System.out.println("Insira o nome do cliente: ");
		clienteEdit.setNomeCliente(scan.next());
		System.out.println("Insira o ID do cliente válido para editar os dados : ");
		clienteEdit.setId_cliente(scan.nextInt());
		clienteDAO.alterar(clienteEdit);
		
	}
	
	public void ClienteListar(){
		
		System.out.println("****** Listar Cliente ******");
		List<CLIENTE> listaCliente = clienteDAO.listarTodos();
		for(CLIENTE c: listaCliente){
			System.out.println("Nome do Cliente: " + c.getNomeCliente());
		}
		
	}
	
	public void ClienteRemover(){
		
		System.out.println("****** Remover Cliente ******");
		System.out.println("Insira o ID do cliente que deseja remover: ");
		clienteDAO.remover(scan.nextInt());
		
	}
	
	public void ClientePesquisar(){
		
		System.out.println("****** Pesquisar Cliente ******");
		System.out.println("Insira o ID do cliente que deseja pesquisar: ");
		CLIENTE cli = clienteDAO.pesquisar(scan.nextInt());
		System.out.println("ID Cliente: " + cli.getId_cliente() 
				+"| Nome do Cliente: " + cli.getNomeCliente());
		
	}

	
	

}
