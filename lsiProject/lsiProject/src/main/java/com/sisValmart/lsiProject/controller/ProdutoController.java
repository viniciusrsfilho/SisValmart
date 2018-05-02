package com.sisValmart.lsiProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.exceptions.InvalidProductException;
import com.sisValmart.lsiProject.service.ProdutoService;

@RestController
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@PostMapping
	public ResponseEntity<Produto> addProduto(@Valid @RequestBody Produto produto) throws InvalidProductException {
		return new ResponseEntity<Produto>(produtoService.addProduto(produto), HttpStatus.OK);
	}
	
	@RequestMapping
	public ResponseEntity<List<Produto>> getProdutos() {
		List<Produto> produtos = produtoService.getProdutos();
		return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
	}

}
