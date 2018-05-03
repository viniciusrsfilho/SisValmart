/*
 * No pacote com.sisValmart.lsiProject.interfaces esta criada a uma interface IProdutoService
 *
 */

package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;

/**A Classe IProdutoService criada e tem como objetivo de definir os metodos de addicionar, pegar o produto 
 * pelo Id e o metodo getProdutos para listar todos produtos entrados no banco de dados
 *  
 * @author vinicius; sezinando; rodrigo; diego
 *
 */
public interface IProdutoService {
	
	Produto addProduto(Produto produto) throws InvalidProductException;
	
	Produto getProdutoById(long id);
	
	List<Produto> getProdutos();

}
