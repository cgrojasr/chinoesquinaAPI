package com.upc.chinoesquina.repositories;

import com.upc.chinoesquina.models.ProductoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoVentaRepository extends JpaRepository<ProductoVenta, Integer> {
}
