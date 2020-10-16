package ENTIDADES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FUNCIONARIO")
public class FUNCIONARIO {
	
	@Id
	@Column(name="ID_FUNCIONARIO", nullable = false)
	private int id_funcionario;
	
	@Column(name="NOME_FUNCIONARIO", nullable = false)
	private String nomeFuncionario;
	
	@Column(name="SALARIO_FUNCIONARIO", nullable = false)
	private double salarioFuncionario;

	public int getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(int id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
}
