import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { CadastroComponent } from './cadastro/cadastro.component';
import { route } from './routes';
import { CadastroService } from './cadastro/cadastro.service';
import { ProdutoComponent } from './cadastro-produto/produto.component';
import { ProdutoService } from './cadastro-produto/produto.service';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginService } from './login/login.service';
import { PaginaInicioComponent } from './pagina-inicio/pagina-inicio.component';
import { EstoqueComponent } from './estoque/estoque.component';
import { AuthGuardService } from './guards/auth.guard.service';
import { SelecionarProdutoComponent } from './selecionar-produto/selecionar-produto.component';
import { ExcluirProdutoComponent } from './excluir-produto/excluir-produto.component';
import { EditarQuantidadeComponent } from './editar-quantidade/editar-quantidade.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    CadastroComponent,
    ProdutoComponent,
    NavbarComponent,
    PaginaInicioComponent,
    EstoqueComponent,
    SelecionarProdutoComponent,
    ExcluirProdutoComponent,
    EditarQuantidadeComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(route),
    FormsModule
  ],
  providers: [CadastroService, ProdutoService, LoginService, NavbarComponent, AuthGuardService],
  bootstrap: [AppComponent]
})
export class AppModule { }
