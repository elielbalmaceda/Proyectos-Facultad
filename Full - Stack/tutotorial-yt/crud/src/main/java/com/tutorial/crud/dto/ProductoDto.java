package com.tutorial.crud.dto;

import javax.validation.constraints.Min;

public class ProductoDto {

    @NotBlank
    private String nombre;
    private float precio;
 
    public ProductoDto(){
        
    }

    public ProductoDto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
