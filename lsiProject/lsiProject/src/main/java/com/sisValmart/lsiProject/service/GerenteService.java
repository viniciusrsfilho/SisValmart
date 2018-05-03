/*
 * No pacote com.sisValmart.lsiProject.service está criada a classe GerenteService
 */
package com.sisValmart.lsiProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.exceptions.AbsentObjectExecption;
import com.sisValmart.lsiProject.interfaces.IGerenteService;
import com.sisValmart.lsiProject.repository.RepositorioGerente;

/**A classe GerenteService implemente IGerenteService e implementa da sua forma os metodos 
 * que IGerenteService definiu
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */
@Service
@Validated
public class GerenteService implements IGerenteService {

	@Autowired
	private RepositorioGerente gRepository;
	
	@Override
	public List<Gerente> getAllGerentes() {
		
		return (List<Gerente>) gRepository.findAll();
	}

	@Override
	public Gerente addGerente(Gerente gerentes) {
		return  gRepository.save(gerentes);
	}

	@Override
	public Gerente getGerente(Long id) throws AbsentObjectExecption {
		//TODO Verificar qual erro acontece no metodo getGerente (Issue#1)
		/*if (id == null) {
			throw new AbsentObjectExecption("Gerente");
		}*/
		return null;//(Gerente) gRepository.findById(id);
		
	}

	@Override
	public Gerente updateGerente(Gerente gerente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGerente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
