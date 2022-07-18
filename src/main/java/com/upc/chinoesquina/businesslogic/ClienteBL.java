package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.models.Cliente;
import com.upc.chinoesquina.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClienteBL {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> ListarTodo(){
        return  clienteRepository.findAll();
    }

    public Cliente BuscarPorId(Integer idCliente){
        return clienteRepository.findById(idCliente).orElse(null);
    }

    public Cliente Registrar(Cliente objCliente) {
        objCliente.setFechaRegistro(new Date(System.currentTimeMillis()));
        objCliente.setEliminado(false);
        return  clienteRepository.save(objCliente);
    }

    public Cliente Modificar(Cliente objCliente) {
        Cliente objClienteDB = BuscarPorId(objCliente.getIdCliente());
        objCliente.setIdUsuarioRegistro(objClienteDB.getIdUsuarioRegistro());
        objCliente.setFechaRegistro(objClienteDB.getFechaRegistro());
        objCliente.setFechaModifico(new Date(System.currentTimeMillis()));
        return clienteRepository.save(objCliente);
    }

    public Boolean Eliminar(Integer idCliente) {
        clienteRepository.deleteById(idCliente);
        return true;
    }

    public List<Cliente> ListarConFiltros(Integer tipo, String nombre, String apellido, Integer idDocumentoIdentidad, String nroDocumento) {
        if(tipo == 1) {
            if(nombre == null && apellido == null)
                return clienteRepository.findAll();
            else if(nombre != null && apellido == null)
                return clienteRepository.findByNombre(nombre);
            else if(nombre == null && apellido != null)
                return clienteRepository.findByApellido(apellido);
            else
                return clienteRepository.findByNombreAndApellido(nombre, apellido);
        } else {
            if(idDocumentoIdentidad == null && nroDocumento == null)
                return clienteRepository.findAll();
            else if(idDocumentoIdentidad != null && nroDocumento == null)
                return clienteRepository.findByDocumentoIdentidadIdDocumentoIdentidad(idDocumentoIdentidad);
            else if(idDocumentoIdentidad == null && nroDocumento != null)
                return clienteRepository.findByNroDocumentoContains(nroDocumento);
            else
                return clienteRepository.findByIdDocumentoIdentidadAndNroDocumento(idDocumentoIdentidad, nroDocumento);
        }
    }

    public List<Cliente> ListarPorNroDocumento(String nroDocumento){
        return clienteRepository.findByNroDocumento(nroDocumento);
    }

    public List<Cliente> ListarContieneNroDocumento(String nroDocumento){
        return clienteRepository.findByNroDocumentoContains(nroDocumento);
    }

    public List<Cliente> ListarPorTipoDocIdentidad(Integer idDocumentoIdentidad){
        return clienteRepository.findByDocumentoIdentidadIdDocumentoIdentidad(idDocumentoIdentidad);
    }

    public List<Cliente> ListarPorEmail(String email){
        return clienteRepository.findByEmail(email);
    }
}
