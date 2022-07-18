package com.upc.chinoesquina.repositories;

import com.upc.chinoesquina.models.DocumentoIdentidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoIdentidadRepository extends JpaRepository<DocumentoIdentidad, Integer> {
}
