package com.sisValmart.lsiProject.utils;

import com.sisValmart.lsiProject.entities.Produto;

public class CalculadoraDePreco {

	public static double calculaValor(Produto produto) {
		double valorImposto = CalculadoraDeImposto.calcularImposto(produto);
		double lucro = 1.5;
		double valorFinal = (produto.getPrecoInicial() * valorImposto) * lucro;

		return valorFinal;
	}

}
