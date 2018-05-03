package com.sisValmart.lsiProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Funcionario define as caracteristicas de um Funcionario.
 * @author Equipe SISValmart
 */
@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "senha")
	private String senha;
/**
 * Construtor sobrecarregado da classe Funcionario.
 * @param nome o nome do Funcionario.
 * @param cpf o cpf do Funcionario.
 * @param senha a senha do Funcionario.
*/
	public Funcionario(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
/**
 * Construtor default da classe Funcionario.
 */
	public Funcionario() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
