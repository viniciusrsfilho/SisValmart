import { Component, OnInit } from '@angular/core';
import { ProdutoService } from '../cadastro-produto/produto.service';
import { Produto } from '..';

@Component({
  selector: 'app-excluir-produto',
  templateUrl: './excluir-produto.component.html',
  styleUrls: ['./excluir-produto.component.css']
})
export class ExcluirProdutoComponent implements OnInit {

  selecionado : string;
  quantidade : number;
  produto : Produto = new Produto();
  eProduto : boolean = false;

  constructor(private produtoService : ProdutoService) { }

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

  excluir(form) {
    for (var p of this.produtoService.produtos) {
      if(p == this.produto) {
        p.quantidade -= this.quantidade;
        console.log(p.quantidade);
      }
    }
  }
}
