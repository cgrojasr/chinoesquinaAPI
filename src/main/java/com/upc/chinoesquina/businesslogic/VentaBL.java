package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.VentaDA;
import com.upc.chinoesquina.dataaccess.VentaDetalleDA;
import com.upc.chinoesquina.dataaccess.VentaPromocionDA;
import com.upc.chinoesquina.models.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaBL {
    @Autowired
    private VentaDA objVentaDA;
    private VentaDetalleDA objVentaDetalleDA;
    private VentaPromocionDA objVentaPromocionDA;

    public Venta Registrar(VentaDA objVentaDA){
        return null;
    }
}
