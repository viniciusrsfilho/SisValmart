import { Component, OnInit } from '@angular/core';
import { Produto } from '..';
import { ProdutoService } from '../cadastro-produto/produto.service';

@Component({
  selector: 'app-editar-quantidade',
  templateUrl: './editar-quantidade.component.html',
  styleUrls: ['./editar-quantidade.component.css']
})
export class EditarQuantidadeComponent implements OnInit {

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

  add(form) {
    for (var p of this.produtoService.produtos) {
      if(p == this.produto) {
        p.quantidade += this.quantidade;
        console.log(p.quantidade);
      }
    }
  }

}