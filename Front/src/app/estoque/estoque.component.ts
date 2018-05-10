import { Component, OnInit } from '@angular/core';
import { Estoque } from '..';
import { ProdutoService } from '../cadastro-produto/produto.service';

@Component({
  selector: 'app-estoque',
  templateUrl: './estoque.component.html',
  styleUrls: ['./estoque.component.css']
})
export class EstoqueComponent implements OnInit {

  estoque : Estoque = new Estoque();

  constructor(private produtoService : ProdutoService) {
    this.estoque.produtos = this.produtoService.produtos;
  }

  ngOnInit() {
  }

}
