package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface IClienteDA extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNroDocumento(String nroDocumento);
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByApellido(String apellido);
    List<Cliente> findByNroDocumentoContains(String nroDocumento);
    @Query("SELECT c FROM Cliente c WHERE c.documentoIdentidad.idDocumentoIdentidad = :idDocumentoIdentidad")
    List<Cliente> findByIdDocumentoIdentidad(Integer idDocumentoIdentidad);
    @Query(value = "EXEC cliente_buscar_correo :correo" +
            "", nativeQuery = true)
    List<Cliente> findByCorreo(String correo);
}
