package com.sinfloo.ejemplo01;

import org.springframework.data.repository.Repository;
import java.util.*;

public interface ElementoRepository extends Repository<Elementos, Integer>{
    List<Elementos>findAll();
    Elementos findOne(int IdNumInventario);
    Elementos save(Elementos E);
    void delete (Elementos E);
}
