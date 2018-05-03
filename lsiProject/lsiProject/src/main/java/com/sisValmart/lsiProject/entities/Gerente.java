/*
 * No pacote com.sisValmart.lsiProject.entities está criada a classe Gerente 
 * uma das entidades do nosso projeto SisValmart
 */
package com.sisValmart.lsiProject.entities;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;

/** A classe Gerente que define os atributos de um Gerente
 * ela tem dois metodos construtores, um com parametro e outre sem
 * 
 * @author diego
 *
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
	
	/** O metodo construtor da classe Gerente com tres parametros
	 * 
	 * @param nome
	 * @param cpf
	 * @param senha
	 */
	public Gerente(String nome, String cpf, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Gerente() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gerente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}

}
