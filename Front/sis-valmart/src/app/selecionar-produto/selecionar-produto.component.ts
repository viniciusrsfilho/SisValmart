import { Component, OnInit } from '@angular/core';
import { ProdutoService } from '../cadastro-produto/produto.service';
import { Produto } from '..';
import { Http } from '@angular/http';

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

  rota : string = "http://localhost:8080/produtos";

  constructor(private produtoService : ProdutoService, private http : Http) {  }

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
