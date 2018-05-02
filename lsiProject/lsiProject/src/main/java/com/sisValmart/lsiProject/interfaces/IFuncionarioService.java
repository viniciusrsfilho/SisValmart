package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Funcionario;

public interface IFuncionarioService {
	
	Funcionario addFuncionario(Funcionario funcionario);

	Funcionario getFuncionarioById(long id);
	
	List<Funcionario> getAllFuncionarios();

}