package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.ClienteBL;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteBL objClienteBL;

    @GetMapping("/findAll")
    public List<Cliente> findAll(){
        return objClienteBL.findAll();
    }
    @GetMapping("/{idCliente}")
    public Optional<Cliente> findById(@PathVariable Integer idCliente){
        return objClienteBL.findById(idCliente);
    }
}
