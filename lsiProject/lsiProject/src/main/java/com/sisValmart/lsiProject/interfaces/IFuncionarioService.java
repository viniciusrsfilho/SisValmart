package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Funcionario;
/**
 * Interface IFuncionarioService tem metodos CRUD para serem implementados.
 * @author Equipe SISValmart
 */
public interface IFuncionarioService {
	
	Funcionario addFuncionario(Funcionario funcionario);

	Funcionario getFuncionarioById(long id);
	
	List<Funcionario> getAllFuncionarios();

}