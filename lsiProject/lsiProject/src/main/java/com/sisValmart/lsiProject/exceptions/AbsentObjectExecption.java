/*
 * No pacote com.sisValmart.lsiProject.entities esta criada a classe AbsentObjectExecption
 * que extends Exception
 *
 */
package com.sisValmart.lsiProject.exceptions;

/**A Classe AbsentObjectExecption criada e tem como objetivo de lançar uma exceção quando um objeto
 * não será encontrado na hora da busca 
 *  
 * @author vinicius; sezinando; rodrigo; diego
 *
 */
public class AbsentObjectExecption extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AbsentObjectExecption (String object){
		super (object + "objeto solicitado não encontrado ou invalido");
	}

}
