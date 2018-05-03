/*
 *O pacote com.sisValmart.lsiProject.utils a criação da classe CalculadoraDePreco 
 /*
 * No pacote com.sisValmart.lsiProject.utils, acriação da classe CalculadoraDePreco
 */

package com.sisValmart.lsiProject.utils;

import com.sisValmart.lsiProject.entities.Produto;
/**
* No pacote com.sisValmart.lsiProject.utils criamos uma classe CalculadoraDePreco
* com o metodo static calculaValor() que recebe obejto produto e calcule Imposto e 
* o valor final
*   
* @author vinicius; sezinando; rodrigo; diego
*
*/

public class CalculadoraDePreco {
	
	final static double LUCRO = 1.5;
	
	/**O metodo calcularValor com prametro produto e calcula seu imposto no final retorna
	 * o valorFinal
	 * @param produto
	 * @return valorFinal
	 */
	public static double calculaValor(Produto produto) {
		
		double valorImposto = CalculadoraDeImposto.calcularImposto(produto);
		double valorFinal = (produto.getPrecoInicial() * valorImposto) * LUCRO;

		return valorFinal;
	}
}
