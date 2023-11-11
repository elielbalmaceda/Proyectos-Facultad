package com.gestion.elementos.inventario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "elementos")
public class elementos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Ninventario", length = 60, nullable = false, unique = true)
    private int Ninventario;

    @Column(name = "elemento", length = 60, nullable = false)
    private String elemento;

    @Column(name = "lugar", length = 60, nullable = false)
    private String lugar;

    @Column(name = "cantidad", length = 60, nullable = false)
    private int cantidad;

    public elementos() {

    }

    public elementos(Long id, int ninventario, String elemento, String lugar, int cantidad) {
        this.id = id;
        Ninventario = ninventario;
        this.elemento = elemento;
        this.lugar = lugar;
        this.cantidad = cantidad;
    }

    public int getNinventario() {
        return Ninventario;
    }

    public void setNinventario(int ninventario) {
        Ninventario = ninventario;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
