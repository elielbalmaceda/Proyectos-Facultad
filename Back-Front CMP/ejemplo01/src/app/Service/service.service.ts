import { Injectable } from '@angular/core';
import {HttpClient } from '@angular/common/http'
import { Inventario } from '../Modelo/Inventario';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  Url = 'http://localhost:8080/ejemplo01/inventario';

  getInventario(){
    return this.http.get<Inventario[]>(this.Url)
  }
}
