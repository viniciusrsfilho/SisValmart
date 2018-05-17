import { Injectable } from '@angular/core';
import { Funcionario, Gerente } from '..';
import { Http } from '@angular/http';

@Injectable()
export class CadastroService {

  funcionarios : Array<Funcionario> = new Array<Funcionario>();
  gerentes : Array<Gerente> = new Array<Gerente>();
  eFuncionario : boolean = false;
  eGerente : boolean = false;
  rotag : string = "http://localhost:8080/gerentes";
  rotaf : string = "http://localhost:8080/funcionarios";
  
  admim : Gerente = new Gerente();

  constructor(private http : Http) {
    this.admim.nome = "Administrador";
    this.admim.cpf = "adm";
    this.admim.senha = "adm";
    this.addGerente(this.admim);
  }

  addFuncionario(func) {
    this.funcionarios.push(func);
    this.http.post(this.rotaf, func).map(res => res).subscribe(dados => dados);
  }

  addGerente(ger){
    this.gerentes.push(ger);
    this.http.post(this.rotag, ger).map(res => res).subscribe(dados => dados);
  }

}
