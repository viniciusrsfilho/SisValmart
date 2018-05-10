import { Component, OnInit } from '@angular/core';
import { CadastroService } from '../cadastro/cadastro.service';
import { Funcionario, Gerente } from '..';
import { Router } from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user : string;
  senha : string;

  constructor(private router : Router, private loginService : LoginService) {  }

  ngOnInit() {
  }

  onSubmit() {
    let achou : boolean = false;
    for (const i of this.loginService.funcionarios) {
      if(i.cpf == this.user) {
        this.router.navigate(['./inicio']);
        this.loginService.logado = i;
        this.loginService.fezLoginFuncionario();
        achou = true;
        this.user = null;
        this.senha = null;
        break;
      } 
    }
    for (const i of this.loginService.gerentes) {
      if(i.cpf == this.user) {
        this.router.navigate(['./inicio']);
        this.loginService.logado = i;
        this.loginService.fezLoginGerente();
        achou = true;
        this.user = null;
        this.senha = null;
        break;
      }
    }
    if(!achou){
      alert("Usuário não encontrado");
    }
  }

}
