import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { InicioComponent } from './inicio/inicio.component';
import { UsuariosComponent } from './soporteit/soporteit.component'; //Quedo en usuarios
import { ReportesComponent } from './reportes/reportes.component';
import { CrearElementoComponent } from './soporteit/crear-elemento/crear-elemento.component';

const routes: Routes = [
  { path: '', component: DashboardComponent, children:[
    { path: '', component: InicioComponent},
    { path: 'soporteit', component: UsuariosComponent},
    { path: 'reportes', component: ReportesComponent},
    { path: 'crear-elemento', component: CrearElementoComponent},
  ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }
