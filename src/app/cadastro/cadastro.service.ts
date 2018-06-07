import { Injectable } from '@angular/core';
import { Funcionario, Gerente } from '..';
import { Http } from '@angular/http';

@Injectable()
export class CadastroService {

  eFuncionario : boolean = false;
  eGerente : boolean = false;
  rotag : string = "http://localhost:8080/gerentes";
  rotaf : string = "http://localhost:8080/funcionarios";
  
  constructor(private http : Http) { }

  addFuncionario(func) {
    this.http.post(this.rotaf, func).map(res => res).subscribe(dados => dados);
  }

  addGerente(ger){
    this.http.post(this.rotag, ger).map(res => res).subscribe(dados => dados);
  }

}
