import { Injectable } from '@angular/core';
import { Produto } from '..';

@Injectable()
export class ProdutoService {

  produtos: Array<Produto> = new Array<Produto>();

  constructor() { }

  addProduto(prod) {
    this.produtos.push(prod);
    console.log(this.produtos);
  }

}
