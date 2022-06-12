package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.PromocionDA;
import com.upc.chinoesquina.models.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PromocionBL {
    @Autowired
    private PromocionDA objPromocionDA;

    public List<Promocion> ListarTodo(){
        return  objPromocionDA.ListarTodo();
    }

    public Promocion Registrar(Promocion objPromocion){

        objPromocion.setFechaRegistro(new Date(System.currentTimeMillis()));
        return  objPromocionDA.Registrar(objPromocion);
    }

    public Promocion BuscarPorId(Integer idPromocion){
        return objPromocionDA.BuscarPorId(idPromocion);
    }

    public Promocion Modificar(Promocion objPromocion){
        Promocion objPromocionDB = objPromocionDA.BuscarPorId(objPromocion.getIdPromocion());
        objPromocion.setFechaRegistro(objPromocionDB.getFechaRegistro());
        objPromocion.setIdUsuarioRegistro(objPromocionDB.getIdUsuarioRegistro());
        objPromocion.setFechaModifico(new Date(System.currentTimeMillis()));
        return objPromocionDA.Registrar(objPromocion);
    }

    public Boolean Eliminar(Integer idPromocion){
        return objPromocionDA.Eliminar(idPromocion);
    }

    public List<Promocion> ListarPorFiltros(String nombre, String descripcion){
        if(nombre != null && descripcion != null)
            return objPromocionDA.ListarPorNombreYDescripcion(nombre, descripcion);
        else if(nombre != null & descripcion == null)
            return objPromocionDA.ListarPorNombre(nombre);
        else if(nombre == null & descripcion != null)
            return objPromocionDA.ListarPorContenerDescripcion(descripcion);
        else
            return  objPromocionDA.ListarTodo();
    }

    public List<Promocion> ListarPorRangoFechas(Date fechaInicio, Date fechaFinal){
        return objPromocionDA.ListarPorRangoFechas(fechaInicio, fechaFinal);
    }
}
