package com.sisValmart.lsiProject.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisValmart.lsiProject.entities.Funcionario;
import com.sisValmart.lsiProject.service.FuncionarioService;

@Controller
@RestController
@CrossOrigin(allowedHeaders="*")
public class FuncionarioController {
	
	@Autowired
	FuncionarioService funcionarioService;
	
	@RequestMapping(value = "/funcionarios", method = RequestMethod.POST)
	public ResponseEntity<Funcionario> addProduto(@Valid @RequestBody Funcionario funcionario) {
		return new ResponseEntity<Funcionario>(funcionarioService.addFuncionario(funcionario), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/funcionarios", method = RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> getFuncionarios() {
		List<Funcionario> funcionarios = funcionarioService.getAllFuncionarios();
		return new ResponseEntity<List<Funcionario>>(funcionarios, HttpStatus.OK);
	}

}
