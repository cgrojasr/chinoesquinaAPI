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

    @GetMapping
    public List<Cliente> ListarTodo(){
        return objClienteBL.ListarTodo();
    }

    @GetMapping("/{idCliente}")
    public Optional<Cliente> BuscarPorId(@PathVariable Integer idCliente){
        return objClienteBL.BuscarPorId(idCliente);
    }

    @PostMapping
    public Cliente Registrar(@RequestBody Cliente objCliente){
        return  objClienteBL.Registrar(objCliente);
    }
}
