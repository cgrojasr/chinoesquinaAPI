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
        objCliente.setFechaRegistro(new Date(System.currentTimeMillis()));
        objCliente.setEliminado(false);
        return  objClienteDA.Registrar(objCliente);
    }

    public Cliente Modificar(Cliente objCliente) {
        Cliente objClienteDB = objClienteDA.BuscarPorId(objCliente.getIdCliente());
        objCliente.setIdUsuarioRegistro(objClienteDB.getIdUsuarioRegistro());
        objCliente.setFechaRegistro(objClienteDB.getFechaRegistro());
        objCliente.setFechaModifico(new Date(System.currentTimeMillis()));
        return objClienteDA.Registrar(objCliente);
    }

    public Boolean Eliminar(Integer idCliente) {
        return objClienteDA.Eliminar(idCliente);
    }

    public List<Cliente> ListarConFiltros(Integer tipo, String nombre, String apellido, Integer idDocumentoIdentidad, String nroDocumento) {
        if(tipo == 1) {
            if(nombre == null && apellido == null)
                return objClienteDA.ListarTodo();
            else if(nombre != null && apellido == null)
                return objClienteDA.BuscarPorNombre(nombre);
            else if(nombre == null && apellido != null)
                return objClienteDA.BuscarPorApellido(apellido);
            else
                return objClienteDA.BuscarPorNombreYApellido(nombre, apellido);
        } else {
            if(idDocumentoIdentidad == null && nroDocumento == null)
                return objClienteDA.ListarTodo();
            else if(idDocumentoIdentidad != null && nroDocumento == null)
                return objClienteDA.ListarPorTipoDocIdentidad(idDocumentoIdentidad);
            else if(idDocumentoIdentidad == null && nroDocumento != null)
                return objClienteDA.ListarContieneNroDocumento(nroDocumento);
            else
                return objClienteDA.ListarPorTipoDocIdentidadYNroDocumento(idDocumentoIdentidad, nroDocumento);
        }
    }

    public List<Cliente> ListarPorNroDocumento(String nroDocumento){
        return objClienteDA.ListarPorNroDocumento(nroDocumento);
    }

    public List<Cliente> ListarContieneNroDocumento(String nroDocumento){
        return objClienteDA.ListarContieneNroDocumento(nroDocumento);
    }

    public List<Cliente> ListarPorTipoDocIdentidad(Integer idDocumentoIdentidad){
        return objClienteDA.ListarPorTipoDocIdentidad(idDocumentoIdentidad);
    }

    public List<Cliente> ListarPorEmail(String email){
        return objClienteDA.ListarPorEmail(email);
    }
}
