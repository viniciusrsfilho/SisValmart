/*
 * No pacote com.sisValmart.lsiProject.interfaces esta criada a uma interface IFuncionarioService
 *
 */

package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Funcionario;
/**A Classe IFuncionarioService criada e tem como objetivo de definir os metodos de manipular o Gerente
 * addicionar, listar, pegar Funcionario 
 *  
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

public interface IFuncionarioService {
	
	Funcionario addFuncionario(Funcionario funcionario);

	Funcionario getFuncionarioById(long id);
	
	List<Funcionario> getAllFuncionarios();

}