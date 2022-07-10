package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IVentaDA;
import com.upc.chinoesquina.models.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaDA {
    @Autowired
    private IVentaDA repository;

    public Venta Registrar(Venta objVenta){
        return repository.save(objVenta);
    }

    public Venta BuscarPorId(Integer idVenta) {
        return repository.findById(idVenta).orElse(null);
    }
}
