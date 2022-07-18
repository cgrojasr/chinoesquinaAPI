package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.models.DocumentoIdentidad;
import com.upc.chinoesquina.repositories.DocumentoIdentidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoIdentidadBL {
    @Autowired
    private DocumentoIdentidadRepository documentoIdentidadRepository;

    public List<DocumentoIdentidad> ListarTodo(){
        return documentoIdentidadRepository.findAll();
    }

    public DocumentoIdentidad Registrar(DocumentoIdentidad objDocumentoIdentidad){
        return documentoIdentidadRepository.save(objDocumentoIdentidad);
    }

    public DocumentoIdentidad Modificar(DocumentoIdentidad objDocumentoIdentidad){
        return documentoIdentidadRepository.save(objDocumentoIdentidad);
    }

    public Optional<DocumentoIdentidad> BuscarPorId(Integer idDocumentoIdentidad){
        return documentoIdentidadRepository.findById(idDocumentoIdentidad);
    }

    public Boolean Eliminar(Integer idDocumentoIdentidad){
        documentoIdentidadRepository.deleteById(idDocumentoIdentidad);
        return true;
    }
}
