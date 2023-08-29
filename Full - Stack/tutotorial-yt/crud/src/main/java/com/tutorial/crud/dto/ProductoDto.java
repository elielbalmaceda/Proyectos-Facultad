package com.tutorial.crud.dto;

//No funciona esta anotacion y tampoco la importacion
//Queda solucionar problema 18/8
@NotBlank

public class ProductoDto {

    
    private String nombre;
    private float precio;
 
    public ProductoDto(){
        
    }

    public ProductoDto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
