package com.sisValmart.lsiProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;
import com.sisValmart.lsiProject.service.ProdutoService;

/**
 * Classe ProdutoController faz a intermidiacao da classe Produto e a Classe ProdutoService.
 * @author Equipe SISValmart
 */
@Component
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
/**
* @param ResponseEntity<Produto> retorna um novo Produto adicionado.
*/	
	@PostMapping
	public ResponseEntity<Produto> addProduto(@Valid @RequestBody Produto produto) throws InvalidProductException {
		return new ResponseEntity<Produto>(produtoService.addProduto(produto), HttpStatus.OK);
	}
/**
* @param ResponseEntity<List<Produto>> retorna uma lista de Produtos.
*/
	@RequestMapping
	public ResponseEntity<List<Produto>> getProdutos() {
		List<Produto> produtos = produtoService.getProdutos();
		return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
	}

}
