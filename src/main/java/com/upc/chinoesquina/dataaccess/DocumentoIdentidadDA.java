package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IDocumentoIdentidadDA;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoIdentidadDA {
    @Autowired
    private IDocumentoIdentidadDA repository;

    public List<DocumentoIdentidad> ListarTodo(){
        return repository.findAll();
    }
}
