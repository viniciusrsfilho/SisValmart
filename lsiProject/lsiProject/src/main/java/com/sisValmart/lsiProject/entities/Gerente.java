package com.sisValmart.lsiProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * Classe Gerente define as caracteristicas de um Funcionario.
 * @author Equipe SISValmart
 */
@Entity
public class Gerente {

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
* Construtor sobrecarregado da classe Gerente.
 * @param nome o nome do Gerente.
 * @param cpf o cpf do Gerente.
 * @param senha a senha do Gerente.
*/
	public Gerente(String nome, String cpf, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}
/**
 * Construtor default da classe Gerente.
*/
	public Gerente() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(Long id) {
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
