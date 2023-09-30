package com.sinfloo.ejemplo01;

import java.util.*;

public interface ElementoService {

    List<Elementos>listar();
    Elementos listarIdNumInventario( int listarIdNumInventario);
    Elementos add(Elementos E);
    Elementos edit(Elementos E);
    Elementos delete(int IdNumInventario);
}
