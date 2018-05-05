package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;
import com.sisValmart.lsiProject.interfaces.IProdutoService;
import com.sisValmart.lsiProject.repository.RepositorioProduto;
import com.sisValmart.lsiProject.utils.CalculadoraDePreco;

/**
 * Classe ProdutoService implementa os metodos da classe IProdutoService.
 * @author Equipe SISValmart
 */
@Service
@Validated
public class ProdutoService implements IProdutoService {

	@Autowired
	RepositorioProduto repositorioProduto;
	/**
	* Metodo para adicionar Produto.
	* @param repositorioProduto retorna um Produto adicionado.
	*/
	@Override
	public Produto addProduto(Produto produto) throws InvalidProductException {
		produto.setPrecoFinal(CalculadoraDePreco.calculaValor(produto));
		return repositorioProduto.save(produto);
	}
	/**
	* Metodo para busca o Produto pelo id.
	* @param repositorioProduto retorna um Produto pelo id.
	*/
	@Override
	public Produto getProdutoById(long id) {
		return repositorioProduto.getOne(id);
	}
	/**
	 * Metodo para lista os Produto
	* @param repositorioProduto retorna uma lista de Produtos.
	*/
	@Override
	public List<Produto> getProdutos() {
		return repositorioProduto.findAll();
	}

}
