package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.ClienteBL;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteBL objClienteBL;

    @GetMapping("/findAll")
    public List<Cliente> findAll(){
        return objClienteBL.findAll();
    }
}
