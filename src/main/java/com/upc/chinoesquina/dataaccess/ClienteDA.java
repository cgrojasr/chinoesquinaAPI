package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IClienteDA;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteDA {
    @Autowired
    private IClienteDA repository;

    public List<Cliente> ListarTodo(){
        return repository.findAll();
    }
    public Optional<Cliente> BuscarPorId(Integer idCliente){
        return repository.findById(idCliente);
    }

    public Cliente Registrar(Cliente objCliente){
        return repository.save(objCliente);
    }
}
