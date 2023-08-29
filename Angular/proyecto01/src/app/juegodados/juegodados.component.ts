import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-juegodados',
  templateUrl: './juegodados.component.html',
  styleUrls: ['./juegodados.component.css']
})
export class JuegodadosComponent implements OnInit{
valor1: number;
valor2: number;
valor3: number;
resultado: string="";
constructor(){
  this.valor1 = this.retornarAleatorio();
  this.valor2 = this.retornarAleatorio();
  this.valor3 = this.retornarAleatorio();
}
/*Agregamos la funcion de rotornarAleatorio() 
//que nos renotorne a la funcion Math.random(), 
que lo que hace es elegir un numero random segun los numeros que
 les especifiquemos, en este caso hasta 6 y que arranque del valor numero 1, ya que el dado no contiene 0*/
retornarAleatorio(){
  return Math.trunc(Math.random()* 6 ) + 1;
}
tirar(){
  this.valor1 = this.retornarAleatorio();
  this.valor2 = this.retornarAleatorio();
  this.valor3 = this.retornarAleatorio();
  if (this.valor1==this.valor2 && this.valor1==this.valor3)
  this.resultado='Gano';
  else
  this.resultado='Perdio';
}
ngOnInit(){
    
}
}
