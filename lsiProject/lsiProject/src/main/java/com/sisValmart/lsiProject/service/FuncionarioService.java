package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.interfaces.IFuncionarioService;
import com.sisValmart.lsiProject.repository.RepositorioFuncionario;
/**
 * Classe FuncionarioService implementa os metodos da classe IFuncionarioService.
 * @author Equipe SISValmart
 */
public class FuncionarioService implements IFuncionarioService {
	
	@Autowired
	RepositorioFuncionario funcionarioRepository;
/**
* Metodo para adicionar Fucionario.
* @param funcionarioRepository retorna um Funcionario adicionado.
*/
	@Override
	public Funcionario addFuncionario(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}
/**
* Metodo para busca o Funcionario pelo id.
* @param funcionarioRepository retorna um Funcionario pelo id.
*/
	@Override
	public Funcionario getFuncionarioById(long id) {
		return funcionarioRepository.getOne(id);
	}
/**
 * Metodo para lista os Funcionarios
* @param funcionarioRepository retorna uma lista de Funcionarios.
*/
	@Override
	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}
	
}