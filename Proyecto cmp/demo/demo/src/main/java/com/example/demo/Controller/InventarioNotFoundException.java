package com.example.demo.Controller;

public class InventarioNotFoundException extends RuntimeException {
    public InventarioNotFoundException(Long id) {
        super("No se pudo encontrar el inventario con el ID: " + id);
    }
}

