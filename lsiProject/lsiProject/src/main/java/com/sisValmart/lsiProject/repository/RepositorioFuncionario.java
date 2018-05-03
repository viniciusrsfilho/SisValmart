/*
 * No pacote com.sisValmart.lsiProject.repository está criada a classe interface RepositorioFuncionario 
 */
package com.sisValmart.lsiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sisValmart.lsiProject.entities.Funcionario;

/**A classe RepositorioFuncionario que extends JpaRepository
 * facilita o uso dos metodos da classe JpaRepository que vai 
 * implementar RepositorioFuncionario
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */
@Repository("funcionarioRepository")
public interface RepositorioFuncionario extends JpaRepository<Funcionario, Long> {

}
