package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDA extends JpaRepository<Cliente, Integer> {
}
