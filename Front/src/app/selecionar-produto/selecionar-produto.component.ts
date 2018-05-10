import { Component, OnInit } from '@angular/core';
import { ProdutoService } from '../cadastro-produto/produto.service';
import { Produto } from '..';

@Component({
  selector: 'app-selecionar-produto',
  templateUrl: './selecionar-produto.component.html',
  styleUrls: ['./selecionar-produto.component.css']
})
export class SelecionarProdutoComponent implements OnInit {

  selecionado : string;
  eProduto : boolean = false;
  descProd : string;
  produto : Produto = new Produto();

  constructor(private produtoService : ProdutoService) {  }

  ngOnInit() {
  }

  onSubmit(form) {
    for (const p of this.produtoService.produtos) {
      if(p.nome == this.selecionado) {
        this.produto = p;
        this.eProduto = true;
      }
    }
  }

  descrever(form) {
    for (const p of this.produtoService.produtos) {
      if(p == this.produto) {
        p.descricao = this.descProd;
        this.eProduto = false;
        this.descProd = null;
        this.produto = new Produto();
      }
    }
  }
}
