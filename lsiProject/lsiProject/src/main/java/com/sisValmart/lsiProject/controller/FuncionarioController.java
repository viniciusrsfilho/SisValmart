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

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.service.FuncionarioService;

@Controller
@RequestMapping("funcionarios")
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@PostMapping
	public ResponseEntity<Funcionario> addFuncionario(@Valid @RequestBody Funcionario funcionario) {
		return new ResponseEntity<Funcionario>(funcionarioService.addFuncionario(funcionario), HttpStatus.OK); 
	}
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> getFuncionarios() {
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionarios();
		return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
	}

}
