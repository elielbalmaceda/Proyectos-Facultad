package com.tutorial.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.entity.Producto; //Recorda de importar clases sino no va a funcionar

import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional <Producto> findByNombre(String nombre);
    boolean existsByNombre (String nombre);
}
