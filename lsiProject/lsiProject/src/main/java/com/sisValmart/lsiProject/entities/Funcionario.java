package com.sisValmart.lsiProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
/**
 * 
 * @author Sezinando Vieira
 *
 *Entidade funcionario pode apenas adicionar um produto caso o pedido esteja em ordem com
 *a entrega do produto.
 *
 */

@Entity
public class Funcionario {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private String senha;
	
	public Funcionario(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
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
