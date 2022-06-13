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
    public Cliente BuscarPorId(@PathVariable Integer idCliente){
        return objClienteBL.BuscarPorId(idCliente);
    }

    @PostMapping
    public Cliente Registrar(@RequestBody Cliente objCliente){
        return  objClienteBL.Registrar(objCliente);
    }

    @PutMapping
    public Cliente Modificar(@RequestBody Cliente objCliente){
        return  objClienteBL.Modificar(objCliente);
    }

    @DeleteMapping("/{idCliente}")
    public Boolean Eliminar(@PathVariable Integer idCliente){
        return objClienteBL.Eliminar(idCliente);
    }

    @GetMapping("/filtros")
    public List<Cliente> ListarConFiltros(@RequestParam(value = "nombre", required = false) String nombre,
                                          @RequestParam(value = "apellido", required = false) String apellido){
        return objClienteBL.ListarConFiltros(nombre, apellido);
    }

    @GetMapping("/documento")
    public List<Cliente> ListarPorNroDocumento(@RequestParam("nroDocumento") String nroDocumento){
        return objClienteBL.ListarPorNroDocumento(nroDocumento);
    }

    @GetMapping("/nrodocumento")
    public List<Cliente> ListarContieneNroDocumento(@RequestParam("nroDocumento") String nroDocumento){
        return objClienteBL.ListarContieneNroDocumento(nroDocumento);
    }

    @GetMapping("/id")
    public List<Cliente> ListarPorIdDocumentoIdentidad(@RequestParam("idDocumentoIdentidad") Integer idDocumentoIdentidad){
        return objClienteBL.ListarPorIdDocumentoIdentidad(idDocumentoIdentidad);
    }

    @GetMapping("/sp")
    public List<Cliente> ListarPorCorreo(@RequestParam("email") String email){
        return objClienteBL.ListarPorCorreo(email);
    }
}
