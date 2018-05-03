/*
 * No pacote com.sisValmart.lsiProject.controller esta criada a classe FuncionarioController
 * 
 */
package com.sisValmart.lsiProject.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.service.FuncionarioService;
/**
 * No pacote com.sisValmart.lsiProject.controller criamos uma classe FuncionarioController
 * que é responsavel para receber e tratar requisições vindas da classe Funcionario
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

@RestController
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@PostMapping
	public ResponseEntity<Funcionario> addFuncionario(@Valid @RequestBody Funcionario funcionario) {
		return new ResponseEntity<Funcionario>(funcionarioService.addFuncionario(funcionario), HttpStatus.OK); 
	}
	
	@RequestMapping(value="/funcionario", method=RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> getFuncionarios() {
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionarios();
		return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
	}

}
