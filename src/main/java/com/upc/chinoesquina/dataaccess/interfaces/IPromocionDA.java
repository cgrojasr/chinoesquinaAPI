package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPromocionDA extends JpaRepository<Promocion, Integer> {
}
