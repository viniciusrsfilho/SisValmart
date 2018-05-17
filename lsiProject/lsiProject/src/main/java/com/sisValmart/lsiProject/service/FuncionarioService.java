package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.interfaces.IFuncionarioService;
import com.sisValmart.lsiProject.repository.RepositorioFuncionario;

@Service
public class FuncionarioService implements IFuncionarioService {
	
	@Autowired
	RepositorioFuncionario funcionarioRepository;

	@Override
	public Funcionario addFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	@Override
	public Funcionario getFuncionarioById(long id) {
		return funcionarioRepository.getOne(id);
	}

	@Override
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
	
}