package com.gestion.elementos.inventario.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.elementos.inventario.Modelo.elementos;

@Repository
public interface elementoRepositorio extends JpaRepository <elementos, Long>{
    
}
