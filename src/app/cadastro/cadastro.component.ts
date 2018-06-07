import { Component, OnInit } from '@angular/core';
import { Funcionario, Gerente } from '../models';
import { CadastroService } from './cadastro.service';

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

  constructor(private cadastroService : CadastroService) {
    this.eFuncionario = this.cadastroService.eFuncionario;
    this.eGerente = this.cadastroService.eGerente;
  }

  ngOnInit() {
  }

  onSubmitFuncionario(form) {
    this.cadastroService.addFuncionario(this.funcionario);
    this.funcionario = new Funcionario();
    alert('Funcionário cadastrado com sucesso!');
  }

  onSubmitGerente(form) {
    this.cadastroService.addGerente(this.gerente);
    this.gerente = new Gerente();
    alert('Gerente cadastrado com sucesso!')
  }

}