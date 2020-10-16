package ENTIDADES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VENDA")
public class VENDA {
	
	@Id
	@Column(name="ID_VENDA", nullable = false)
	private int id_venda;
	
	@OneToMany
	@JoinColumn(name="ID_CLIENTE", referencedColumnName="ID_CLIENTE",nullable = false)
	private int id_cliente;
	
	@OneToMany
	@JoinColumn(name="ID_PRODUTO", referencedColumnName="ID_PRODUTO",nullable = false)
	private int id_produto;
	
	@OneToMany
	@JoinColumn(name="ID_FUNCIONARIO", referencedColumnName="ID_FUNCIONARIO",nullable = false)
	private int id_funcionario;

	public int getId_venda() {
		return id_venda;
	}

	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	
}
