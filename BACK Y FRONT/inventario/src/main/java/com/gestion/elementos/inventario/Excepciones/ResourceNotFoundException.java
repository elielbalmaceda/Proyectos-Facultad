package com.gestion.elementos.inventario.Excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) //Osea que no se encontro un empleado
public class ResourceNotFoundException extends RuntimeException{ //Excepsion personalizada
    
    private static final long serialVersionUID =1L;

    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
