package com.sinfloo.ejemplo01;

import jakarta.persistence.*;

@Entity
@Table(name="elementos")
public class Elementos {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNumInventario;
    @Column
    private String nombre;
    @Column
    private String estado;
    @Column 
    private String lugar;
    @Column
    private String usuario;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
