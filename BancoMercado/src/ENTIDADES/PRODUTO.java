package ENTIDADES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class PRODUTO {
	
	@Id
	@Column(name="ID_PRODUTO", nullable = false)
	private int id_produto;
	
	@Column(name="NOME_PRODUTO", nullable = false)
	private String nomeProduto;
	
	@Column(name="QUANTIDADE", nullable = false)
	private int quantidade;

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
