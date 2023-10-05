import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  form: FormGroup
  loading =false //Funciona false para que me aparezca despues de completar el formulario de logueo

  constructor(private fb:FormBuilder, private _snackBar: MatSnackBar) { 
    this.form =this.fb.group({
      usuario: ['', Validators.required],
      password: ['', Validators.required]
      
    })
  }
  
  ngOnInit(): void {
    
  }

  ingresar(){
    const usuario = this.form.value.usuario
    const password = this.form.value.password

    if(usuario == 'ebalmaceda' && password == 'Clavenueva1'){
      //Redireccionamos al dashboard
      this.fakeLoading();
    } else{
      this.error();
      this.form.reset();
    }
  }
  error(){
    this._snackBar.open('Usuario o contraseña incorrecta, volve a intentar','',{
      duration:5000,
      horizontalPosition: 'center',
      verticalPosition: 'top'
    })
  }

  fakeLoading(){
    this.loading = true;
    setTimeout(() => {

    //Redireccionamos al dashboard
      this.loading = false;
    },1500);
    }
  

}
