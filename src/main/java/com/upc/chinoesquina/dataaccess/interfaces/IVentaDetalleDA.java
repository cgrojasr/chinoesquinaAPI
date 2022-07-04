package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.VentaDetalle;
import com.upc.chinoesquina.models.VentaProductoKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaDetalleDA extends JpaRepository<VentaDetalle, VentaProductoKey> {
}
