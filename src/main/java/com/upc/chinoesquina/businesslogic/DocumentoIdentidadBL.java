package com.upc.chinoesquina.businesslogic;

import com.upc.chinoesquina.dataaccess.DocumentoIdentidadDA;
import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoIdentidadBL {
    @Autowired
    private DocumentoIdentidadDA objDocumentoIdentidadDA;

    public List<DocumentoIdentidad> findAll(){
        return objDocumentoIdentidadDA.findAll();
    }
}
