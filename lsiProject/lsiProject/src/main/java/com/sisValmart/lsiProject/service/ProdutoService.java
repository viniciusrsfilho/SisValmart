package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisValmart.lsiProject.calculadora.CalculaPrecoFinal;
import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.interfaces.IProdutoService;
import com.sisValmart.lsiProject.repository.RepositorioProduto;

@Service
public class ProdutoService implements IProdutoService {

	@Autowired
	RepositorioProduto repositorioProduto;
	
	@Override
	public Produto addProduto(Produto produto) {
		produto.setPrecoFinal(CalculaPrecoFinal.calculaLucro(produto));
		return repositorioProduto.save(produto);
	}

	@Override
	public Produto getProdutoById(long id) {
		return repositorioProduto.getOne(id);
	}

	@Override
	public List<Produto> getProdutos() {
		return repositorioProduto.findAll();
	}


}
