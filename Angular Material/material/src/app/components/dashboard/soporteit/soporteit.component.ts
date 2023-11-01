import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Usuario } from 'src/app/interfaces/usuario'
import { SoporteitService } from 'src/app/services/soporteit.service';

@Component({
  selector: 'app-soporteit',
  templateUrl: './soporteit.component.html',
  styleUrls: ['./soporteit.component.css']
})
export class UsuariosComponent implements OnInit {

  listaUsuario : Usuario[] = [];

  displayedColumns: string[] = ['N° de Inventario', 'Elemento', 'Lugar', 'Cantidad', 'Acciones'];
  dataSource!:MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator!: MatPaginator; //Agregue el not NULL
  @ViewChild(MatSort) sort!: MatSort;

  constructor( private soporteitService: SoporteitService, private _snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.cargarElementos();
  }
  ngAfterViewInit() {
    this.dataSource.paginator=this.paginator;//No funciona ordenamiento
    this.dataSource.sort = this.sort;
  }
  
  cargarElementos(){
    this.listaUsuario = this.soporteitService.getUsuario(); //Tenia error de nombre de metodo, por eso no me mostraba la lista de array
    this.dataSource = new MatTableDataSource(this.listaUsuario);
  }
  
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  eliminarUsuario(index: number){
  console.log(index)
    this.soporteitService.eliminarUsuario(index);
    this.cargarElementos();
  
    this._snackBar.open('Elemento eliminado con exito','',{
      duration:1500,
      horizontalPosition: 'center',
      verticalPosition: 'top'
    })
  }
}
