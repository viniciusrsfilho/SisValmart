import { Injectable } from '@angular/core';
import { CadastroService } from '../cadastro/cadastro.service';
import { Gerente, Funcionario, Pessoa } from '..';
import { Http } from '@angular/http';

@Injectable()
export class LoginService {

  logado : Pessoa;
  eGerente : boolean = false;
  eFuncionario : boolean = false;
  funcionarios : Array<Funcionario>;
  gerentes : Array<Gerente>;

  rotag : string = "http://localhost:8080/gerentes";
  rotaf : string = "http://localhost:8080/funcionarios";

  constructor(private http : Http) {
    this.http.get(this.rotaf).map(dados => dados.json()).subscribe(dados => this.funcionarios = dados);
    this.http.get(this.rotag).map(dados => dados.json()).subscribe(dados => this.gerentes = dados);
  }

  fezLoginFuncionario() {
    this.eFuncionario = true;
    this.eGerente = false;
  }

  fezLoginGerente(){
    this.eFuncionario = false;
    this.eGerente = true;
  }

  fezLogout() {
    this.eFuncionario = false;
    this.eGerente = false;
  }

}
