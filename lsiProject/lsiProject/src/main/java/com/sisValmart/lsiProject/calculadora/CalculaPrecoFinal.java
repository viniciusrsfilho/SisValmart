package com.sisValmart.lsiProject.calculadora;

import com.sisValmart.lsiProject.entities.Produto;

public class CalculaPrecoFinal {
	static final double LUCRO = 1.5;

	public static double calculaLucro (Produto produto) {
		
		double valorImposto = CalculaImposto.calcularImposto(produto);
		double ganho = LUCRO;
		double valorFinal = (produto.getPrecoInicial() * valorImposto) * ganho;
		
		return valorFinal;
	}
}
