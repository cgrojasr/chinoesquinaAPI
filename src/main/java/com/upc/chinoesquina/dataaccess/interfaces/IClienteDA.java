package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IClienteDA extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByNombreAndApellido(String nombre, String apellido);
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findByApellido(String apellido);
}
