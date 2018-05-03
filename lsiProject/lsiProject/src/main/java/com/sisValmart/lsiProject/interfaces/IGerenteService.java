/*
 * No pacote com.sisValmart.lsiProject.interfaces esta criada a uma interface IGerenteService
 *
 */

package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.exceptions.AbsentObjectExecption;

/**A Classe IGerenteService criada e tem como objetivo de definir os metodos de manipular o Gerente
 * addicionar, listar, pegar, atualizar, e deletar Gerente 
 *  
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

public interface IGerenteService {

	List<Gerente> getAllGerentes();
	public Gerente addGerente(Gerente gerentes);
	public Gerente getGerente (Long id) throws AbsentObjectExecption;
	public Gerente updateGerente (Gerente gerente);
	public void deleteGerente (Long id);
}
