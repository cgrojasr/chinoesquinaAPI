package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.DocumentoIdentidadBL;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/documentoidentidad")
public class DocumentoIdentidadController {
    @Autowired
    private DocumentoIdentidadBL objDocumentoIdentidadBL;

    @GetMapping
    public List<DocumentoIdentidad> ListarTodo(){
        return objDocumentoIdentidadBL.ListarTodo();
    }

    @PostMapping
    public DocumentoIdentidad Registrar(@RequestBody DocumentoIdentidad objDocumentoIDentidad){
        return objDocumentoIdentidadBL.Registrar(objDocumentoIDentidad);
    }

    @PutMapping
    public DocumentoIdentidad Modificar(@RequestBody DocumentoIdentidad objDocumentoIDentidad){
        return objDocumentoIdentidadBL.Modificar(objDocumentoIDentidad);
    }

    @GetMapping("/{idDocumentoIdentidad}")
    public ResponseEntity<DocumentoIdentidad> BuscarPorId(@PathVariable Integer idDocumentoIdentidad){
        return new ResponseEntity(objDocumentoIdentidadBL.BuscarPorId(idDocumentoIdentidad), HttpStatus.OK);
    }

    @DeleteMapping("/{idDocumentoIdentidad}")
    public Boolean Eliminar(@PathVariable Integer idDocumentoIdentidad){
        return objDocumentoIdentidadBL.Eliminar(idDocumentoIdentidad);
    }
}
