/*
 * No pacote com.sisValmart.lsiProject.service é criada uma classe ProdutoService
 *   
 */
package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;
import com.sisValmart.lsiProject.interfaces.IProdutoService;
import com.sisValmart.lsiProject.repository.RepositorioProduto;
import com.sisValmart.lsiProject.utils.CalculadoraDePreco;

/** A classe ProdutoService que implements IProdutoService
 * e implements os metodos definido na interface IProdutoService 
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */
public class ProdutoService implements IProdutoService {

	@Autowired
	RepositorioProduto repositorioProduto;
	
	@Override
	public Produto addProduto(Produto produto) throws InvalidProductException {
		produto.setPrecoFinal(CalculadoraDePreco.calculaValor(produto));
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
