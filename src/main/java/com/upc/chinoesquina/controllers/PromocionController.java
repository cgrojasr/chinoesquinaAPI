package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.PromocionBL;
import com.upc.chinoesquina.models.Promocion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promocion")
public class PromocionController {
    @Autowired
    private PromocionBL objPromocionBL;

    @GetMapping
    public List<Promocion> ListarTodo(){
        return objPromocionBL.ListarTodo();
    }

    @GetMapping("/{idPromocion}")
    public Optional<Promocion> BuscarPorId(@PathVariable Integer idPromocion){
        return objPromocionBL.BuscarPorId(idPromocion);
    }

    @PostMapping
    public Promocion Registrar(@RequestBody Promocion objPromocion){
        return objPromocionBL.Registrar(objPromocion);
    }
}
