package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.ClienteDA;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteBL {
    @Autowired
    private ClienteDA objClienteDA;

    public List<Cliente> ListarTodo(){
        return  objClienteDA.ListarTodo();
    }

    public Optional<Cliente> BuscarPorId(Integer idCliente){
        return objClienteDA.BuscarPorId(idCliente);
    }

    public Cliente Registrar(Cliente objCliente) {
        return  objClienteDA.Registrar(objCliente);
    }
}
