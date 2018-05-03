package com.sisValmart.lsiProject.exceptions;

/**
 * Classe AbsentObjectExecption e uma classe excecao.
 * @author Equipe SISValmar
 */
public class AbsentObjectExecption extends Exception{

	private static final long serialVersionUID = 1L;
	
	public AbsentObjectExecption (String object){
		super (object + "objeto solicitado não encontrado ou invalido");
	}

}
