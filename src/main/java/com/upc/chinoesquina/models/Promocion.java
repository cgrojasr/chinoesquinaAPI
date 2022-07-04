package com.upc.chinoesquina.models;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "promocion")
public class    Promocion extends AuditoriaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_promocion")
    private Integer idPromocion;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "promocion")
    private Set<VentaPromocion> ventaPromocion;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_final")
    private Date fechaFinal;

    public Integer getIdPromocion() {
        return idPromocion;
    }

    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Set<VentaPromocion> getVentaPromocion() {
        return ventaPromocion;
    }

    public void setVentaPromocion(Set<VentaPromocion> ventaPromocion) {
        this.ventaPromocion = ventaPromocion;
    }
}
