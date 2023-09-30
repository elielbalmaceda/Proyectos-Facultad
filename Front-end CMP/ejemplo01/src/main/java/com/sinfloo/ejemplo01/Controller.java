package com.sinfloo.ejemplo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@CrossOrigin(origins = "http://localhost:4200" ,maxAge = 3600)
@RestController
@RequestMapping({"/Elementos"})

public class Controller {
    @Autowired
    ElementoService service;

    @GetMapping
    public List<Elementos>listar(){
        return service.listar();
    }

}
