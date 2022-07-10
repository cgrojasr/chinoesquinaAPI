package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.VentaBL;
import com.upc.chinoesquina.models.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaBL objVentaBL;

    @GetMapping("/{idVenta}")
    public Venta BuscarPorId(@PathVariable Integer idVenta){
        return objVentaBL.BuscarPorId(idVenta);
    }

    @PostMapping
    public Venta Registrar(@RequestBody Venta objVenta){
        return objVentaBL.Registrar(objVenta);
    }
}
