package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.DocumentoIdentidadDA;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoIdentidadBL {
    @Autowired
    private DocumentoIdentidadDA objDocumentoIdentidadDA;

    public List<DocumentoIdentidad> ListarTodo(){
        return objDocumentoIdentidadDA.ListarTodo();
    }

    public DocumentoIdentidad Registrar(DocumentoIdentidad objDocumentoIdentidad){
        return objDocumentoIdentidadDA.Registrar(objDocumentoIdentidad);
    }

    public DocumentoIdentidad Modificar(DocumentoIdentidad objDocumentoIdentidad){
        return objDocumentoIdentidadDA.Modificar(objDocumentoIdentidad);
    }

    public Optional<DocumentoIdentidad> BuscarPorId(Integer idDocumentoIdentidad){
        return objDocumentoIdentidadDA.BuscarPorId(idDocumentoIdentidad);
    }

    public Boolean Eliminar(Integer idDocumentoIdentidad){
        return objDocumentoIdentidadDA.Elimininar(idDocumentoIdentidad);
    }
}
