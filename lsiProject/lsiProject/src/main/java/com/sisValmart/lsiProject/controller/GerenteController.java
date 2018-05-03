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

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.exceptions.AbsentObjectExecption;
import com.sisValmart.lsiProject.service.GerenteService;
/**
 * No pacote com.sisValmart.lsiProject.controller criamos uma classe FuncionarioController
 * que é responsavel para receber e trataras requisições vindas da classe Gerente
 * 
 * @author vinicius; sezinando; rodrigo; diego
 *
 */

@Controller
@RequestMapping("/gerentes")

public class GerenteController {

	@Autowired
	private GerenteService gService;
	
	@PostMapping
	public ResponseEntity<Gerente> addGerente(@Valid @RequestBody Gerente gerente) throws AbsentObjectExecption{
		return new ResponseEntity<Gerente>(gService.addGerente(gerente), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Gerente>> getGerentes() {
		List<Gerente> gerentes = gService.getAllGerentes();
		return new ResponseEntity<List<Gerente>> (gerentes, HttpStatus.OK);
	}
}
