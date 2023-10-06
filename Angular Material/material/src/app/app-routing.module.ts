import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';

//De esta manera se cargan las rutas para que vayan navegando de ruta en ruta y nos aparezca distintas partes de la pagina.
const routes: Routes =[
    { path: '', redirectTo: 'login', pathMatch: 'full'}, //Esto es para que redireccione directamente a localhost:4200.
    { path: 'login', component: LoginComponent }, //Con este solo directo va a localhost:4200/login.
    { path: 'dashboard', loadChildren: () => import('./components/dashboard/dashboard.module').then(x => x.DashboardModule) },//Carga perezosa, significa que el usuario a medida que navega por el programa, se le vayan bajando mas componentes.
    { path: '**', redirectTo: 'login', pathMatch: 'full'} //Esto para que vaya directamente a login si ponemos algo mal como localhost:4200/sdasda.
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}