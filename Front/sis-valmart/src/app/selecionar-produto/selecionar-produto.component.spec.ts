import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SelecionarProdutoComponent } from './selecionar-produto.component';

describe('SelecionarProdutoComponent', () => {
  let component: SelecionarProdutoComponent;
  let fixture: ComponentFixture<SelecionarProdutoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SelecionarProdutoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SelecionarProdutoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
