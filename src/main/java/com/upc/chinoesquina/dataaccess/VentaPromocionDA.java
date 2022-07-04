package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IVentaPromocion;
import com.upc.chinoesquina.models.VentaPromocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaPromocionDA {
    @Autowired
    private IVentaPromocion repository;

    public VentaPromocion Registrar(VentaPromocion objVentaPromocion){
        return repository.save(objVentaPromocion);
    }
}
