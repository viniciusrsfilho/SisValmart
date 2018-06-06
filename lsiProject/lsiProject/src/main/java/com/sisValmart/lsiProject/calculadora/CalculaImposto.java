package com.sisValmart.lsiProject.calculadora;

import com.sisValmart.lsiProject.entities.Produto;

public class CalculaImposto {

	static final double PRODUTO_ALIMENTICIO = 1.5;
	static final double PRODUTO_LIMPEZA = 1.65;
	static final double PRODUTO_HIGIENE = 1.6;
	static final double PRODUTO_BEBIDA = 1.8;
	static final double PRODUTO_HORTIFRUTI = 1.3;

	public static double calcularImposto(Produto produto) {
		double valorImposto = 0;

		if (produto.getCategoria().equals("Alimenticio")) {
			valorImposto = PRODUTO_ALIMENTICIO;
		} else if (produto.getCategoria().equals("Limpeza")) {
			valorImposto = PRODUTO_LIMPEZA;
		} else if (produto.getCategoria().equals("Higiene pessoal")) {
			valorImposto = PRODUTO_HIGIENE;
		} else if (produto.getCategoria().equals("Bebida")) {
			valorImposto = PRODUTO_BEBIDA;
		} else if (produto.getCategoria().equals("Hortifruti")) {
			valorImposto = PRODUTO_HORTIFRUTI;
		}
		return valorImposto;
	}
}
