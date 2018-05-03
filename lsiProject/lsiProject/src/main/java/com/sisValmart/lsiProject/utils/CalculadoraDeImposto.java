/*
 * No pacote com.sisValmart.lsiProject.utils, acriação da classe CalcularImposto
 */

package com.sisValmart.lsiProject.utils;

import com.sisValmart.lsiProject.entities.Produto;
/**
* No pacote com.sisValmart.lsiProject.utils criamos uma classe CalculadoraDeImposto
* com o metodo static calculaImposto() que recebe obejto produto e calcule Imposto e 
*   
* @author vinicius; sezinando; rodrigo; diego
*
*/

public class CalculadoraDeImposto {
	
	/**O metodo static calcularImposto() responsavel pelo calculo de imposto de cada item 
	 * segunda sua categoria.
	 * 
	 * @param produto
	 * @return valorImposto
	 */
	public static Double calcularImposto(Produto produto) {
		
		final double ALIMENTICIO = 1.5;
		final double LIMPEZA = 1.65;
		final double HIGIENEPESSOAL = 1.6;
		final double BEBIDA = 1.8;
		final double HORITIFRUTI = 1.3;
		final double VALORIMPOSTO = 1.5;
		
		if(produto.getCategoria().equals("Alimenticio")) {
			return ALIMENTICIO;
		} else if(produto.getCategoria().equals("Limpeza")) {
			return LIMPEZA;
		} else if(produto.getCategoria().equals("Higiene pessoal")) {
			return HIGIENEPESSOAL ;
		} else if(produto.getCategoria().equals("Bebida")) {
			return BEBIDA;
		} else if(produto.getCategoria().equals("Hortifruti")) {
			return  HORITIFRUTI;
		}
		return VALORIMPOSTO;
		
	}

}
