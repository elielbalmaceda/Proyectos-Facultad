import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Usuario } from 'src/app/interfaces/usuario'

@Component({
  selector: 'app-soporteit',
  templateUrl: './soporteit.component.html',
  styleUrls: ['./soporteit.component.css']
})
export class UsuariosComponent implements OnInit {
  listaUsuario: Usuario[] = [
    { NdeInventario: 1, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
    { NdeInventario: 2, elemento :"Mouse", lugar:"Deposito", cantidad:"15"},
    { NdeInventario: 3, elemento :"VGA a HDMI", lugar:"Soporte IT", cantidad:"5"},
    { NdeInventario: 3, elemento :"Teclado", lugar:"Deposito", cantidad:"12"},
    { NdeInventario: 2, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
    { NdeInventario: 4, elemento :"Pila recargable", lugar:"Soporte IT", cantidad:"4"},
  
  ];

  displayedColumns: string[] = ['N° de Inventario', 'Elemento', 'Lugar', 'Cantidad', 'Acciones'];
  dataSource = new MatTableDataSource(this.listaUsuario);

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor() { }

  ngOnInit(): void {
  }
  
  ngAfterViewInit() {
    this.dataSource.paginator=(this.paginator);
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

}
