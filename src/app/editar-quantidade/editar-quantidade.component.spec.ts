import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarQuantidadeComponent } from './editar-quantidade.component';

describe('EditarQuantidadeComponent', () => {
  let component: EditarQuantidadeComponent;
  let fixture: ComponentFixture<EditarQuantidadeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditarQuantidadeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditarQuantidadeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
