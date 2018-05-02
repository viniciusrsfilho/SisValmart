package com.sisValmart.lsiProject.exceptions;

import com.sisValmart.lsiProject.entities.Produto;

public class InvalidProductException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	public InvalidProductException(Produto produto) {

		if (produto.getCategoria().equals("")) {
			System.out.println(produto + "Produto invalido, por favor coloque um produto válido");
		}
	}

}
