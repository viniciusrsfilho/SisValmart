import { Component, OnInit } from '@angular/core';
import { Funcionario, Gerente } from '../models';
import { CadastroService } from './cadastro.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css']
})
export class CadastroComponent implements OnInit {

  funcionario : Funcionario = new Funcionario();
  gerente : Gerente = new Gerente();
  eFuncionario : boolean = false;
  eGerente : boolean = false

  constructor(private cadastroService : CadastroService, private router : Router) {
    this.eFuncionario = this.cadastroService.eFuncionario;
    this.eGerente = this.cadastroService.eGerente;
  }

  ngOnInit() {
  }

  onSubmitFuncionario(form) {
    this.cadastroService.addFuncionario(this.funcionario);
    this.funcionario = new Funcionario();
    this.router.navigate(['./home']);
  }

  onSubmitGerente(form) {
    this.cadastroService.addGerente(this.gerente);
    this.gerente = new Gerente();
    this.router.navigate(['./home']);
  }

}
function newFunction() {
  return this;
}

