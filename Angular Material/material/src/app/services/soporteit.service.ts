import { Injectable } from '@angular/core';
import { Usuario } from '../interfaces/usuario';

@Injectable({
    providedIn: 'root'
  })
  export class SoporteitService {

    listaUsuario: Usuario[] = [
        { NdeInventario: 1, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
        { NdeInventario: 2, elemento :"Mouse", lugar:"Deposito", cantidad:"15"},
        { NdeInventario: 3, elemento :"VGA a HDMI", lugar:"Soporte IT", cantidad:"5"},
        { NdeInventario: 3, elemento :"Teclado", lugar:"Deposito", cantidad:"12"},
        { NdeInventario: 2, elemento :"HDMI", lugar:"Soporte IT", cantidad:"3"},
        { NdeInventario: 4, elemento :"Pila recargable", lugar:"Soporte IT", cantidad:"4"},
        { NdeInventario: 5, elemento :"Cable Schuko", lugar:"Soporte IT", cantidad:"7"},
        { NdeInventario: 6, elemento :"Monitor Samsung", lugar:"Deposito", cantidad:"10"},
      ];
      constructor() { }
      
      getSoporteit: any; //??????
      getUsuario(){
        return this.listaUsuario.slice();
      }
      
      eliminarUsuario(index : number){
        this.listaUsuario.splice(index, 1);
      }

      agregarElemento(Usuario: Usuario){
        this.listaUsuario.unshift(Usuario); //Con el metodo push pone los cambios nuevos, pero pongo el metodo unshift que guarda los cambios en el array de datos 
      }
}
