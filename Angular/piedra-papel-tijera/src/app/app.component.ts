import { Component } from '@angular/core';
import { Resultado } from './Resultado';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class JuegoComponent {
  resultado: Resultado | undefined;
  opciones = ['piedra', 'papel', 'tijera'];

  jugar(opcionJugador: string) {
    const opcionComputadora = this.opciones[Math.floor(Math.random() * this.opciones.length)];
    
    if (opcionJugador === opcionComputadora) {
      this.resultado = Resultado.Empate;
    } else if (
      (opcionJugador === 'piedra' && opcionComputadora === 'tijera') ||
      (opcionJugador === 'papel' && opcionComputadora === 'piedra') ||
      (opcionJugador === 'tijera' && opcionComputadora === 'papel')
    ) {
      this.resultado = Resultado.Victoria;
    } else {
      this.resultado = Resultado.Derrota;
    }
  }

  reiniciarJuego() {
    this.resultado = undefined;
  }
}

