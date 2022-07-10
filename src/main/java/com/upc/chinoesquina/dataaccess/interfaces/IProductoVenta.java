package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.ProductoVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoVenta extends JpaRepository<ProductoVenta, Integer> {
}
