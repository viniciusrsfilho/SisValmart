import { Injectable } from '@angular/core';
import { CadastroService } from '../cadastro/cadastro.service';
import { Gerente, Funcionario, Pessoa } from '..';

@Injectable()
export class LoginService {

  logado : Pessoa;
  eGerente : boolean = false;
  eFuncionario : boolean = false;
  funcionarios : Array<Funcionario>;
  gerentes : Array<Gerente>;

  constructor(private cadastroService : CadastroService) {
    this.funcionarios = this.cadastroService.funcionarios;
    this.gerentes = this.cadastroService.gerentes;
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
