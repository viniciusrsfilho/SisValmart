package com.sisValmart.lsiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisValmart.lsiProject.entities.Funcionario;

/**
 * A interface RepositorioFuncionario que extende JpaRepository
 * @author Equipe SISValmar
 */
@Repository("funcionarioRepository")
public interface RepositorioFuncionario extends JpaRepository<Funcionario, Long> {

}
