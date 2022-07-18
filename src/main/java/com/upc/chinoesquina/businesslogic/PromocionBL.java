package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.models.Promocion;
import com.upc.chinoesquina.repositories.PromocionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromocionBL {
    @Autowired
    private PromocionRepository promocionRepository;

    public List<Promocion> ListarTodo(){
        return  promocionRepository.findAll();
    }

    public Promocion Registrar(Promocion objPromocion){

        objPromocion.setFechaRegistro(new Date(System.currentTimeMillis()));
        return  promocionRepository.save(objPromocion);
    }

    public Promocion BuscarPorId(Integer idPromocion){
        return promocionRepository.findById(idPromocion).orElse(null);
    }

    public Promocion Modificar(Promocion objPromocion){
        Promocion objPromocionDB = BuscarPorId(objPromocion.getIdPromocion());
        objPromocion.setFechaRegistro(objPromocionDB.getFechaRegistro());
        objPromocion.setIdUsuarioRegistro(objPromocionDB.getIdUsuarioRegistro());
        objPromocion.setFechaModifico(new Date(System.currentTimeMillis()));
        return  promocionRepository.save(objPromocion);
    }

    public Boolean Eliminar(Integer idPromocion){
        promocionRepository.deleteById(idPromocion);
        return true;
    }

    public List<Promocion> ListarPorFiltros(String nombre, String descripcion){
        if(nombre != null && descripcion != null)
            return promocionRepository.findByNombreAndDescripcion(nombre, descripcion);
        else if(nombre != null & descripcion == null)
            return promocionRepository.findByNombreContains(nombre);
        else if(nombre == null & descripcion != null)
            return promocionRepository.findByDescripcionContains(descripcion);
        else
            return  promocionRepository.findAll();
    }

    public List<Promocion> ListarPorFecha(Date fecha){
        return promocionRepository.findByFecha(fecha);
    }
}
