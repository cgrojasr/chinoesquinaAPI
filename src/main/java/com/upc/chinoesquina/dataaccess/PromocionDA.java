package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IPromocionDA;
import com.upc.chinoesquina.models.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromocionDA {
    @Autowired
    private IPromocionDA repository;

    public List<Promocion> ListarTodo() {
        return repository.findAll();
    }

    public Promocion Registrar(Promocion objPromocion){
        return repository.save(objPromocion);
    }

    public Promocion BuscarPorId(Integer idPromocion){
        return repository.findById(idPromocion).orElse(null);
    }
    public Promocion Modificar(Promocion objPromocion){
        return repository.save(objPromocion);
    }
    public Boolean Eliminar(Integer idPromocion){
        repository.deleteById(idPromocion);
        return true;
    }
}
