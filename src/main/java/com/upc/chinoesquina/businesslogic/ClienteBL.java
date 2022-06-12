package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.ClienteDA;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteBL {
    @Autowired
    private ClienteDA objClienteDA;

    public List<Cliente> ListarTodo(){
        return  objClienteDA.ListarTodo();
    }

    public Cliente BuscarPorId(Integer idCliente){
        return objClienteDA.BuscarPorId(idCliente);
    }

    public Cliente Registrar(Cliente objCliente) {
        objCliente.setFecha_registro(new Date(System.currentTimeMillis()));
        return  objClienteDA.Registrar(objCliente);
    }

    public Cliente Modificar(Cliente objCliente) {
        Cliente objClienteDB = objClienteDA.BuscarPorId(objCliente.getIdCliente());
        objCliente.setId_usuario_registro(objClienteDB.getId_usuario_registro());
        objCliente.setFecha_registro(objClienteDB.getFecha_registro());
        objCliente.setFecha_modifico(new Date(System.currentTimeMillis()));
        return objClienteDA.Registrar(objCliente);
    }

    public Boolean Eliminar(Integer idCliente) {
        return objClienteDA.Eliminar(idCliente);
    }

    public List<Cliente> ListarConFiltros(String nombre, String apellido) {
        if(nombre == null && apellido == null)
            return objClienteDA.ListarTodo();
        else if(nombre != null && apellido == null)
            return objClienteDA.BuscarPorNombre(nombre);
        else if(nombre == null && apellido != null)
            return objClienteDA.BuscarPorApellido(apellido);
        else
            return objClienteDA.BuscarPorNombreYApellido(nombre, apellido);
    }
}
