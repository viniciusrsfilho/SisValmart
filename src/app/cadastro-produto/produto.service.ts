import { Injectable } from '@angular/core';
import { Produto } from '..';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class ProdutoService {

  produtos: Array<Produto> = new Array<Produto>();
  rota : string = "http://localhost:8080/produtos";

  constructor(private http : Http) { 
    this.http.get(this.rota).map(dados => dados.json()).subscribe(dados => this.produtos = dados);
  }

  addProduto(prod) {
    this.http.post(this.rota, prod).subscribe(dados => dados);
  }

}
