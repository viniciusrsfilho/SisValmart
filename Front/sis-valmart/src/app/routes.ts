import { Routes } from '@angular/router';
import { CadastroComponent } from './cadastro/cadastro.component';
import { LoginComponent } from './login/login.component';
import { ProdutoComponent } from './cadastro-produto/produto.component';
import { PaginaInicioComponent } from './pagina-inicio/pagina-inicio.component';
import { EstoqueComponent } from './estoque/estoque.component';
import { AuthGuardService } from './guards/auth.guard.service';
import { SelecionarProdutoComponent } from './selecionar-produto/selecionar-produto.component';
import { ExcluirProdutoComponent } from './excluir-produto/excluir-produto.component';
import { EditarQuantidadeComponent } from './editar-quantidade/editar-quantidade.component';

export const route : Routes = [

    {path:'', redirectTo:'home', pathMatch:'full'},
    {path:'cadastro', component:CadastroComponent, canActivate: [AuthGuardService]},
    {path:'home', component:LoginComponent},
    {path:'produto', component:ProdutoComponent, canActivate: [AuthGuardService]},
    {path:'inicio', component:PaginaInicioComponent, canActivate: [AuthGuardService]},
    {path:'estoque', component:EstoqueComponent, canActivate: [AuthGuardService]},
    {path:'selecionar', component:SelecionarProdutoComponent, canActivate: [AuthGuardService]},
    {path:'excluir', component:ExcluirProdutoComponent, canActivate: [AuthGuardService]},
    {path:'adicionar', component:EditarQuantidadeComponent, canActivate: [AuthGuardService]}

]