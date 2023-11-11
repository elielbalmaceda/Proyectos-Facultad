package com.gestion.elementos.inventario.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.elementos.inventario.Modelo.elementos;
import com.gestion.elementos.inventario.Repositorio.elementoRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class ElementoControlador {

    @Autowired
    private elementoRepositorio repositorio;

    @RequestMapping("/empleados")
    public List<elementos> listarTodosLosElementos() {
        return repositorio.findAll();
    }
}
