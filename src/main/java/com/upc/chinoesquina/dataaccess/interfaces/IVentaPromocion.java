package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.VentaPromocion;
import com.upc.chinoesquina.models.VentaPromocionKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaPromocion extends JpaRepository<VentaPromocion, VentaPromocionKey> {
}
