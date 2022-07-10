package com.upc.chinoesquina.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "venta_promocion")
public class VentaPromocion {
    @EmbeddedId
    private VentaPromocionKey idVentaPromocion;

    @ManyToOne
    @MapsId("idVenta")
    @JoinColumn(name = "id_venta")
    @JsonIgnore
    private Venta venta;

    @ManyToOne
    @MapsId("idPromocion")
    @JoinColumn(name = "id_promocion")
    @JsonIgnore
    private Promocion promocion;

    private Integer puntos;

    private Boolean eliminado;

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public VentaPromocionKey getIdVentaPromocion() {
        return idVentaPromocion;
    }

    public void setIdVentaPromocion(VentaPromocionKey idVentaPromocion) {
        this.idVentaPromocion = idVentaPromocion;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
}
