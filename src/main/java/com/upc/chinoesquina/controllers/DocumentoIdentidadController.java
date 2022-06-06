package com.upc.chinoesquina.controllers;

import com.upc.chinoesquina.businesslogic.DocumentoIdentidadBL;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/documentoidentidad")
public class DocumentoIdentidadController {
    @Autowired
    private DocumentoIdentidadBL objDocumentoIdentidadBL;

    @GetMapping
    public List<DocumentoIdentidad> ListarTodo(){
        return objDocumentoIdentidadBL.ListarTodo();
    }
}
