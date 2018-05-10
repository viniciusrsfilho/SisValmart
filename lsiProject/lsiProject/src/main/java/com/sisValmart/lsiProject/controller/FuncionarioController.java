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
import org.springframework.web.bind.annotation.RequestMethod;

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.service.FuncionarioService;

/**
 * Classe FuncionarioController faz a intermidiacao da classe Funcionario e a Classe FuncionarioService.
 * @author Equipe SISValmart
 */
@Component
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
/**
 * @param ResponseEntity<Funcionario> retorna um novo Funcionario adicionado.
 */
	@PostMapping
	public ResponseEntity<Funcionario> addFuncionario(@Valid @RequestBody Funcionario funcionario) {
		return new ResponseEntity<Funcionario>(funcionarioService.addFuncionario(funcionario), HttpStatus.OK); 
	}
/**
 * @param ResponseEntity<List<Funcionario>> retorna uma lista de Funcionarios.
 */
	@RequestMapping(value="/funcionario", method=RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> getFuncionarios() {
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionarios();
		return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
	}

}
