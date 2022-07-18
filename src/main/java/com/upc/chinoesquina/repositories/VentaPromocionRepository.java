package com.upc.chinoesquina.repositories;

import com.upc.chinoesquina.models.VentaPromocion;
import com.upc.chinoesquina.models.VentaPromocionKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaPromocionRepository extends JpaRepository<VentaPromocion, VentaPromocionKey> {
}
