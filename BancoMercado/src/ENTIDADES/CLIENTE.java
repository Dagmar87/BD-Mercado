package ENTIDADES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class CLIENTE {
	
	@Id
	@Column(name="ID_CLIENTE", nullable = false)
	private int id_cliente;
	
	@Column(name="NOME_CLIENTE", nullable = false)
	private String nomeCliente;

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
}
