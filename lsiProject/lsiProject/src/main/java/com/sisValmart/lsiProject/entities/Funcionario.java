/*
 * No pacote com.sisValmart.lsiProject.entities esta criada a classe Funcionario
 * um das entidade do nosso projeto SisValmart
 */
package com.sisValmart.lsiProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
 
/** A Classe Funcionario que define os atributos de um funcionario 
 * ela tem dois metodos construtores, um com parametro e outre sem
  * 
  * @author vinicius; sezinando; rodrigo; diego
  *
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
	
	/**O metodo construtor da classe Funcionario com 3 parametros do tipo String
	 * 
	 * @param nome
	 * @param cpf
	 * @param senha
	 */
	public Funcionario(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	/**O metodo construtor da classe Funcionario sem parametro
	 * chame o super da classe pai Object
	 * 
	 */
	public Funcionario() {
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
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", senha=" + senha + "]";
	}

}


