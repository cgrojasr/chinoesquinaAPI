package com.upc.chinoesquina.repositories;

import com.upc.chinoesquina.models.VentaDetalle;
import com.upc.chinoesquina.models.VentaProductoKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaDetalleRepository extends JpaRepository<VentaDetalle, VentaProductoKey> {
}
