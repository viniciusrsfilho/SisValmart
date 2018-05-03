package com.sisValmart.lsiProject.exceptions;

import com.sisValmart.lsiProject.entities.Produto;

/**
 * Classe AbsentObjectExecption e uma classe excecao.
 * @author Equipe SISValmar
 */
public class InvalidProductException extends Exception {

	private static final long serialVersionUID = 2L;

	public InvalidProductException(Produto produto) {

		if (produto.getCategoria().equals("")) {
			System.out.println(produto + "Produto invalido, por favor coloque um produto válido");
		}
	}

}
