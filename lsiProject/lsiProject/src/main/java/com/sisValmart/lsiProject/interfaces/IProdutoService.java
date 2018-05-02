package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;

public interface IProdutoService {
	
	Produto addProduto(Produto produto) throws InvalidProductException;
	
	Produto getProdutoById(long id);
	
	List<Produto> getProdutos();

}
