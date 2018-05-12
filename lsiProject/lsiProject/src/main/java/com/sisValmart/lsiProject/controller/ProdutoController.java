package com.sisValmart.lsiProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sisValmart.lsiProject.entities.Produto;
import com.sisValmart.lsiProject.service.ProdutoService;

@Controller
@RequestMapping("produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@PostMapping
	public ResponseEntity<Produto> addProduto(@Valid @RequestBody Produto produto) {
		return new ResponseEntity<Produto>(produtoService.addProduto(produto), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Produto>> getProdutos() {
		List<Produto> produtos = produtoService.getProdutos();
		return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
	}

}
