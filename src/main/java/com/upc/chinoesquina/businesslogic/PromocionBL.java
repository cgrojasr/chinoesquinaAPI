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

    public Optional<Promocion> BuscarPorId(Integer idPromocion){
        return objPromocionDA.BuscarPorId(idPromocion);
    }
}
