package com.upc.chinoesquina.dataaccess;

import com.upc.chinoesquina.dataaccess.interfaces.IDocumentoIdentidadDA;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoIdentidadDA {
    @Autowired
    private IDocumentoIdentidadDA repository;

    public List<DocumentoIdentidad> ListarTodo(){
        return repository.findAll();
    }

    public Optional<DocumentoIdentidad> BuscarPorId(Integer idDocumentoIdentidad) {
        return repository.findById(idDocumentoIdentidad);
    }

    public DocumentoIdentidad Registrar(DocumentoIdentidad objDocumentoIdentidad){
        return repository.save(objDocumentoIdentidad);
    }

    public DocumentoIdentidad Modificar(DocumentoIdentidad objDocumentoIdentidad){
        return repository.save(objDocumentoIdentidad);
    }

    public Boolean Elimininar(Integer idDocumentoIdentidad) {
        repository.deleteById(idDocumentoIdentidad);
        return true;
    }
}
