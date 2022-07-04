package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IVentaDetalleDA;
import com.upc.chinoesquina.models.VentaDetalle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaDetalleDA {
    @Autowired
    private IVentaDetalleDA repository;

    public VentaDetalle Registrar(VentaDetalle objVentaDetalle){
        return repository.save(objVentaDetalle);
    }
}
