/*
 * No pacote com.sisValmart.lsiProject.repository está criada a classe interface RepositorioGerente 
 */
package com.sisValmart.lsiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisValmart.lsiProject.entities.Gerente;

@Repository("gerenteRepository")
public interface RepositorioGerente extends JpaRepository<Gerente, Long>{

	
}
