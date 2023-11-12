import { Component, OnInit } from '@angular/core';
import { Elementos } from '../elementos';

@Component({
  selector: 'app-lista-elementos',
  templateUrl: './lista-elementos.component.html',
  styleUrls: ['./lista-elementos.component.css']
})
export class ListaElementosComponent {

  elementos: Elementos[];

  constructor(){  }

  ngOnInit(): void{
    this.elementos = [{
      "id":1,
      "Ninventario": 1,
      "elemento": "Monitor",
      "lugar": "Soporte IT",
      "cantidad": 3,
  },
  {
    "id":2,
    "Ninventario": 2,
    "elemento": "HDMI",
    "lugar": "Soporte IT",
    "cantidad": 14,
  }];
  }
}
