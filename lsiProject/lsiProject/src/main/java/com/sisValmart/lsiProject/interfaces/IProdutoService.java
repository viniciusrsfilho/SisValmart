package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Produto;

public interface IProdutoService {
	
	Produto addProduto(Produto produto);
	
	Produto getProdutoById(long id);
	
	List<Produto> getProdutos();

}
