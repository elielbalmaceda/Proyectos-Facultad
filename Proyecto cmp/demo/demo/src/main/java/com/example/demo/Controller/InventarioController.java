package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Repository.InventarioRepository;
import Entity.Inventario;
import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {
    
    private final InventarioRepository inventarioRepository;

    public InventarioController(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    @PostMapping
    public Inventario agregarInventario(@RequestBody Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @GetMapping
    public List<Inventario> obtenerTodoElInventario() {
        return inventarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Inventario obtenerInventarioPorId(@PathVariable Long id) {
        return inventarioRepository.findById(id)
        .orElseThrow(() -> new InventarioNotFoundException(id));
    }

    @PutMapping("/{id}")
    public Inventario actualizarInventario(@PathVariable Long id, @RequestBody Inventario inventarioActualizado) {
        return inventarioRepository.findById(id)
                .map(inventario -> {
                    inventario.setNombre(inventarioActualizado.getNombre());
                    inventario.setEstado(inventarioActualizado.getEstado());
                    inventario.setLugar(inventarioActualizado.getLugar());
                    inventario.setUsuario(inventarioActualizado.getUsuario());
                    return inventarioRepository.save(inventario);
                })
                .orElseThrow(() -> new InventarioNotFoundException(id));
    }

    @DeleteMapping("/{id}")
    public void eliminarInventario(@PathVariable Long id) {
        inventarioRepository.deleteById(id);
    }
}
