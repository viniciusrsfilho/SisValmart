import { Injectable } from '@angular/core';
import { Funcionario, Gerente } from '..';

@Injectable()
export class CadastroService {

  funcionarios : Array<Funcionario> = new Array<Funcionario>();
  gerentes : Array<Gerente> = new Array<Gerente>();
  eFuncionario : boolean = false;
  eGerente : boolean = false;
  
  admim : Gerente = new Gerente();

  constructor() {
    this.admim.nome = "Administrador";
    this.admim.cpf = "adm";
    this.admim.senha = "adm";
    this.addGerente(this.admim);
  }

  addFuncionario(func) {
    this.funcionarios.push(func);
  }

  addGerente(ger){
    this.gerentes.push(ger);
  }

}
