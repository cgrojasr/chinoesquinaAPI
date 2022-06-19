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


    @GetMapping("/{tipo}/filtros")
    public List<Cliente> ListarConFiltros(@PathVariable Integer tipo,
                                          @RequestParam(value = "nombre", required = false) String nombre,
                                          @RequestParam(value = "apellido", required = false) String apellido,
                                          @RequestParam(value = "idDocumentoIdentidad", required = false) Integer idDocumentoIdentidad,
                                          @RequestParam(value = "nroDocumento", required = false) String nroDocumento){
        return objClienteBL.ListarConFiltros(tipo, nombre, apellido, idDocumentoIdentidad, nroDocumento);
    }

    @GetMapping("/documento")
    public List<Cliente> ListarPorNroDocumento(@RequestParam("nroDocumento") String nroDocumento){
        return objClienteBL.ListarPorNroDocumento(nroDocumento);
    }

    @GetMapping("/sp")
    public List<Cliente> ListarPorEmail(@RequestParam("email") String email){
        return objClienteBL.ListarPorEmail(email);
    }
}
