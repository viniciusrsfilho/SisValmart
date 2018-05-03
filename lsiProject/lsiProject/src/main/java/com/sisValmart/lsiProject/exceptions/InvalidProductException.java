/*
 * No pacote com.sisValmart.lsiProject.entities esta criada a classe InvalidProductException
 * que extends Exception
 *
 */
package com.sisValmart.lsiProject.exceptions;

import com.sisValmart.lsiProject.entities.Produto;

/**A Classe AbsentObjectExecption criada e tem como objetivo de lançar uma exceção quando um 
 * um produto não será encontrado na hora da busca 
 *  
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

public class InvalidProductException extends Exception {

	private static final long serialVersionUID = 2L;

	public InvalidProductException(Produto produto) {

		if (produto.getCategoria().equals("")) {
			System.out.println(produto + "Produto invalido, por favor coloque um produto válido");
		}
	}

}
