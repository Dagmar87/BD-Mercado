package VIEW;

import java.util.Scanner;

import VIEW.EXE.ClienteEXE;
import VIEW.EXE.FuncionarioEXE;
import VIEW.EXE.ProdutoEXE;
import VIEW.EXE.VendaEXE;

public class BancoMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		ProdutoEXE pro = new ProdutoEXE();
		
		ClienteEXE cli = new ClienteEXE();
		
		FuncionarioEXE func = new FuncionarioEXE();
		
		VendaEXE ven = new VendaEXE();
		
		boolean condicao = true;
		
		int opcao = 0;
		
		do {
			
			System.out.println("****** Banco ******");
			System.out.println("****** Produto ******");
			System.out.println("(1) Inserir Produto ");
			System.out.println("(2) Alterar Produto ");
			System.out.println("(3) Listar Produto ");
			System.out.println("(4) Remover Produto ");
			System.out.println("(5) Pesquisar Produto ");
			System.out.println("****** Cliente ******");
			System.out.println("(6) Inserir Cliente");
			System.out.println("(7) Alterar Cliente");
			System.out.println("(8) Listar Cliente");
			System.out.println("(9) Remover Cliente");
			System.out.println("(10) Pesquisar Cliente");
			System.out.println("****** Funcionário ******");
			System.out.println("(11) Inserir Funcionário");
			System.out.println("(12) Alterar Funcionário");
			System.out.println("(13) Listar Funcionário");
			System.out.println("(14) Remover Funcionário");
			System.out.println("(15) Pesquisar Funcionário");
			System.out.println("****** Venda ******");
			System.out.println("(16) Inserir Venda");
			System.out.println("(17) Alterar Venda");
			System.out.println("(18) Listar Venda");
			System.out.println("(19) Remover Venda");
			System.out.println("(20) Pesquisar Venda");
			System.out.println("****** Sair ******");
			System.out.println("(21) Sair");
			
			opcao = scan.nextInt();
			
			switch (opcao) {
			
			case (1):
				pro.ProdutoInserir();
				break;
			
			case (2):
				pro.ProdutoAlterar();
				break;
			
			case (3):
				pro.ProdutoListar();
				break;
			
			case (4):
				pro.ProdutoRemover();
				break;
			
			case (5):
				pro.ProdutoPesquisar();
				break;
			
			case (6):
				cli.ClienteInserir();
				break;
			
			case (7):
				cli.ClienteAlterar();
				break;
			
			case (8):
				cli.ClienteListar();
				break;
			
			case (9):
				cli.ClienteRemover();
				break;
			
			case (10):
				cli.ClientePesquisar();
				break;
			
			case (11):
				func.FuncionarioInserir();
				break;
			
			case (12):
				func.FuncionarioAlterar();
				break;
			
			case (13):
				func.FuncionarioListar();
				break;
			
			case (14):
				func.FuncinarioRemover();
				break;
			
			case (15):
				func.FuncionarioPesquisar();
				break;
			
			case (16):
				ven.VendaInserir();
				break;
			
			case (17):
				ven.VendaAlterar();
				break;
			
			case (18):
				ven.VendaListar();
				break;
			
			case (19):
				ven.VendaRemover();
				break;
			
			case (20):
				ven.VendaPesquisar();
				break;

			default:
				System.out.println("Obrigado por usar nosso banco. Volte Sempre!");
				condicao = false;
				break;
			}

			
		} while (condicao == true);

	}

}
