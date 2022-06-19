package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClienteDA extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNroDocumento(String nroDocumento);
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByApellido(String apellido);
    List<Cliente> findByNroDocumentoContains(String nroDocumento);
    List<Cliente> findByDocumentoIdentidadIdDocumentoIdentidad(Integer idDocumentoIdentidad);
    @Query("SELECT c FROM Cliente c WHERE c.documentoIdentidad.idDocumentoIdentidad = :idDocumentoIdentidad AND c.nroDocumento LIKE %:nroDocumento%")
    List<Cliente> findByIdDocumentoIdentidadAndNroDocumento(Integer idDocumentoIdentidad, String nroDocumento);
    @Query(value = "EXEC Cliente_ListarEmails :email", nativeQuery = true)
    List<Cliente> findByEmail(String email);
}
