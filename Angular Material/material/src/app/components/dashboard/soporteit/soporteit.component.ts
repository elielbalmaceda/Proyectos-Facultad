import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
<<<<<<< HEAD
import { MatSnackBar } from '@angular/material/snack-bar';
=======
>>>>>>> 8801c8445a607643e6bfd1f9651fda04cf9da8e4
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

<<<<<<< HEAD
  listaUsuario : Usuario[] = [];

  displayedColumns: string[] = ['N° de Inventario', 'Elemento', 'Lugar', 'Cantidad', 'Acciones'];
=======
  listaUsuario :Usuario[] = [];

  displayedColumns: string[] = ['N° de Inventario', 'Elemento', 'Lugar', 'Cantidad', 'Acciones'];
  
>>>>>>> 8801c8445a607643e6bfd1f9651fda04cf9da8e4
  dataSource!:MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator!: MatPaginator; //Agregue el not NULL
  @ViewChild(MatSort) sort!: MatSort;

<<<<<<< HEAD
  constructor( private soporteitService: SoporteitService, private _snackBar: MatSnackBar) { }
=======
  constructor( private soporteitService: SoporteitService) { }
>>>>>>> 8801c8445a607643e6bfd1f9651fda04cf9da8e4

  ngOnInit(): void {
    this.cargarElementos();
  }
  ngAfterViewInit() {
<<<<<<< HEAD
    this.dataSource.paginator=this.paginator;//No funciona ordenamiento
    this.dataSource.sort = this.sort;
  }
  
  cargarElementos(){
    this.listaUsuario = this.soporteitService.getUsuario(); //Tenia error de nombre de metodo, por eso no me mostraba la lista de array
    this.dataSource = new MatTableDataSource(this.listaUsuario);
  }
  
=======
    this.dataSource.paginator=(this.paginator);//No funciona ordenamiento
    this.dataSource.sort = this.sort;
  }

  cargarElementos(){
    this.listaUsuario = this.soporteitService.getUsuario();
    this.dataSource = new MatTableDataSource(this.listaUsuario);
  }

>>>>>>> 8801c8445a607643e6bfd1f9651fda04cf9da8e4
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
