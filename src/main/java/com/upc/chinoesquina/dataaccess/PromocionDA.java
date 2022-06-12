package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IPromocionDA;
import com.upc.chinoesquina.models.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public Boolean Eliminar(Integer idPromocion){
        repository.deleteById(idPromocion);
        return true;
    }

    public List<Promocion> ListarPorNombre(String nombre){
        return repository.findByNombre(nombre);
    }

    public List<Promocion> ListarPorDescripcion(String descripcion){
        return repository.findByDescripcion(descripcion);
    }

    public List<Promocion> ListarPorNombreYDescripcion(String nombre, String descripcion){
        return repository.findByNombreAndDescripcion(nombre, descripcion);
    }

    public List<Promocion> ListarPorContenerDescripcion(String descripcion){
        return repository.findByDescripcionContains(descripcion);
    }

    public List<Promocion> ListarPorRangoFechas(Date fechaInicio, Date fechaFinal){
        return repository.findByFecha(fechaInicio, fechaFinal);
    }
}
