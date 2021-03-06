package com.sisValmart.lsiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisValmart.lsiProject.entities.Produto;

@Repository("produtoRepository")
public interface RepositorioProduto extends JpaRepository<Produto, Long> {

}
