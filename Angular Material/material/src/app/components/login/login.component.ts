import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  form: FormGroup
  loading =false //Funciona false para que me aparezca despues de completar el formulario de logueo

  constructor(private fb:FormBuilder, private _snackBar: MatSnackBar, private router: Router) { 
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

    if(usuario == 'ebalmaceda' && password == 'Clavenueva1'){ //Si el usuario pone ese usuario y contraseña ingresa
      
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

    //Una vez que ingresa le aparece el sppiner, cargando
  fakeLoading(){ 
    this.loading = true;
    setTimeout(() => {

    this.router.navigate(['dashboard']);
    },1500);
    }
  

}
