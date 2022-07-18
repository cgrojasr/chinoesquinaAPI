package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.models.Venta;
import com.upc.chinoesquina.repositories.ProductoVentaRepository;
import com.upc.chinoesquina.repositories.PromocionRepository;
import com.upc.chinoesquina.repositories.VentaDetalleRepository;
import com.upc.chinoesquina.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class VentaBL {
    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private PromocionRepository promocionRepository;

    @Autowired
    private ProductoVentaRepository productoVentaRepository;

    @Autowired
    private VentaDetalleRepository ventaDetalleRepository;

    public Venta Registrar(Venta objVenta){
        Date fechaActual = new Date(System.currentTimeMillis());
        objVenta.setEliminado(false);
        objVenta.setFecha(fechaActual);
        objVenta.setFechaRegistro(fechaActual);
        return ventaRepository.save(objVenta);
    }

    public Venta BuscarPorId(Integer idVenta){
        return ventaRepository.findById(idVenta).orElse(null);
    }
}
