package com.sisValmart.lsiProject.interfaces;

import java.util.List;

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.exceptions.AbsentObjectExecption;

public interface IGerenteService {

	List<Gerente> getAllGerentes();
	public Gerente addGerente(Gerente gerentes);
	public Gerente getGerente (Long id) throws AbsentObjectExecption;
	public Gerente updateGerente (Gerente gerente);
	public void deleteGerente (Long id);
	
}
