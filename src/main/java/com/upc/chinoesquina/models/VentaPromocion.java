package com.upc.chinoesquina.models;


import javax.persistence.*;

@Entity
@Table(name = "venta_promocion")
public class VentaPromocion extends AuditoriaData {
    @EmbeddedId
    private VentaPromocionKey idVentaPromocion;

    @ManyToOne
    @MapsId("id_venta")
    @JoinColumn(name = "id_venta")
    private Venta venta;

    @ManyToOne
    @MapsId("id_promocion")
    @JoinColumn(name = "id_promocion")
    private Promocion promocion;

    private Integer puntos;

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
