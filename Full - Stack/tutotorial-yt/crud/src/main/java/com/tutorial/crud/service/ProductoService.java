package com.tutorial.crud.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; //Se importa la clase de service
import com.tutorial.crud.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import com.tutorial.crud.entity.Producto;

import java.util.List;
import java.util.Optional;

@Service //Le indicamos que es un servicio
@Transactional
public class ProductoService {
    
    @Autowired //Cuando sea necesario spring se ocupe de crear una instancia del repositorio
    ProductoRepository productoRepository; //Se inyecta 

    public List <Producto>list(){
        return productoRepository.findAll();
    }

    public Optional <Producto> getOne(int id){
        return productoRepository.findById(id);
    }

    public Optional <Producto> getByNombre (String nombre){
        return productoRepository.findByNombre(nombre);
    }
    public void save (Producto producto){
        productoRepository.save(producto);
    }

    public void delete(int id){
        productoRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return productoRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre){
        return productoRepository.existsByNombre(nombre);
    }

}
