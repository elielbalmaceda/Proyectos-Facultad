package com.sinfloo.ejemplo01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElementoServiceImp implements ElementoService{
@Autowired
    private ElementoRepository Repository;
    
    public List<Elementos> listar() {
        return Repository.findAll();
    }

    @Override
    public Elementos listarIdNumInventario(int listarIdNumInventario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarIdNumInventario'");
    }

    @Override
    public Elementos add(Elementos E) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Elementos edit(Elementos E) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'edit'");
    }

    @Override
    public Elementos delete(int IdNumInventario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
