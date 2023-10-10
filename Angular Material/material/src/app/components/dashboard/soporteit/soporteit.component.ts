import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/interfaces/usuario'

const listaUsuario: Usuario[] = [
  { NdeInventario: 1, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
  { NdeInventario: 2, elemento :"Mouse", lugar:"Deposito", cantidad:"15"},
  { NdeInventario: 3, elemento :"VGA a HDMI", lugar:"Soporte IT", cantidad:"5"},
  { NdeInventario: 3, elemento :"Teclado", lugar:"Deposito", cantidad:"12"},
  { NdeInventario: 2, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
  { NdeInventario: 4, elemento :"Pila recargable", lugar:"Soporte IT", cantidad:"4"},

];
@Component({
  selector: 'app-soporteit',
  templateUrl: './soporteit.component.html',
  styleUrls: ['./soporteit.component.css']
})
export class UsuariosComponent implements OnInit {
  displayedColumns: string[] = ['N° de Inventario', 'Elemento', 'Lugar', 'Cantidad', 'Acciones'];
  dataSource = listaUsuario;
  constructor() { }

  ngOnInit(): void {
  }

}
