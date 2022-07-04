package com.upc.chinoesquina.dataaccess.interfaces;


import com.upc.chinoesquina.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaDA extends JpaRepository<Venta, Integer> {
}
