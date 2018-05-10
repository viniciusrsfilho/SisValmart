package com.sisValmart.lsiProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

/**
 * 
 * @author Sezinando Vieira, Vinicius Filho, Rodrigo Trindade, Diego Kazadi
 * 
 * Entidade gerente. Classe que é responsavel por adicionar e remover produtos do sistema, 
 * assim como pode fazer essas mesmas atividades com a entidade funcionário.
 *
 *
 */
@Entity
public class Gerente {
	/**
	 * Aqui estão sendo geradas as colunas no bando de dados representando todas as 
	 * caracteristicas que a entidade Gerente possui.
	 * 
	 */

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="senha")
	private String senha;

	public Gerente(String nome, String cpf, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	/**
	 * 
	 * @return o id do Gerente
	 */
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
