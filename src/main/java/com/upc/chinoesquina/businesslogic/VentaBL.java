package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.PromocionDA;
import com.upc.chinoesquina.dataaccess.VentaDA;
import com.upc.chinoesquina.dataaccess.VentaDetalleDA;
import com.upc.chinoesquina.dataaccess.VentaPromocionDA;
import com.upc.chinoesquina.dataaccess.interfaces.IProductoVenta;
import com.upc.chinoesquina.dataaccess.interfaces.IVentaDetalleDA;
import com.upc.chinoesquina.models.ProductoVenta;
import com.upc.chinoesquina.models.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VentaBL {
    @Autowired
    private VentaDA objVentaDA;

    @Autowired
    private PromocionDA objPromocionDA;

    @Autowired
    private IProductoVenta objProductoVentaRepository;

    @Autowired
    private IVentaDetalleDA objVentaDetalleRepository;

    public Venta Registrar(Venta objVenta){
        Date fechaActual = new Date(System.currentTimeMillis());
        objVenta.setEliminado(false);
        objVenta.setFecha(fechaActual);
        objVenta.setFechaRegistro(fechaActual);
        return objVentaDA.Registrar(objVenta);
    }

    public Venta BuscarPorId(Integer idVenta){
        return objVentaDA.BuscarPorId(idVenta);
    }
}
