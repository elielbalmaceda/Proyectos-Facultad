import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DashboardRoutingModule } from './dashboard-routing.module';
import { SharedModule } from '../shared/shared.module';
import { DashboardComponent } from './dashboard.component';
import { InicioComponent } from './inicio/inicio.component';
import { NadvarComponent } from './navbar/navbar.component';
import { UsuariosComponent } from './soporteit/soporteit.component'; 
import { ReportesComponent } from './reportes/reportes.component';
import { CrearElementoComponent } from './soporteit/crear-elemento/crear-elemento.component'; //Importe modulos de material


@NgModule({
  declarations: [
    DashboardComponent,
    InicioComponent,
    NadvarComponent,
    UsuariosComponent,
    ReportesComponent,
    CrearElementoComponent
  ],
  imports: [
    CommonModule,
    DashboardRoutingModule,
    SharedModule
  ]
})
export class DashboardModule { }
