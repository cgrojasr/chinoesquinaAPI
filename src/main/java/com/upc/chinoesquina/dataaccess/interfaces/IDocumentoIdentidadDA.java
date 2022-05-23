package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocumentoIdentidadDA extends JpaRepository<DocumentoIdentidad, Integer> {
}
