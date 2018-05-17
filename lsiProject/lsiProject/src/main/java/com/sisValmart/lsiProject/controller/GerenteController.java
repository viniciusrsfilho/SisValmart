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

import com.sisValmart.lsiProject.entities.Gerente;
import com.sisValmart.lsiProject.service.GerenteService;

@Controller
@RestController
@CrossOrigin(allowedHeaders="*")
public class GerenteController {

	@Autowired
	private GerenteService gService;
	
	@RequestMapping(value = "/gerentes", method = RequestMethod.POST)
	public ResponseEntity<Gerente> addGerente(@Valid @RequestBody Gerente gerente){
		return new ResponseEntity<Gerente>(gService.addGerente(gerente), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/gerentes", method = RequestMethod.GET)
	public ResponseEntity<List<Gerente>> getGerentes() {
		List<Gerente> gerentes = gService.getAllGerentes();
		return new ResponseEntity<List<Gerente>> (gerentes, HttpStatus.OK);
	}
}
