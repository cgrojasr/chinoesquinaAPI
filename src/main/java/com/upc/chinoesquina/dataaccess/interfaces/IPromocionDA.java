package com.upc.chinoesquina.dataaccess.interfaces;

import com.upc.chinoesquina.models.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface IPromocionDA extends JpaRepository<Promocion, Integer> {
    List<Promocion> findByNombre(String nombre);
    List<Promocion> findByDescripcion(String descripcion);
    List<Promocion> findByNombreAndDescripcion(String nombre, String descripcion);
    List<Promocion> findByDescripcionContains(String descripcion);
    List<Promocion> findByNombreContains(String nombre);
    @Query("SELECT p FROM Promocion p WHERE p.fechaInicio >= CONVERT(DATETIME, :fecha, 101) AND p.fechaFinal <= CONVERT(DATETIME, :fecha, 101) AND p.activo = 1")
    List<Promocion> findByFecha(Date fecha);
}
