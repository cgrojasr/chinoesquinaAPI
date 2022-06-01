package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.ClienteDA;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteBL {
    @Autowired
    private ClienteDA objClienteDA;

    public List<Cliente> findAll(){
        return  objClienteDA.findAll();
    }
}
