import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Usuario } from 'src/app/interfaces/usuario';
import { SoporteitService } from 'src/app/services/soporteit.service';

@Component({
  selector: 'app-crear-elemento',
  templateUrl: './crear-elemento.component.html',
  styleUrls: ['./crear-elemento.component.css']
})
export class CrearElementoComponent {
 lugar: any[] =['Deposito' , 'Soporte it']
 form: FormGroup;

  constructor( private fb: FormBuilder,  //De esta manera inyecto dependencias del service
               private soporteitService : SoporteitService,
               private router: Router){  
    this.form =this.fb.group({
      NdeInventario: ['' , Validators.required],
      elemento: ['' , Validators.required],
      lugar: ['' , Validators.required],
      cantidad: ['' , Validators.required],
    })
  } 
    ngOnInit():void{

    }
  agregarElemento(){
    console.log(this.form);
  
    const user: Usuario ={                        //Tenia error, porque lo dejaba fuera de la funcion agregarElemento()
    NdeInventario:this.form.value.NdeInventario,
    elemento: this.form.value.elemento,
    lugar: this.form.value.lugar,
    cantidad: this.form.value.cantidad,
    }

    console.log(user);

    this.soporteitService.agregarElemento(user);
    this.router.navigate(['/dashboard/soporteit']); //Asi puedo agregar un elemento y me riderecciona a la pagina donde tengo la lista de elementos
  }

}
 