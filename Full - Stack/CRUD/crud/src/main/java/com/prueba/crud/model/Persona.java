package com.prueba.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Persona{
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column
    private long numDocumento;
    
    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private String correoElectronico;






}
