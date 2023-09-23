package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Entity.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {
    // Tengo que preguntar como hacer una consulta
}
