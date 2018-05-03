/*
 * No pacote com.sisValmart.lsiProject.entities está criada a classe Produto  
 * uma das entidades do nosso projeto SisValmart
 */
package com.sisValmart.lsiProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "precoInicial")
	private double precoInicial;

	@Column(name = "precoFinal")
	private double precoFinal;

	@Column(name = "categoria")
	private String Categoria;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "quantidade")
	private int quantidade;
	
	/**O metodo construtor que recebe quatra parametros
	 * 
	 * @param nome
	 * @param precoInicial
	 * @param categoria
	 * @param quantidade
	 */
	public Produto(String nome, double precoInicial, String categoria, int quantidade) {
		this.nome = nome;
		this.precoInicial = precoInicial;
		Categoria = categoria;
		this.quantidade = quantidade;
	}

	public Produto() {
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
	 * @return the precoInicial
	 */
	public double getPrecoInicial() {
		return precoInicial;
	}

	/**
	 * @param precoInicial the precoInicial to set
	 */
	public void setPrecoInicial(double precoInicial) {
		this.precoInicial = precoInicial;
	}

	/**
	 * @return the precoFinal
	 */
	public double getPrecoFinal() {
		return precoFinal;
	}

	/**
	 * @param precoFinal the precoFinal to set
	 */
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return Categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the quantidade
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}