package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IClienteDA;
import com.upc.chinoesquina.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteDA {
    @Autowired
    private IClienteDA repository;

    public List<Cliente> ListarTodo(){
        return repository.findAll();
    }

    public Cliente BuscarPorId(Integer idCliente){
        return repository.findById(idCliente).orElseThrow(()-> new EntityNotFoundException());
    }

    public Cliente Registrar(Cliente objCliente){
        return repository.save(objCliente);
    }

    public Boolean Eliminar(Integer idCliente){
        repository.deleteById(idCliente);
        return true;
    }

    public List<Cliente> BuscarPorNombreYApellido(String nombre, String apellido) {
        return repository.findByNombreAndApellido(nombre, apellido);
    }

    public List<Cliente> BuscarPorNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

    public List<Cliente> BuscarPorApellido(String apellido) {
        return repository.findByApellido(apellido);
    }

    public List<Cliente> ListarPorNroDocumento(String nroDocumento){
        return repository.findByNroDocumento(nroDocumento);
    }

    public List<Cliente> ListarContieneNroDocumento(String nroDocumento){
        return repository.findByNroDocumentoContains(nroDocumento);
    }

    public List<Cliente> ListarPorIdDocumentoIdentidad(Integer idDocumentoIdentidad){
        return repository.findByIdDocumentoIdentidad(idDocumentoIdentidad);
    }

    public List<Cliente> ListarPorCorreo(String email){
        return repository.findByCorreo(email);
    }
}
