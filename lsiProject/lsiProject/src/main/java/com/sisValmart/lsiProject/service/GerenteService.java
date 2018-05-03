package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.exceptions.AbsentObjectExecption;
import com.sisValmart.lsiProject.interfaces.IGerenteService;
import com.sisValmart.lsiProject.repository.RepositorioGerente;

/**
 * Classe GerenteService implementa os metodos da classe IGerenteService.
 * @author Equipe SISValmart
 */
@Service
@Validated
public class GerenteService implements IGerenteService {

	@Autowired
	private RepositorioGerente gRepository;
	/**
	 * Metodo para lista os Gerente
	* @param List<Gerente> retorna uma lista de Gerente.
	*/
	@Override
	public List<Gerente> getAllGerentes() {
		
		return (List<Gerente>) gRepository.findAll();
	}
	/**
	* Metodo para adicionar Gerente.
	* @param gRepository retorna um Gerente adicionado.
	*/
	@Override
	public Gerente addGerente(Gerente gerentes) {
		return  gRepository.save(gerentes);
	}
	/**
	* Metodo para busca o Gerente pelo id.
	* @param rutunr null.
	*/
	@Override
	public Gerente getGerente(Long id) throws AbsentObjectExecption {
		//TODO Verificar qual erro acontece no metodo getGerente (Issue#1)
		/*if (id == null) {
			throw new AbsentObjectExecption("Gerente");
		}*/
		return null;//(Gerente) gRepository.findById(id);
		
	}
	/**
	* Metodo para atualizar o Gerente.
	* @param rutunr null.
	*/
	@Override
	public Gerente updateGerente(Gerente gerente) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	* Metodo para deleta o Gerente pelo id.
	*/
	@Override
	public void deleteGerente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
