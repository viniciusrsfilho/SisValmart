import { Component, OnInit } from '@angular/core';
import { Produto } from '..';
import { ProdutoService } from './produto.service';

@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  categoria : string;
  produto : Produto = new Produto();

  constructor(private produtoService : ProdutoService) { }

  ngOnInit() {
  }

  onSubmit(form) {
    this.produto.categoria = this.categoria;
    this.produtoService.addProduto(this.produto);
    this.produto = new Produto();
  }

}
