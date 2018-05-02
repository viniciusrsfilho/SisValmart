package com.sisValmart.lsiProject.utils;

import com.sisValmart.lsiProject.entities.Produto;

public class CalculadoraDeImposto {
		
	public static Double calcularImposto(Produto produto) {
		
		double valorImposto = 0;
		
		if(produto.getCategoria().equals("Alimenticio")) {
			valorImposto = 1.5;
		} else if(produto.getCategoria().equals("Limpeza")) {
			valorImposto = 1.65;
		} else if(produto.getCategoria().equals("Higiene pessoal")) {
			valorImposto = 1.6;
		} else if(produto.getCategoria().equals("Bebida")) {
			valorImposto = 1.8;
		} else if(produto.getCategoria().equals("Hortifruti")) {
			valorImposto = 1.3;
		}
		return valorImposto;
		
	}

}
