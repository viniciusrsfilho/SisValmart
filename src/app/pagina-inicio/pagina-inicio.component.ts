import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login/login.service';
import { Pessoa } from '..';
import { CadastroService } from '../cadastro/cadastro.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-pagina-inicio',
  templateUrl: './pagina-inicio.component.html',
  styleUrls: ['./pagina-inicio.component.css']
})
export class PaginaInicioComponent implements OnInit {

  logado : Pessoa;
  eGerente : boolean = false;
  eFuncionario : boolean = false;

  constructor(private loginService : LoginService, private cadastroService : CadastroService, private router : Router) {
    this.logado = this.loginService.logado;
    this.eGerente = this.loginService.eGerente;
    this.eFuncionario = this.loginService.eFuncionario;  
  }

  ngOnInit() {
  }

  cadastrarFuncionario () {
    this.cadastroService.eFuncionario = true;
    this.cadastroService.eGerente = false;
    this.router.navigate(['/cadastro']);
  }

  cadastrarGerente() {
    this.cadastroService.eFuncionario = false;
    this.cadastroService.eGerente = true;
    this.router.navigate(['/cadastro']);
  }

  logout() {
    this.loginService.fezLogout();
    this.router.navigate(['/home']);
  }

}
